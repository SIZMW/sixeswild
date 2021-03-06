package SixesWild.com.mimas.sixeswild.entities;

import java.util.ArrayList;

/**
 * This class is used as a representation of the release level type. The goal in
 * this level is to guide the SixTiles to the TargetTiles by moving tiles below
 * the SixTiles to make them fall downward.
 *
 * @author Cameron Jones
 */
public class ReleaseLevel extends GameLevel {

	/**
	 * Creates a ReleaseLevel instance with the specified tile frequencies,
	 * multiplier frequencies, type, name, tile list, point thresholds, move
	 * count, special moves and level number.
	 *
	 * @param tileFreq
	 *            The tile frequencies for the level.
	 * @param multFreq
	 *            The multiplier frequencies for the level.
	 * @param name
	 *            The name of the level.
	 * @param tiles
	 *            The list of tiles for the board in the level.
	 * @param pointThresholds
	 *            The point threshold values for the level.
	 * @param restrictionCount
	 *            The number of the restriction for the level.
	 * @param specialMoves
	 *            The special moves counts for the level.
	 * @param levelNumber
	 *            The number for this level.
	 * @throws Exception
	 *             If board construction throws an exception.
	 */
	public ReleaseLevel(ArrayList<Double> tileFreq, ArrayList<Double> multFreq,
			String name, Tile tiles[][], PointThresholds pointThresholds,
			int restrictionCount, SpecialMoves specialMoves, int levelNumber)
			throws Exception {
		super(tileFreq, multFreq, name, tiles, pointThresholds,
				restrictionCount, specialMoves, levelNumber);
		type = LevelType.RELEASE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see SixesWild.com.mimas.sixeswild.entities.GameLevel#hasBeenCompleted()
	 */
	@Override
	public boolean hasBeenCompleted() {
		for (int i = 0; i < board.SIZE_X; i++) {
			for (int j = 0; j < board.SIZE_Y; j++) {
				if (board.getSquare(i, j).getTile().getType()
						.equals(TileType.TARGET)) {
					return false;
				}
			}
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see SixesWild.com.mimas.sixeswild.entities.GameLevel#hasTimer()
	 */
	@Override
	public boolean hasTimerRestriction() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see SixesWild.com.mimas.sixeswild.entities.GameLevel#hasMoveCount()
	 */
	@Override
	public boolean hasMovesRestriction() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * SixesWild.com.mimas.sixeswild.entities.GameLevel#processSelection(SixesWild
	 * .com.mimas.sixeswild.entities.Selection)
	 */
	@Override
	public void processSelection(Selection selection) {
		board.removeSelection(selection);
		board.shiftTilesDownward();
		board.fillEmptySquares();

		// Process the six tiles and the target tiles
		for (int i = 0; i < board.SIZE_X; i++) {
			for (int j = 0; j < board.SIZE_Y; j++) {
				
				// If a six tile is above a target tile, move it into the target
				if (board.getSquare(i, j).getTile().getType()
						.equals(TileType.SIX)) {
					if ((j + 1) < board.SIZE_Y
							&& board.getSquare(i, j + 1).getTile().getType()
									.equals(TileType.TARGET)) {
						board.getSquare(i, j + 1).removeTile();
						((SixTile) board.getSquare(i, j).getTile())
								.setProcessed(true);
						board.getSquare(i, j + 1).addTile(
								board.getSquare(i, j).getTile());
						board.getSquare(i, j).removeTile();
					}
				}
			}
		}

		board.shiftTilesDownward();
		board.fillEmptySquares();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see SixesWild.com.mimas.sixeswild.entities.GameLevel#makeCopy()
	 */
	@Override
	public GameLevel makeCopy() {
		try {
			return new ReleaseLevel(getBoard().getTileFrequencies(), getBoard()
					.getMultiplierFrequencies(), name, getBoard()
					.getTileTypes(), pointThresholds, restrictionCount,
					specialMoves, levelNumber);
		} catch (Exception e) {
			return null;
		}
	}
}
