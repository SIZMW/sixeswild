package SixesWild.com.mimas.sixeswild.boundaries;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import SixesWild.com.mimas.sixeswild.entities.LevelType;
import SixesWild.com.mimas.sixeswild.entities.TileType;

/**
 * This class represents the level settings panel in the level builder.
 *
 * @author Yahel Nachum
 */
public class BuilderSettingsPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	protected JLabel levelSettingLabel;

	protected JPanel generalSettingsPanel;
	protected JLabel nameLabel;
	protected JLabel levelTypeLabel;
	protected JLabel movesLabel;
	protected JLabel timerLabel;
	protected JTextField userLevelNameTextField;
	protected JTextField movesTextField;
	protected JTextField timerTextField;
	protected JComboBox<String> levelTypeComboBox;

	protected JPanel frequencyPanel;
	protected JLabel frequencyLabel;
	protected JLabel onesLabel;
	protected JLabel twosLabel;
	protected JLabel threesLabel;
	protected JLabel foursLabel;
	protected JLabel fivesLabel;
	protected JLabel sixesLabel;
	protected JLabel xtwoMultiplierLabel;
	protected JLabel xthreeMultiplierLabel;
	protected JTextField onesTextField;
	protected JTextField twosTextField;
	protected JTextField threesTextField;
	protected JTextField foursTextField;
	protected JTextField fivesTextField;
	protected JTextField sixesTextField;
	protected JTextField twoMultiplierTextField;
	protected JTextField threeMultiplierTextField;

	protected JPanel specialMovesPanel;
	protected JLabel specialMovesLabel;
	protected JLabel specialMoveOnePanel;
	protected JLabel specialMoveTwoPanel;
	protected JLabel specialMoveThreePanel;
	protected JLabel specialMoveFourPanel;
	protected JLabel specialMoveOneLabel;
	protected JLabel specialMoveTwoLabel;
	protected JLabel specialMoveThreeLabel;
	protected JLabel specialMoveFourLabel;
	protected JButton specialMoveOneMinusButton;
	protected JButton specialMoveOnePlusButton;
	protected JButton specialMoveTwoMinusButton;
	protected JButton specialMoveTwoPlusButton;
	protected JButton specialMoveThreeMinusButton;
	protected JButton specialMoveThreePlusButton;
	protected JButton specialMoveFourMinusButton;
	protected JButton specialMoveFourPlusButton;

	protected JPanel pointThresholdsPanel;
	protected JLabel pointThresholdsLabel;
	protected JLabel oneStarScoreLabel;
	protected JLabel twoStarScoreLabel;
	protected JLabel threeStarScoreLabel;
	protected JTextField oneStarScoreTextField;
	protected JTextField twoStarScoreTextField;
	protected JTextField threeStarScoreTextField;

	protected JPanel tileSettingsPanel;
	protected JLabel tileSettingsLabel;
	protected JLabel tileTypeLabel;
	protected JComboBox<String> tileTypeComboBox;

	/**
	 * Creates a BuilderSettingsPanel instance.
	 */
	public BuilderSettingsPanel() {

		// Layout for panel
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 10.0, 1.0,
				Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 1.0, 1.0, 5.0, 1.0, 5.0,
				1.0, 5.0, 1.0, 5.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		// Level settings label
		levelSettingLabel = new JLabel("Level Settings");
		levelSettingLabel.setHorizontalAlignment(SwingConstants.CENTER);
		levelSettingLabel
				.setBorder(BorderFactory.createLineBorder(Color.black));
		levelSettingLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));

		// Layout for level settings label
		GridBagConstraints gbc_levelSettingLabel = new GridBagConstraints();
		gbc_levelSettingLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_levelSettingLabel.insets = new Insets(0, 0, 5, 5);
		gbc_levelSettingLabel.gridx = 1;
		gbc_levelSettingLabel.gridy = 1;
		add(levelSettingLabel, gbc_levelSettingLabel);

		// General settings panel
		generalSettingsPanel = new JPanel();
		GridBagConstraints gbc_generalSettingsPanel = new GridBagConstraints();
		gbc_generalSettingsPanel.insets = new Insets(0, 0, 5, 5);
		gbc_generalSettingsPanel.fill = GridBagConstraints.BOTH;
		gbc_generalSettingsPanel.gridx = 1;
		gbc_generalSettingsPanel.gridy = 3;
		add(generalSettingsPanel, gbc_generalSettingsPanel);

		// Layout for general settings panel
		GridBagLayout gbl_generalSettingsPanel = new GridBagLayout();
		gbl_generalSettingsPanel.columnWidths = new int[] { 0, 0, 0, 0, 0 };
		gbl_generalSettingsPanel.rowHeights = new int[] { 0, 0, 0, 0, 0 };
		gbl_generalSettingsPanel.columnWeights = new double[] { 1.0, 1.0, 1.0,
				1.0, Double.MIN_VALUE };
		gbl_generalSettingsPanel.rowWeights = new double[] { 0.0, 0.0, 0.0,
				0.0, Double.MIN_VALUE };
		generalSettingsPanel.setLayout(gbl_generalSettingsPanel);

		// Name label
		nameLabel = new JLabel("Name");
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nameLabel.setBorder(BorderFactory.createLineBorder(Color.black));
		nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));

		// Layout for name label
		GridBagConstraints gbc_nameLabel = new GridBagConstraints();
		gbc_nameLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_nameLabel.gridwidth = 4;
		gbc_nameLabel.insets = new Insets(0, 0, 5, 0);
		gbc_nameLabel.gridx = 0;
		gbc_nameLabel.gridy = 0;
		generalSettingsPanel.add(nameLabel, gbc_nameLabel);

		// User level name text field
		userLevelNameTextField = new JTextField();
		userLevelNameTextField.setText("User Level Name");

		// Layout for user level name text field
		GridBagConstraints gbc_userLevelNameTextField = new GridBagConstraints();
		gbc_userLevelNameTextField.gridwidth = 4;
		gbc_userLevelNameTextField.insets = new Insets(0, 0, 5, 0);
		gbc_userLevelNameTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_userLevelNameTextField.gridx = 0;
		gbc_userLevelNameTextField.gridy = 1;
		generalSettingsPanel.add(userLevelNameTextField,
				gbc_userLevelNameTextField);
		userLevelNameTextField.setColumns(10);

		// Level type label
		levelTypeLabel = new JLabel("Level Type");
		levelTypeLabel.setPreferredSize(new Dimension(52, 20));
		levelTypeLabel.setMinimumSize(new Dimension(52, 20));
		levelTypeLabel.setBorder(BorderFactory.createLineBorder(Color.black));

		// Layout for level type label
		GridBagConstraints gbc_levelTypeLabel = new GridBagConstraints();
		gbc_levelTypeLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_levelTypeLabel.gridwidth = 2;
		gbc_levelTypeLabel.insets = new Insets(0, 0, 5, 5);
		gbc_levelTypeLabel.gridx = 0;
		gbc_levelTypeLabel.gridy = 2;
		generalSettingsPanel.add(levelTypeLabel, gbc_levelTypeLabel);

		// Level type combo box
		levelTypeComboBox = new JComboBox<String>();
		levelTypeComboBox.addItem(LevelType.PUZZLE.toString());
		levelTypeComboBox.addItem(LevelType.ELIMINATION.toString());
		levelTypeComboBox.addItem(LevelType.LIGHTNING.toString());
		levelTypeComboBox.addItem(LevelType.RELEASE.toString());
		levelTypeComboBox.setSelectedIndex(0);

		// Layout for level type combo box
		GridBagConstraints gbc_levelTypeComboBox = new GridBagConstraints();
		gbc_levelTypeComboBox.insets = new Insets(0, 0, 5, 0);
		gbc_levelTypeComboBox.gridwidth = 2;
		gbc_levelTypeComboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_levelTypeComboBox.gridx = 2;
		gbc_levelTypeComboBox.gridy = 2;
		generalSettingsPanel.add(levelTypeComboBox, gbc_levelTypeComboBox);

		// Moves label
		movesLabel = new JLabel("Moves");
		movesLabel.setPreferredSize(new Dimension(31, 20));
		movesLabel.setMinimumSize(new Dimension(31, 20));
		movesLabel.setBorder(BorderFactory.createLineBorder(Color.black));

		// Layout for moves label
		GridBagConstraints gbc_movesLabe = new GridBagConstraints();
		gbc_movesLabe.fill = GridBagConstraints.HORIZONTAL;
		gbc_movesLabe.insets = new Insets(0, 0, 0, 5);
		gbc_movesLabe.gridx = 0;
		gbc_movesLabe.gridy = 3;
		generalSettingsPanel.add(movesLabel, gbc_movesLabe);

		// Moves text field
		movesTextField = new JTextField();
		movesTextField.setText("5");

		// Layout for moves text field
		GridBagConstraints gbc_movesTextField = new GridBagConstraints();
		gbc_movesTextField.insets = new Insets(0, 0, 0, 5);
		gbc_movesTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_movesTextField.gridx = 1;
		gbc_movesTextField.gridy = 3;
		generalSettingsPanel.add(movesTextField, gbc_movesTextField);
		movesTextField.setColumns(10);

		// Timer label
		timerLabel = new JLabel("Timer");
		timerLabel.setPreferredSize(new Dimension(26, 20));
		timerLabel.setMinimumSize(new Dimension(26, 20));
		timerLabel.setBorder(BorderFactory.createLineBorder(Color.black));

		// Layout for timer label
		GridBagConstraints gbc_timerLabel = new GridBagConstraints();
		gbc_timerLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_timerLabel.insets = new Insets(0, 0, 0, 5);
		gbc_timerLabel.gridx = 2;
		gbc_timerLabel.gridy = 3;
		generalSettingsPanel.add(timerLabel, gbc_timerLabel);

		// Timer text field
		timerTextField = new JTextField();
		timerTextField.setText("5");
		GridBagConstraints gbc_timerTextField = new GridBagConstraints();

		// Layout for timer text field
		gbc_timerTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_timerTextField.gridx = 3;
		gbc_timerTextField.gridy = 3;
		generalSettingsPanel.add(timerTextField, gbc_timerTextField);
		timerTextField.setColumns(10);

		// Frequency panel
		frequencyPanel = new JPanel();

		// Layout for frequency panel
		GridBagConstraints gbc_frequencyPanel = new GridBagConstraints();
		gbc_frequencyPanel.insets = new Insets(0, 0, 5, 5);
		gbc_frequencyPanel.fill = GridBagConstraints.BOTH;
		gbc_frequencyPanel.gridx = 1;
		gbc_frequencyPanel.gridy = 5;
		add(frequencyPanel, gbc_frequencyPanel);

		GridBagLayout gbl_frequencyPanel = new GridBagLayout();
		gbl_frequencyPanel.columnWidths = new int[] { 20, 20, 20, 20, 20, 20, 0 };
		gbl_frequencyPanel.rowHeights = new int[] { 0, 0, 0, 0, 0 };
		gbl_frequencyPanel.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0,
				1.0, 1.0, Double.MIN_VALUE };
		gbl_frequencyPanel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		frequencyPanel.setLayout(gbl_frequencyPanel);

		// Frequency label
		frequencyLabel = new JLabel("Frequency of Tiles");
		frequencyLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frequencyLabel.setBorder(BorderFactory.createLineBorder(Color.black));
		frequencyLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));

		// Layout for frequency label
		GridBagConstraints gbc_frequencyLabel = new GridBagConstraints();
		gbc_frequencyLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_frequencyLabel.gridwidth = 6;
		gbc_frequencyLabel.insets = new Insets(0, 0, 5, 0);
		gbc_frequencyLabel.gridx = 0;
		gbc_frequencyLabel.gridy = 0;
		frequencyPanel.add(frequencyLabel, gbc_frequencyLabel);

		// Ones label
		onesLabel = new JLabel("1's");
		onesLabel.setPreferredSize(new Dimension(20, 14));
		onesLabel.setMinimumSize(new Dimension(20, 20));
		onesLabel.setBorder(BorderFactory.createLineBorder(Color.black));

		// Layout for ones label
		GridBagConstraints gbc_onesLabel = new GridBagConstraints();
		gbc_onesLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_onesLabel.insets = new Insets(0, 0, 5, 5);
		gbc_onesLabel.gridx = 0;
		gbc_onesLabel.gridy = 1;
		frequencyPanel.add(onesLabel, gbc_onesLabel);

		// Ones text field
		onesTextField = new JTextField();
		onesTextField.setPreferredSize(new Dimension(20, 20));
		onesTextField.setMinimumSize(new Dimension(20, 20));
		onesTextField.setText("0");

		// Layout for ones text field
		GridBagConstraints gbc_onesTextField = new GridBagConstraints();
		gbc_onesTextField.insets = new Insets(0, 0, 5, 5);
		gbc_onesTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_onesTextField.gridx = 1;
		gbc_onesTextField.gridy = 1;
		frequencyPanel.add(onesTextField, gbc_onesTextField);
		onesTextField.setColumns(10);

		// Twos label
		twosLabel = new JLabel("2's");
		twosLabel.setPreferredSize(new Dimension(20, 14));
		twosLabel.setMinimumSize(new Dimension(20, 20));
		twosLabel.setBorder(BorderFactory.createLineBorder(Color.black));

		// Layout for twos label
		GridBagConstraints gbc_twosLabel = new GridBagConstraints();
		gbc_twosLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_twosLabel.insets = new Insets(0, 0, 5, 5);
		gbc_twosLabel.gridx = 2;
		gbc_twosLabel.gridy = 1;
		frequencyPanel.add(twosLabel, gbc_twosLabel);

		// Twos text field
		twosTextField = new JTextField();
		twosTextField.setPreferredSize(new Dimension(20, 20));
		twosTextField.setMinimumSize(new Dimension(20, 20));
		twosTextField.setColumns(10);
		twosTextField.setText("0");

		// Layout for twos text field
		GridBagConstraints gbc_twosTextField = new GridBagConstraints();
		gbc_twosTextField.insets = new Insets(0, 0, 5, 5);
		gbc_twosTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_twosTextField.gridx = 3;
		gbc_twosTextField.gridy = 1;
		frequencyPanel.add(twosTextField, gbc_twosTextField);

		// Threes label
		threesLabel = new JLabel("3's");
		threesLabel.setPreferredSize(new Dimension(20, 14));
		threesLabel.setMinimumSize(new Dimension(20, 20));
		threesLabel.setBorder(BorderFactory.createLineBorder(Color.black));

		// Layout for threes label
		GridBagConstraints gbc_threesLabel = new GridBagConstraints();
		gbc_threesLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_threesLabel.insets = new Insets(0, 0, 5, 5);
		gbc_threesLabel.gridx = 4;
		gbc_threesLabel.gridy = 1;
		frequencyPanel.add(threesLabel, gbc_threesLabel);

		// Threes text field
		threesTextField = new JTextField();
		threesTextField.setPreferredSize(new Dimension(20, 20));
		threesTextField.setMinimumSize(new Dimension(20, 20));
		threesTextField.setColumns(10);
		threesTextField.setText("0");

		// Layout for threes text field
		GridBagConstraints gbc_threesTextField = new GridBagConstraints();
		gbc_threesTextField.insets = new Insets(0, 0, 5, 0);
		gbc_threesTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_threesTextField.gridx = 5;
		gbc_threesTextField.gridy = 1;
		frequencyPanel.add(threesTextField, gbc_threesTextField);

		// Fours label
		foursLabel = new JLabel("4's");
		foursLabel.setPreferredSize(new Dimension(20, 14));
		foursLabel.setMinimumSize(new Dimension(20, 20));
		foursLabel.setBorder(BorderFactory.createLineBorder(Color.black));

		// Layout for fours label
		GridBagConstraints gbc_foursLabel = new GridBagConstraints();
		gbc_foursLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_foursLabel.insets = new Insets(0, 0, 5, 5);
		gbc_foursLabel.gridx = 0;
		gbc_foursLabel.gridy = 2;
		frequencyPanel.add(foursLabel, gbc_foursLabel);

		// Fours text field
		foursTextField = new JTextField();
		foursTextField.setPreferredSize(new Dimension(20, 20));
		foursTextField.setMinimumSize(new Dimension(20, 20));
		foursTextField.setText("0");

		// Layout for fours text field
		GridBagConstraints gbc_foursTextField = new GridBagConstraints();
		gbc_foursTextField.insets = new Insets(0, 0, 5, 5);
		gbc_foursTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_foursTextField.gridx = 1;
		gbc_foursTextField.gridy = 2;
		frequencyPanel.add(foursTextField, gbc_foursTextField);
		foursTextField.setColumns(10);

		// Fives label
		fivesLabel = new JLabel("5's");
		fivesLabel.setPreferredSize(new Dimension(20, 14));
		fivesLabel.setMinimumSize(new Dimension(20, 20));
		fivesLabel.setBorder(BorderFactory.createLineBorder(Color.black));

		// Layout for fives label
		GridBagConstraints gbc_fivesLabel = new GridBagConstraints();
		gbc_fivesLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_fivesLabel.insets = new Insets(0, 0, 5, 5);
		gbc_fivesLabel.gridx = 2;
		gbc_fivesLabel.gridy = 2;
		frequencyPanel.add(fivesLabel, gbc_fivesLabel);

		// Fives text field
		fivesTextField = new JTextField();
		fivesTextField.setPreferredSize(new Dimension(20, 20));
		fivesTextField.setMinimumSize(new Dimension(20, 20));
		fivesTextField.setColumns(10);
		fivesTextField.setText("0");

		// Layout for fives text field
		GridBagConstraints gbc_fivesTextField = new GridBagConstraints();
		gbc_fivesTextField.insets = new Insets(0, 0, 5, 5);
		gbc_fivesTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_fivesTextField.gridx = 3;
		gbc_fivesTextField.gridy = 2;
		frequencyPanel.add(fivesTextField, gbc_fivesTextField);

		// Sixes label
		sixesLabel = new JLabel("6's");
		sixesLabel.setPreferredSize(new Dimension(20, 14));
		sixesLabel.setMinimumSize(new Dimension(20, 20));
		sixesLabel.setBorder(BorderFactory.createLineBorder(Color.black));

		// Layout for sixes label
		GridBagConstraints gbc_sixesLabel = new GridBagConstraints();
		gbc_sixesLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_sixesLabel.insets = new Insets(0, 0, 5, 5);
		gbc_sixesLabel.gridx = 4;
		gbc_sixesLabel.gridy = 2;
		frequencyPanel.add(sixesLabel, gbc_sixesLabel);

		// Sixes text field
		sixesTextField = new JTextField();
		sixesTextField.setPreferredSize(new Dimension(20, 20));
		sixesTextField.setMinimumSize(new Dimension(20, 20));
		sixesTextField.setColumns(10);
		sixesTextField.setText("0");

		// Layout for sixes text field
		GridBagConstraints gbc_sixesTextField = new GridBagConstraints();
		gbc_sixesTextField.insets = new Insets(0, 0, 5, 0);
		gbc_sixesTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_sixesTextField.gridx = 5;
		gbc_sixesTextField.gridy = 2;
		frequencyPanel.add(sixesTextField, gbc_sixesTextField);

		// X two multiplier label
		xtwoMultiplierLabel = new JLabel("x2 Multiplier");
		xtwoMultiplierLabel.setMinimumSize(new Dimension(40, 20));
		xtwoMultiplierLabel.setPreferredSize(new Dimension(40, 20));
		xtwoMultiplierLabel.setBorder(BorderFactory
				.createLineBorder(Color.black));

		// Layout for X two multiplier label
		GridBagConstraints gbc_xtwosMultiplierLabel = new GridBagConstraints();
		gbc_xtwosMultiplierLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_xtwosMultiplierLabel.gridwidth = 2;
		gbc_xtwosMultiplierLabel.insets = new Insets(0, 0, 0, 5);
		gbc_xtwosMultiplierLabel.gridx = 0;
		gbc_xtwosMultiplierLabel.gridy = 3;
		frequencyPanel.add(xtwoMultiplierLabel, gbc_xtwosMultiplierLabel);

		// X two multiplier text field
		twoMultiplierTextField = new JTextField();
		twoMultiplierTextField.setPreferredSize(new Dimension(20, 20));
		twoMultiplierTextField.setMinimumSize(new Dimension(20, 20));
		twoMultiplierTextField.setColumns(10);
		twoMultiplierTextField.setText("0");

		// Layout for X two multiplier text field
		GridBagConstraints gbc_xtwoMultiplierTextField = new GridBagConstraints();
		gbc_xtwoMultiplierTextField.insets = new Insets(0, 0, 0, 5);
		gbc_xtwoMultiplierTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_xtwoMultiplierTextField.gridx = 2;
		gbc_xtwoMultiplierTextField.gridy = 3;
		frequencyPanel.add(twoMultiplierTextField, gbc_xtwoMultiplierTextField);

		// X three multiplier label
		xthreeMultiplierLabel = new JLabel("x3 Multiplier");
		xthreeMultiplierLabel.setMinimumSize(new Dimension(40, 20));
		xthreeMultiplierLabel.setPreferredSize(new Dimension(40, 20));
		xthreeMultiplierLabel.setBorder(BorderFactory
				.createLineBorder(Color.black));

		// Layout for X three multiplier label
		GridBagConstraints gbc_xthreeMultiplierLabel = new GridBagConstraints();
		gbc_xthreeMultiplierLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_xthreeMultiplierLabel.gridwidth = 2;
		gbc_xthreeMultiplierLabel.insets = new Insets(0, 0, 0, 5);
		gbc_xthreeMultiplierLabel.gridx = 3;
		gbc_xthreeMultiplierLabel.gridy = 3;
		frequencyPanel.add(xthreeMultiplierLabel, gbc_xthreeMultiplierLabel);

		// X three multiplier text field
		threeMultiplierTextField = new JTextField();
		threeMultiplierTextField.setPreferredSize(new Dimension(20, 20));
		threeMultiplierTextField.setMinimumSize(new Dimension(20, 20));
		threeMultiplierTextField.setColumns(10);
		threeMultiplierTextField.setText("0");

		// Layout for X three multiplier text field
		GridBagConstraints gbc_xthreeMultiplierTextField = new GridBagConstraints();
		gbc_xthreeMultiplierTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_xthreeMultiplierTextField.gridx = 5;
		gbc_xthreeMultiplierTextField.gridy = 3;
		frequencyPanel.add(threeMultiplierTextField,
				gbc_xthreeMultiplierTextField);

		// Special moves panel
		specialMovesPanel = new JPanel();
		GridBagConstraints gbc_specialMovesPanel = new GridBagConstraints();
		gbc_specialMovesPanel.insets = new Insets(0, 0, 5, 5);
		gbc_specialMovesPanel.fill = GridBagConstraints.BOTH;
		gbc_specialMovesPanel.gridx = 1;
		gbc_specialMovesPanel.gridy = 7;
		add(specialMovesPanel, gbc_specialMovesPanel);

		// Layout for special moves panel
		GridBagLayout gbl_specialMovesPanel = new GridBagLayout();
		gbl_specialMovesPanel.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gbl_specialMovesPanel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_specialMovesPanel.columnWeights = new double[] { 1.0, 0.0, 0.0,
				1.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_specialMovesPanel.rowWeights = new double[] { 0.0, 1.0, 0.0, 1.0,
				0.0, Double.MIN_VALUE };
		specialMovesPanel.setLayout(gbl_specialMovesPanel);

		// Special moves label
		specialMovesLabel = new JLabel("Special Moves");
		specialMovesLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		specialMovesLabel
				.setBorder(BorderFactory.createLineBorder(Color.black));
		specialMovesLabel.setHorizontalAlignment(SwingConstants.CENTER);

		// Layout for special moves label
		GridBagConstraints gbc_specialMovesLabel = new GridBagConstraints();
		gbc_specialMovesLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_specialMovesLabel.gridwidth = 6;
		gbc_specialMovesLabel.insets = new Insets(0, 0, 5, 0);
		gbc_specialMovesLabel.gridx = 0;
		gbc_specialMovesLabel.gridy = 0;
		specialMovesPanel.add(specialMovesLabel, gbc_specialMovesLabel);

		// Special move one panel
		specialMoveOnePanel = new JLabel("Reset");
		specialMoveOnePanel.setHorizontalAlignment(SwingConstants.CENTER);
		specialMoveOnePanel.setBorder(BorderFactory
				.createLineBorder(Color.black));

		// Layout for special move one panel
		GridBagConstraints gbc_specialMoveOnePanel = new GridBagConstraints();
		gbc_specialMoveOnePanel.gridheight = 2;
		gbc_specialMoveOnePanel.insets = new Insets(0, 0, 5, 5);
		gbc_specialMoveOnePanel.fill = GridBagConstraints.BOTH;
		gbc_specialMoveOnePanel.gridx = 0;
		gbc_specialMoveOnePanel.gridy = 1;
		specialMovesPanel.add(specialMoveOnePanel, gbc_specialMoveOnePanel);

		// Special move one label
		specialMoveOneLabel = new JLabel("0");
		specialMoveOneLabel.setBorder(BorderFactory
				.createLineBorder(Color.black));
		specialMoveOneLabel.setHorizontalAlignment(SwingConstants.RIGHT);

		// Layout for special move one label
		GridBagConstraints gbc_specialMoveOneLabel = new GridBagConstraints();
		gbc_specialMoveOneLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_specialMoveOneLabel.gridwidth = 2;
		gbc_specialMoveOneLabel.insets = new Insets(0, 0, 5, 5);
		gbc_specialMoveOneLabel.gridx = 1;
		gbc_specialMoveOneLabel.gridy = 1;
		specialMovesPanel.add(specialMoveOneLabel, gbc_specialMoveOneLabel);

		// Special move three panel
		specialMoveThreePanel = new JLabel("Remove");
		specialMoveThreePanel.setHorizontalAlignment(SwingConstants.CENTER);
		specialMoveThreePanel.setBorder(BorderFactory
				.createLineBorder(Color.black));

		// Layout for special move three panel
		GridBagConstraints gbc_specialMoveThreePanel = new GridBagConstraints();
		gbc_specialMoveThreePanel.gridheight = 2;
		gbc_specialMoveThreePanel.insets = new Insets(0, 0, 5, 5);
		gbc_specialMoveThreePanel.fill = GridBagConstraints.BOTH;
		gbc_specialMoveThreePanel.gridx = 3;
		gbc_specialMoveThreePanel.gridy = 1;
		specialMovesPanel.add(specialMoveThreePanel, gbc_specialMoveThreePanel);

		// Special move three label
		specialMoveThreeLabel = new JLabel("0");
		specialMoveThreeLabel.setBorder(BorderFactory
				.createLineBorder(Color.black));
		specialMoveThreeLabel.setHorizontalAlignment(SwingConstants.RIGHT);

		// Layout for special move three label
		GridBagConstraints gbc_specialMoveThreeLabel = new GridBagConstraints();
		gbc_specialMoveThreeLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_specialMoveThreeLabel.gridwidth = 2;
		gbc_specialMoveThreeLabel.insets = new Insets(0, 0, 5, 5);
		gbc_specialMoveThreeLabel.gridx = 4;
		gbc_specialMoveThreeLabel.gridy = 1;
		specialMovesPanel.add(specialMoveThreeLabel, gbc_specialMoveThreeLabel);

		// Special move one minus button
		specialMoveOneMinusButton = new JButton("-");

		// Layout for special move one minus button
		GridBagConstraints gbc_specialMoveOneMinusButton = new GridBagConstraints();
		gbc_specialMoveOneMinusButton.insets = new Insets(0, 0, 5, 5);
		gbc_specialMoveOneMinusButton.gridx = 1;
		gbc_specialMoveOneMinusButton.gridy = 2;
		specialMovesPanel.add(specialMoveOneMinusButton,
				gbc_specialMoveOneMinusButton);

		// Special move one plus button
		specialMoveOnePlusButton = new JButton("+");

		// Layout for special move one plus button
		GridBagConstraints gbc_specialMoveOnePlusButton = new GridBagConstraints();
		gbc_specialMoveOnePlusButton.insets = new Insets(0, 0, 5, 5);
		gbc_specialMoveOnePlusButton.gridx = 2;
		gbc_specialMoveOnePlusButton.gridy = 2;
		specialMovesPanel.add(specialMoveOnePlusButton,
				gbc_specialMoveOnePlusButton);

		// Special move three minus button
		specialMoveThreeMinusButton = new JButton("-");

		// Layout for special move three minus button
		GridBagConstraints gbc_specialMoveThreeMinusButton = new GridBagConstraints();
		gbc_specialMoveThreeMinusButton.insets = new Insets(0, 0, 5, 5);
		gbc_specialMoveThreeMinusButton.gridx = 4;
		gbc_specialMoveThreeMinusButton.gridy = 2;
		specialMovesPanel.add(specialMoveThreeMinusButton,
				gbc_specialMoveThreeMinusButton);

		// Special move three plus button
		specialMoveThreePlusButton = new JButton("+");

		// Layout for special move three plus button
		GridBagConstraints gbc_specialMoveThreePlusButton = new GridBagConstraints();
		gbc_specialMoveThreePlusButton.insets = new Insets(0, 0, 5, 0);
		gbc_specialMoveThreePlusButton.gridx = 5;
		gbc_specialMoveThreePlusButton.gridy = 2;
		specialMovesPanel.add(specialMoveThreePlusButton,
				gbc_specialMoveThreePlusButton);

		// Special move two panel
		specialMoveTwoPanel = new JLabel("Swap");
		specialMoveTwoPanel.setHorizontalAlignment(SwingConstants.CENTER);
		specialMoveTwoPanel.setBorder(BorderFactory
				.createLineBorder(Color.black));

		// Layout for special move two panel
		GridBagConstraints gbc_specialMoveTwoPanel = new GridBagConstraints();
		gbc_specialMoveTwoPanel.gridheight = 2;
		gbc_specialMoveTwoPanel.insets = new Insets(0, 0, 0, 5);
		gbc_specialMoveTwoPanel.fill = GridBagConstraints.BOTH;
		gbc_specialMoveTwoPanel.gridx = 0;
		gbc_specialMoveTwoPanel.gridy = 3;
		specialMovesPanel.add(specialMoveTwoPanel, gbc_specialMoveTwoPanel);

		// Special move two label
		specialMoveTwoLabel = new JLabel("0");
		specialMoveTwoLabel.setBorder(BorderFactory
				.createLineBorder(Color.black));

		// Layout for special move two label
		specialMoveTwoLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_specialMoveTwoLabel = new GridBagConstraints();
		gbc_specialMoveTwoLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_specialMoveTwoLabel.gridwidth = 2;
		gbc_specialMoveTwoLabel.insets = new Insets(0, 0, 5, 5);
		gbc_specialMoveTwoLabel.gridx = 1;
		gbc_specialMoveTwoLabel.gridy = 3;
		specialMovesPanel.add(specialMoveTwoLabel, gbc_specialMoveTwoLabel);

		// Special move four panel
		specialMoveFourPanel = new JLabel("XStacy");
		specialMoveFourPanel.setHorizontalAlignment(SwingConstants.CENTER);
		specialMoveFourPanel.setBorder(BorderFactory
				.createLineBorder(Color.black));

		// Layout for special move four panel
		GridBagConstraints gbc_specialMoveFourPanel = new GridBagConstraints();
		gbc_specialMoveFourPanel.gridheight = 2;
		gbc_specialMoveFourPanel.insets = new Insets(0, 0, 0, 5);
		gbc_specialMoveFourPanel.fill = GridBagConstraints.BOTH;
		gbc_specialMoveFourPanel.gridx = 3;
		gbc_specialMoveFourPanel.gridy = 3;
		specialMovesPanel.add(specialMoveFourPanel, gbc_specialMoveFourPanel);

		// Special move four label
		specialMoveFourLabel = new JLabel("0");
		specialMoveFourLabel.setBorder(BorderFactory
				.createLineBorder(Color.black));

		// Layout for special move four label
		specialMoveFourLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_specialMoveFourLabel = new GridBagConstraints();
		gbc_specialMoveFourLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_specialMoveFourLabel.gridwidth = 2;
		gbc_specialMoveFourLabel.insets = new Insets(0, 0, 5, 5);
		gbc_specialMoveFourLabel.gridx = 4;
		gbc_specialMoveFourLabel.gridy = 3;
		specialMovesPanel.add(specialMoveFourLabel, gbc_specialMoveFourLabel);

		// Special move two minus button
		specialMoveTwoMinusButton = new JButton("-");

		// Layout for special move two minus button
		GridBagConstraints gbc_specialMoveTwoMinusButton = new GridBagConstraints();
		gbc_specialMoveTwoMinusButton.insets = new Insets(0, 0, 0, 5);
		gbc_specialMoveTwoMinusButton.gridx = 1;
		gbc_specialMoveTwoMinusButton.gridy = 4;
		specialMovesPanel.add(specialMoveTwoMinusButton,
				gbc_specialMoveTwoMinusButton);

		// Special move two plus button
		specialMoveTwoPlusButton = new JButton("+");

		// Layout for special move two plus button
		GridBagConstraints gbc_specialMoveTwoPlusButton = new GridBagConstraints();
		gbc_specialMoveTwoPlusButton.insets = new Insets(0, 0, 0, 5);
		gbc_specialMoveTwoPlusButton.gridx = 2;
		gbc_specialMoveTwoPlusButton.gridy = 4;
		specialMovesPanel.add(specialMoveTwoPlusButton,
				gbc_specialMoveTwoPlusButton);

		// Special move four minus button
		specialMoveFourMinusButton = new JButton("-");

		// Layout for special move four minus button
		GridBagConstraints gbc_specialMoveFourMinusButton = new GridBagConstraints();
		gbc_specialMoveFourMinusButton.insets = new Insets(0, 0, 0, 5);
		gbc_specialMoveFourMinusButton.gridx = 4;
		gbc_specialMoveFourMinusButton.gridy = 4;
		specialMovesPanel.add(specialMoveFourMinusButton,
				gbc_specialMoveFourMinusButton);

		// Special move four plus button
		specialMoveFourPlusButton = new JButton("+");

		// Layout for special move four plus button
		GridBagConstraints gbc_specialMoveFourPlusButton = new GridBagConstraints();
		gbc_specialMoveFourPlusButton.gridx = 5;
		gbc_specialMoveFourPlusButton.gridy = 4;
		specialMovesPanel.add(specialMoveFourPlusButton,
				gbc_specialMoveFourPlusButton);

		// Point thresholds panel
		pointThresholdsPanel = new JPanel();

		// Layout for point thresholds panel
		GridBagConstraints gbc_pointThresholdsPanel = new GridBagConstraints();
		gbc_pointThresholdsPanel.insets = new Insets(0, 0, 5, 5);
		gbc_pointThresholdsPanel.fill = GridBagConstraints.BOTH;
		gbc_pointThresholdsPanel.gridx = 1;
		gbc_pointThresholdsPanel.gridy = 9;
		add(pointThresholdsPanel, gbc_pointThresholdsPanel);

		GridBagLayout gbl_pointThresholdsPanel = new GridBagLayout();
		gbl_pointThresholdsPanel.columnWidths = new int[] { 0, 0, 0 };
		gbl_pointThresholdsPanel.rowHeights = new int[] { 0, 0, 0, 0, 0 };
		gbl_pointThresholdsPanel.columnWeights = new double[] { 1.0, 1.0,
				Double.MIN_VALUE };
		gbl_pointThresholdsPanel.rowWeights = new double[] { 0.0, 0.0, 0.0,
				0.0, Double.MIN_VALUE };
		pointThresholdsPanel.setLayout(gbl_pointThresholdsPanel);

		// Point thresholds label
		pointThresholdsLabel = new JLabel("Score Cutoffs");
		pointThresholdsLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		pointThresholdsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pointThresholdsLabel.setBorder(BorderFactory
				.createLineBorder(Color.black));

		// Layout for point thresholds label
		GridBagConstraints gbc_pointThresholdsLabel = new GridBagConstraints();
		gbc_pointThresholdsLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_pointThresholdsLabel.gridwidth = 2;
		gbc_pointThresholdsLabel.insets = new Insets(0, 0, 5, 5);
		gbc_pointThresholdsLabel.gridx = 0;
		gbc_pointThresholdsLabel.gridy = 0;
		pointThresholdsPanel
				.add(pointThresholdsLabel, gbc_pointThresholdsLabel);

		// One star score label
		oneStarScoreLabel = new JLabel("1 Star Score");
		oneStarScoreLabel.setMinimumSize(new Dimension(59, 20));
		oneStarScoreLabel.setPreferredSize(new Dimension(59, 20));
		oneStarScoreLabel
				.setBorder(BorderFactory.createLineBorder(Color.black));
		oneStarScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);

		// Layout for one star score label
		GridBagConstraints gbc_oneStarScoreLabel = new GridBagConstraints();
		gbc_oneStarScoreLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_oneStarScoreLabel.insets = new Insets(0, 0, 5, 5);
		gbc_oneStarScoreLabel.gridx = 0;
		gbc_oneStarScoreLabel.gridy = 1;
		pointThresholdsPanel.add(oneStarScoreLabel, gbc_oneStarScoreLabel);

		// One star score text field
		oneStarScoreTextField = new JTextField();
		oneStarScoreTextField.setText("0");

		// Layout for one star score text field
		GridBagConstraints gbc_oneStarScoreTextField = new GridBagConstraints();
		gbc_oneStarScoreTextField.insets = new Insets(0, 0, 5, 0);
		gbc_oneStarScoreTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_oneStarScoreTextField.gridx = 1;
		gbc_oneStarScoreTextField.gridy = 1;
		pointThresholdsPanel.add(oneStarScoreTextField,
				gbc_oneStarScoreTextField);
		oneStarScoreTextField.setColumns(10);

		// Two star score label
		twoStarScoreLabel = new JLabel("2 Star Score");
		twoStarScoreLabel.setPreferredSize(new Dimension(59, 20));
		twoStarScoreLabel.setMinimumSize(new Dimension(59, 20));
		twoStarScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		twoStarScoreLabel
				.setBorder(BorderFactory.createLineBorder(Color.black));

		// Layout for two star score label
		GridBagConstraints gbc_twoStarScoreLabel = new GridBagConstraints();
		gbc_twoStarScoreLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_twoStarScoreLabel.insets = new Insets(0, 0, 5, 5);
		gbc_twoStarScoreLabel.gridx = 0;
		gbc_twoStarScoreLabel.gridy = 2;
		pointThresholdsPanel.add(twoStarScoreLabel, gbc_twoStarScoreLabel);

		// Two star score text field
		twoStarScoreTextField = new JTextField();
		twoStarScoreTextField.setColumns(10);
		twoStarScoreTextField.setText("0");

		// Layout for two star score text field
		GridBagConstraints gbc_twoStarScoreTextField = new GridBagConstraints();
		gbc_twoStarScoreTextField.insets = new Insets(0, 0, 5, 0);
		gbc_twoStarScoreTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_twoStarScoreTextField.gridx = 1;
		gbc_twoStarScoreTextField.gridy = 2;
		pointThresholdsPanel.add(twoStarScoreTextField,
				gbc_twoStarScoreTextField);

		// Three star score label
		threeStarScoreLabel = new JLabel("3 Star Score");
		threeStarScoreLabel.setMinimumSize(new Dimension(59, 20));
		threeStarScoreLabel.setPreferredSize(new Dimension(59, 20));
		threeStarScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		threeStarScoreLabel.setBorder(BorderFactory
				.createLineBorder(Color.black));

		// Layout for three star score label
		GridBagConstraints gbc_threeStarScoreLabel = new GridBagConstraints();
		gbc_threeStarScoreLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_threeStarScoreLabel.insets = new Insets(0, 0, 0, 5);
		gbc_threeStarScoreLabel.gridx = 0;
		gbc_threeStarScoreLabel.gridy = 3;
		pointThresholdsPanel.add(threeStarScoreLabel, gbc_threeStarScoreLabel);

		// Three star score text field
		threeStarScoreTextField = new JTextField();
		threeStarScoreTextField.setColumns(10);
		threeStarScoreTextField.setText("0");

		// Layout for three star score text field
		GridBagConstraints gbc_threeStarScoreTextField = new GridBagConstraints();
		gbc_threeStarScoreTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_threeStarScoreTextField.gridx = 1;
		gbc_threeStarScoreTextField.gridy = 3;
		pointThresholdsPanel.add(threeStarScoreTextField,
				gbc_threeStarScoreTextField);

		// Tile settings panel
		tileSettingsPanel = new JPanel();

		// Layout for tile settings panel
		GridBagConstraints gbc_tileSettingsPanel = new GridBagConstraints();
		gbc_tileSettingsPanel.insets = new Insets(0, 0, 5, 5);
		gbc_tileSettingsPanel.fill = GridBagConstraints.BOTH;
		gbc_tileSettingsPanel.gridx = 1;
		gbc_tileSettingsPanel.gridy = 11;
		add(tileSettingsPanel, gbc_tileSettingsPanel);

		GridBagLayout gbl_tileSettingsPanel = new GridBagLayout();
		gbl_tileSettingsPanel.columnWidths = new int[] { 0, 0, 0 };
		gbl_tileSettingsPanel.rowHeights = new int[] { 0, 0, 0 };
		gbl_tileSettingsPanel.columnWeights = new double[] { 1.0, 1.0,
				Double.MIN_VALUE };
		gbl_tileSettingsPanel.rowWeights = new double[] { 0.0, 0.0,
				Double.MIN_VALUE };
		tileSettingsPanel.setLayout(gbl_tileSettingsPanel);

		// Tile settings label
		tileSettingsLabel = new JLabel("Tile Settings");
		tileSettingsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tileSettingsLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tileSettingsLabel
				.setBorder(BorderFactory.createLineBorder(Color.black));

		// Layout for tile settings label
		GridBagConstraints gbc_tileSettingsLabel = new GridBagConstraints();
		gbc_tileSettingsLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_tileSettingsLabel.gridwidth = 2;
		gbc_tileSettingsLabel.insets = new Insets(0, 0, 5, 0);
		gbc_tileSettingsLabel.gridx = 0;
		gbc_tileSettingsLabel.gridy = 0;
		tileSettingsPanel.add(tileSettingsLabel, gbc_tileSettingsLabel);

		// Tile type label
		tileTypeLabel = new JLabel("Tile Type");
		tileTypeLabel.setMinimumSize(new Dimension(43, 20));
		tileTypeLabel.setPreferredSize(new Dimension(43, 20));
		tileTypeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tileTypeLabel.setBorder(BorderFactory.createLineBorder(Color.black));

		// Layout for tile type label
		GridBagConstraints gbc_tileTypeLabel = new GridBagConstraints();
		gbc_tileTypeLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_tileTypeLabel.insets = new Insets(0, 0, 0, 5);
		gbc_tileTypeLabel.gridx = 0;
		gbc_tileTypeLabel.gridy = 1;
		tileSettingsPanel.add(tileTypeLabel, gbc_tileTypeLabel);

		// Tile type combo box
		tileTypeComboBox = new JComboBox<String>();
		tileTypeComboBox.addItem(TileType.NUMBER.toString());
		tileTypeComboBox.addItem(TileType.TARGET.toString());
		tileTypeComboBox.addItem(TileType.NULL.toString());
		tileTypeComboBox.addItem(TileType.SIX.toString());

		// Layout for tile type combo box
		GridBagConstraints gbc_tileTypeComboBox = new GridBagConstraints();
		gbc_tileTypeComboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_tileTypeComboBox.gridx = 1;
		gbc_tileTypeComboBox.gridy = 1;
		tileSettingsPanel.add(tileTypeComboBox, gbc_tileTypeComboBox);
	}

	/**
	 * Returns the userLevelNameTextField object for this panel.
	 *
	 * @return the userLevelNameTextField property.
	 */
	public JTextField getUserLevelNameTextField() {
		return userLevelNameTextField;
	}

	/**
	 * Returns the movesTextField object for this panel.
	 *
	 * @return the movesTextField property.
	 */
	public JTextField getMovesTextField() {
		return movesTextField;
	}

	/**
	 * Returns the timerTextField object for this panel.
	 *
	 * @return the timerTextField property.
	 */
	public JTextField getTimerTextField() {
		return timerTextField;
	}

	/**
	 * Returns the levelTypeComboBox object for this panel.
	 *
	 * @return the levelTypeComboBox property.
	 */
	public JComboBox<String> getLevelTypeComboBox() {
		return levelTypeComboBox;
	}

	/**
	 * Returns the onesTextField object for this panel.
	 *
	 * @return the onesTextField property.
	 */
	public JTextField getOnesTextField() {
		return onesTextField;
	}

	/**
	 * Returns the twosTextField object for this panel.
	 *
	 * @return the twosTextField property.
	 */
	public JTextField getTwosTextField() {
		return twosTextField;
	}

	/**
	 * Returns the threesTextField object for this panel.
	 *
	 * @return the threesTextField property.
	 */
	public JTextField getThreesTextField() {
		return threesTextField;
	}

	/**
	 * Returns the foursTextField object for this panel.
	 *
	 * @return the foursTextField property.
	 */
	public JTextField getFoursTextField() {
		return foursTextField;
	}

	/**
	 * Returns the fivesTextField object for this panel.
	 *
	 * @return the fivesTextField property.
	 */
	public JTextField getFivesTextField() {
		return fivesTextField;
	}

	/**
	 * Returns the sixesTextField object for this panel.
	 *
	 * @return the sixesTextField property.
	 */
	public JTextField getSixesTextField() {
		return sixesTextField;
	}

	/**
	 * Returns the twoMultiplierTextField object for this panel.
	 *
	 * @return the twoMultiplierTextField property.
	 */
	public JTextField getTwoMultiplierTextField() {
		return twoMultiplierTextField;
	}

	/**
	 * Returns the threeMultiplierTextField object for this panel.
	 *
	 * @return the threeMultiplierTextField property.
	 */
	public JTextField getThreeMultiplierTextField() {
		return threeMultiplierTextField;
	}

	/**
	 * Returns the specialMoveOneMinusButton object for this panel.
	 *
	 * @return the specialMoveOneMinusButton property.
	 */
	public JButton getSpecialMoveOneMinusButton() {
		return specialMoveOneMinusButton;
	}

	/**
	 * Returns the specialMoveOnePlusButton object for this panel.
	 *
	 * @return the specialMoveOnePlusButton property.
	 */
	public JButton getSpecialMoveOnePlusButton() {
		return specialMoveOnePlusButton;
	}

	/**
	 * Returns the specialMoveTwoMinusButton object for this panel.
	 *
	 * @return the specialMoveTwoMinusButton property.
	 */
	public JButton getSpecialMoveTwoMinusButton() {
		return specialMoveTwoMinusButton;
	}

	/**
	 * Returns the specialMoveTwoPlusButton object for this panel.
	 *
	 * @return the specialMoveTwoPlusButton property.
	 */
	public JButton getSpecialMoveTwoPlusButton() {
		return specialMoveTwoPlusButton;
	}

	/**
	 * Returns the specialMoveThreeMinusButton object for this panel.
	 *
	 * @return the specialMoveThreeMinusButton property.
	 */
	public JButton getSpecialMoveThreeMinusButton() {
		return specialMoveThreeMinusButton;
	}

	/**
	 * Returns the specialMoveThreePlusButton object for this panel.
	 *
	 * @return the specialMoveThreePlusButton property.
	 */
	public JButton getSpecialMoveThreePlusButton() {
		return specialMoveThreePlusButton;
	}

	/**
	 * Returns the specialMoveFourMinusButton object for this panel.
	 *
	 * @return the specialMoveFourMinusButton property.
	 */
	public JButton getSpecialMoveFourMinusButton() {
		return specialMoveFourMinusButton;
	}

	/**
	 * Returns the specialMoveFourPlusButton object for this panel.
	 *
	 * @return the specialMoveFourPlusButton property.
	 */
	public JButton getSpecialMoveFourPlusButton() {
		return specialMoveFourPlusButton;
	}

	/**
	 * Returns the oneStarScoreTextField object for this panel.
	 *
	 * @return the oneStarScoreTextField property.
	 */
	public JTextField getOneStarScoreTextField() {
		return oneStarScoreTextField;
	}

	/**
	 * Returns the twoStarScoreTextField object for this panel.
	 *
	 * @return the twoStarScoreTextField property.
	 */
	public JTextField getTwoStarScoreTextField() {
		return twoStarScoreTextField;
	}

	/**
	 * Returns the threeStarScoreTextField object for this panel.
	 *
	 * @return the threeStarScoreTextField property.
	 */
	public JTextField getThreeStarScoreTextField() {
		return threeStarScoreTextField;
	}

	/**
	 * Returns the tileTypeComboBox object for this panel.
	 *
	 * @return the tileTypeComboBox property
	 */
	public JComboBox<String> getTileTypeComboBox() {
		return tileTypeComboBox;
	}

	/**
	 * Returns the specialMoveOneLabel object for this panel.
	 *
	 * @return the specialMoveOneLabel property
	 */
	public JLabel getSpecialMoveOneLabel() {
		return specialMoveOneLabel;
	}

	/**
	 * Returns the specialMoveTwoLabel object for this panel.
	 *
	 * @return the specialMoveTwoLabel property
	 */
	public JLabel getSpecialMoveTwoLabel() {
		return specialMoveTwoLabel;
	}

	/**
	 * Returns the specialMoveThreeLabel object for this panel.
	 *
	 * @return the specialMoveThreeLabel property
	 */
	public JLabel getSpecialMoveThreeLabel() {
		return specialMoveThreeLabel;
	}

	/**
	 * Returns the specialMoveFourLabel object for this panel.
	 *
	 * @return the specialMoveFourLabel property
	 */
	public JLabel getSpecialMoveFourLabel() {
		return specialMoveFourLabel;
	}
}
