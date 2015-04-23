package SixesWild.com.mimas.sixeswild.sixeswild;

import java.io.File;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import SixesWild.com.mimas.sixeswild.entities.EliminationLevel;
import SixesWild.com.mimas.sixeswild.entities.Level;
import SixesWild.com.mimas.sixeswild.entities.LevelHighScore;
import SixesWild.com.mimas.sixeswild.entities.LevelType;
import SixesWild.com.mimas.sixeswild.entities.LightningLevel;
import SixesWild.com.mimas.sixeswild.entities.NullTile;
import SixesWild.com.mimas.sixeswild.entities.NumberTile;
import SixesWild.com.mimas.sixeswild.entities.PointThresholds;
import SixesWild.com.mimas.sixeswild.entities.PuzzleLevel;
import SixesWild.com.mimas.sixeswild.entities.ReleaseLevel;
import SixesWild.com.mimas.sixeswild.entities.SixTile;
import SixesWild.com.mimas.sixeswild.entities.TargetTile;
import SixesWild.com.mimas.sixeswild.entities.Tile;
import SixesWild.com.mimas.sixeswild.entities.UserProfile;

public final class XMLParser {

	/**
	 * Takes in a file name and extracts the information from it to create a
	 * level.
	 * 
	 * @param fileName
	 *            A String of the file name.
	 * @return A level with all the attributes taken from the xml file.
	 */
	public static Level fileToLevel(String fileName) {
		try {

			// Set up xml file for reading
			File fXmlFile = new File(fileName);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();

			// ******* level number not used anywhere ???? ******
			// Get level number
			String levelNumber = doc.getElementsByTagName("Level").item(0)
					.getAttributes().item(0).getNodeValue();

			// Get level name
			String levelName = doc.getElementsByTagName("Name").item(0)
					.getTextContent();

			// Get level type
			String levelType = doc.getElementsByTagName("Type").item(0)
					.getTextContent();

			// Get list of tile frequencies
			ArrayList<Double> tileFrequencies = new ArrayList<Double>();
			NodeList tileFrequenciesNodeList = ((Element) doc
					.getElementsByTagName("TileFrequency").item(0))
					.getElementsByTagName("Tile");
			for (int i = 0; i < tileFrequenciesNodeList.getLength(); i++) {
				tileFrequencies.add(Double.parseDouble(tileFrequenciesNodeList
						.item(i).getAttributes().item(0).getNodeValue()));
			}

			// Get list of multiplier frequencies
			ArrayList<Double> multiplierFrequencies = new ArrayList<Double>();
			NodeList multiplierFrequenciesNodeList = ((Element) doc
					.getElementsByTagName("TileFrequency").item(0))
					.getElementsByTagName("Multiplier");
			for (int i = 0; i < multiplierFrequenciesNodeList.getLength(); i++) {
				multiplierFrequencies.add(Double
						.parseDouble(multiplierFrequenciesNodeList.item(i)
								.getAttributes().item(0).getNodeValue()));
			}

			// ******** no way to access special moves in levels ???????
			// *********
			// Get special move constraints
			int resetBoardMoves = Integer.parseInt(doc
					.getElementsByTagName("ResetBoard").item(0)
					.getTextContent());
			int swapTileMoves = Integer.parseInt(doc
					.getElementsByTagName("SwapTile").item(0).getTextContent());
			int removeTileMoves = Integer.parseInt(doc
					.getElementsByTagName("RemoveTile").item(0)
					.getTextContent());
			int otherMoveMoves = Integer
					.parseInt(doc.getElementsByTagName("OtherMove").item(0)
							.getTextContent());

			// Get point thresholds
			ArrayList<Integer> points = new ArrayList<Integer>();
			NodeList pointThresholdNodeList = ((Element) doc
					.getElementsByTagName("PointThresholds").item(0))
					.getElementsByTagName("Point");
			for (int i = 0; i < pointThresholdNodeList.getLength(); i++) {
				points.add(Integer.parseInt(pointThresholdNodeList.item(i)
						.getTextContent()));
			}

			PointThresholds pointThresholds = new PointThresholds(
					points.get(0), points.get(1), points.get(2));

			// Get regular move constraints
			int moveCount = Integer
					.parseInt(doc.getElementsByTagName("MoveCount").item(0)
							.getTextContent());
			int timer = Integer.parseInt(doc.getElementsByTagName("Timer")
					.item(0).getTextContent());

			// Get board shape and attributes
			Tile tiles[][] = new Tile[9][9];
			NodeList boardRowsNodeList = ((Element) doc.getElementsByTagName(
					"Board").item(0)).getElementsByTagName("Row");
			for (int i = 0; i < boardRowsNodeList.getLength(); i++) {
				String row = boardRowsNodeList.item(i).getTextContent();
				StringTokenizer rowTokenized = new StringTokenizer(row);
				int j = 0;
				while (rowTokenized.hasMoreTokens()) {
					char c = rowTokenized.nextToken().charAt(0);
					Tile t;
					if (c == 'N') {
						t = new NumberTile(1, 1);
					} else if (c == 'U') {
						t = new NullTile();
					} else if (c == 'T') {
						t = new TargetTile();
					} else if (c == 'S') {
						t = new SixTile();
					} else {
						throw new Exception("Invalid tile type!");
					}
					tiles[i][j] = t;
					j++;
				}
			}

			// Create level using all the information read
			if (levelType.equals("Puzzle")) {
				return new PuzzleLevel(tileFrequencies, multiplierFrequencies,
						LevelType.PUZZLE, levelName, tiles, pointThresholds,
						moveCount);
			} else if (levelType.equals("Release")) {
				return new ReleaseLevel(tileFrequencies, multiplierFrequencies,
						LevelType.RELEASE, levelName, tiles, pointThresholds,
						moveCount);
			} else if (levelType.equals("Lightning")) {
				return new LightningLevel(tileFrequencies,
						multiplierFrequencies, LevelType.LIGHTNING, levelName,
						tiles, pointThresholds, timer);
			} else if (levelType.equals("Elimination")) {
				return new EliminationLevel(tileFrequencies,
						multiplierFrequencies, LevelType.ELIMINATION,
						levelName, tiles, pointThresholds, moveCount);
			} else {
				throw new Exception("Invalid Level Type!");
			}

		} catch (Exception e) {
			System.out.println("FILE NOT FOUND!");
		}

		return null;
	}

	/**
	 * Writes a level to an output file.
	 * 
	 * @param level
	 *            The level object to save to file.
	 * @return true if successful; false otherwise.
	 */
	public static boolean levelToFile(Level level) {

		return false;
	}

	/**
	 * Takes in a file name and extracts the information from it to create a
	 * user profile.
	 * 
	 * @param fileName
	 *            A String of the file name.
	 * @return A UserProfile with all the attributes taken from the xml file.
	 */
	public static UserProfile fileToUserProfile(String fileName) {
		try {
			// Set up xml file for reading
			File fXmlFile = new File(fileName);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();

			// Get user Name
			String userName = doc.getElementsByTagName("UserProfile").item(0)
					.getAttributes().item(0).getNodeValue();

			UserProfile userProfile = new UserProfile(userName);

			// Get highest level unlocked by user
			int highestLevelUnlocked = Integer.parseInt(doc
					.getElementsByTagName("HighestLevelUnlocked").item(0)
					.getTextContent());
			userProfile.setHighestLevel(highestLevelUnlocked);

			// Get list of badges that the user has unlocked
			ArrayList<String> badges = new ArrayList<String>();
			NodeList badgeNodeList = ((Element) doc.getElementsByTagName(
					"Badges").item(0)).getElementsByTagName("Name");
			for (int i = 0; i < badgeNodeList.getLength(); i++) {
				badges.add(badgeNodeList.item(i).getTextContent());
				userProfile.addBadgeEarned(badgeNodeList.item(i)
						.getTextContent());
			}

			// Get list of levels, their high scores, and their star equivalents
			NodeList levelScoreNodeList = ((Element) doc.getElementsByTagName(
					"LevelScores").item(0)).getElementsByTagName("Level");
			ArrayList<LevelHighScore> levelHighScores = new ArrayList<LevelHighScore>();
			for (int i = 0; i < levelScoreNodeList.getLength(); i++) {

				levelHighScores.add(new LevelHighScore(Integer
						.parseInt(levelScoreNodeList.item(i).getAttributes()
								.item(0).getTextContent()), Integer
						.parseInt(levelScoreNodeList.item(i).getAttributes()
								.item(1).getTextContent()), Integer
						.parseInt(levelScoreNodeList.item(i).getAttributes()
								.item(2).getTextContent())));

				userProfile.addLevelHighScore(
						Integer.parseInt(levelScoreNodeList.item(i)
								.getAttributes().item(0).getTextContent()),
						Integer.parseInt(levelScoreNodeList.item(i)
								.getAttributes().item(1).getTextContent()),
						Integer.parseInt(levelScoreNodeList.item(i)
								.getAttributes().item(2).getTextContent()));
			}

			// Get the aesthetic the player uses
			String aesthetic = doc.getElementsByTagName("Aesthetic").item(0)
					.getTextContent();

			userProfile.setAestheticName(aesthetic);

			return userProfile;

		} catch (Exception e) {
			System.out.println("FILE NOT FOUND!");
		}

		return null;
	}

	/**
	 * Writes a user profile to an output file.
	 * 
	 * @param userProfile
	 *            The user profile to save to file.
	 * @return true if successful; false otherwise.
	 */
	public static boolean userProfileToFile(UserProfile userProfile) {

		return false;
	}
}