package SixesWild.com.mimas.sixeswild.entities;

import SixesWild.com.mimas.sixeswild.boundaries.GameApplication;

/**
 * The SelectionMove is one type of move that can be executed in a game. It
 * handles the selection of tiles move.
 *
 * @author Aditya Nivarthi
 */
public class SelectionMove extends GameMove {

	protected Selection selection;
	protected GameLevel level;

	/**
	 * Creates a SelectionMove instance with the specified selection and
	 * GameLevel.
	 *
	 * @param selection
	 *            The selection to verify for validity.
	 * @param level
	 *            The GameLevel currently being played.
	 */
	public SelectionMove(Selection selection, GameLevel level) {
		this.selection = selection;
		this.level = level;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * SixesWild.com.mimas.sixeswild.entities.GameMove#isStillValidMove(SixesWild
	 * .com.mimas.sixeswild.boundaries.GameApplication)
	 */
	@Override
	public boolean isStillValidMove(GameApplication app) {
		return selection.isSelectionStillValid();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * SixesWild.com.mimas.sixeswild.entities.GameMove#isValidMove(SixesWild
	 * .com.mimas.sixeswild.boundaries.GameApplication)
	 */
	@Override
	public boolean isValidMove(GameApplication app) {
		return selection.isSelectionValid();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * SixesWild.com.mimas.sixeswild.entities.GameMove#processCurrentMove(SixesWild
	 * .com.mimas.sixeswild.boundaries.GameApplication)
	 */
	@Override
	public boolean processCurrentMove(GameApplication app) {
		if (!isStillValidMove(app)) {
			app.getLevelPanel().getBoardViewPanel().clearGameSelection();
			app.getLevelPanel().getLevel().updateRestrictionCount(-1);
			return false;
		}

		return true;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * SixesWild.com.mimas.sixeswild.entities.GameMove#doMove(SixesWild.com.
	 * mimas.sixeswild.boundaries.GameApplication)
	 */
	@Override
	public boolean doMove(GameApplication app) {
		if (!isValidMove(app)) {
			app.getLevelPanel().getBoardViewPanel().clearGameSelection();
			if (app.getLevelPanel().getLevel().getRestrictionCount() > 0) {
				app.getLevelPanel().getLevel().updateRestrictionCount(-1);
			}
			return false;
		} else {
			int score = selection.getScore();

			// Check type of level for calculating score and processing move
			app.getLevelPanel().getLevel().processSelection(selection);

			if (app.getLevelPanel().getLevel().getRestrictionCount() > 0) {
				app.getLevelPanel().getLevel().updateRestrictionCount(-1);
			}
			app.getLevelPanel().getBoardViewPanel().clearGameSelection();
			app.getLevelPanel().updateScore(score);

			return true;
		}
	}
}
