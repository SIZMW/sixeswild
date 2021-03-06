package SixesWild.com.mimas.sixeswild.controllers;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

import SixesWild.com.mimas.sixeswild.boundaries.GameApplication;
import SixesWild.com.mimas.sixeswild.entities.MoveType;
import SixesWild.com.mimas.sixeswild.entities.RemoveTileMove;
import SixesWild.com.mimas.sixeswild.entities.SelectionMove;
import SixesWild.com.mimas.sixeswild.entities.SwapMove;

/**
 * This controller handles mouse presses and releases when selecting tiles on
 * the Board during the game.
 *
 * @author Aditya Nivarthi
 */
public class GameBoardViewMouseController extends MouseAdapter {

	private static final Logger logger = Logger.getGlobal();

	protected GameApplication app;

	/**
	 * Creates a GameBoardViewMouseController instance with the specified
	 * GameApplication.
	 *
	 * @param app
	 *            The currently running GameApplication.
	 */
	public GameBoardViewMouseController(GameApplication app) {
		this.app = app;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.MouseAdapter#mousePressed(java.awt.event.MouseEvent)
	 */
	@Override
	public void mousePressed(MouseEvent me) {

		// Update the selection location
		app.getLevelPanel().getBoardViewPanel()
				.updateGameSelection(me.getX(), me.getY());

		// Process move based on current move type
		if (app.getLevelPanel().getMoveType().equals(MoveType.SELECTION)) {
			SelectionMove move = new SelectionMove(app.getLevelPanel()
					.getBoardViewPanel().getCurrentSelection(), app
					.getLevelPanel().getLevel());
			move.processCurrentMove(app);
			logger.log(Level.INFO, "Processing a move type of: "
					+ MoveType.SELECTION);
		} else if (app.getLevelPanel().getMoveType().equals(MoveType.SWAP)) {
			SwapMove move = new SwapMove(app.getLevelPanel()
					.getBoardViewPanel().getCurrentSelection(), app
					.getLevelPanel().getLevel());
			move.processCurrentMove(app);
		} else if (app.getLevelPanel().getMoveType().equals(MoveType.REMOVE)) {
			RemoveTileMove move = new RemoveTileMove(app.getLevelPanel()
					.getBoardViewPanel().getCurrentSelection(), app
					.getLevelPanel().getLevel());
			move.processCurrentMove(app);
		}

		logger.log(Level.INFO, "Processed a move type of: "
				+ app.getLevelPanel().getMoveType().toString());

		// Update the level display
		app.getLevelPanel().updateLevelStats();
		app.getLevelPanel().getBoardViewPanel().updateUI();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.MouseAdapter#mouseReleased(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseReleased(MouseEvent me) {

		// Execute move based on current move type
		if (app.getLevelPanel().getMoveType().equals(MoveType.SELECTION)) {
			SelectionMove move = new SelectionMove(app.getLevelPanel()
					.getBoardViewPanel().getCurrentSelection(), app
					.getLevelPanel().getLevel());
			move.doMove(app);
		} else if (app.getLevelPanel().getMoveType().equals(MoveType.SWAP)) {
			SwapMove move = new SwapMove(app.getLevelPanel()
					.getBoardViewPanel().getCurrentSelection(), app
					.getLevelPanel().getLevel());

			// Once move is complete, reset to standard selection
			if (move.isValidMove(app)) {
				move.doMove(app);
				app.getLevelPanel().setMoveType(MoveType.SELECTION);
			}
		} else if (app.getLevelPanel().getMoveType().equals(MoveType.REMOVE)) {
			RemoveTileMove move = new RemoveTileMove(app.getLevelPanel()
					.getBoardViewPanel().getCurrentSelection(), app
					.getLevelPanel().getLevel());

			// Once move is complete, reset to standard selection
			if (move.isValidMove(app)) {
				move.doMove(app);
				app.getLevelPanel().setMoveType(MoveType.SELECTION);
			}
		}

		logger.log(Level.INFO, "Completed a move type of: "
				+ app.getLevelPanel().getMoveType().toString());

		// Update the level display
		app.getLevelPanel().updateLevelStats();

		// Determine if level is complete
		hasCompletedLevel();
		app.getLevelPanel().getBoardViewPanel().updateUI();
	}

	/**
	 * Determines completion status for the level.
	 */
	protected void hasCompletedLevel() {
		if (app.getLevelPanel().getLevel().hasBeenCompleted()) {
			app.getLevelPanel().endLevel("Completed level.", true);
		} else if (!app.getLevelPanel().getLevel().hasTimerRestriction()
				&& app.getLevelPanel().getLevel().getRestrictionCount() <= 0) {
			app.getLevelPanel().endLevel("You have run out of moves.", false);
		}
	}
}
