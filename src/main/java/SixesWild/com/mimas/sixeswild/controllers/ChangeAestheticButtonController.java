package SixesWild.com.mimas.sixeswild.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import SixesWild.com.mimas.sixeswild.boundaries.GameApplication;
import SixesWild.com.mimas.sixeswild.entities.Aesthetic;

/**
 * This controller applies the selected aesthetic when it is requested in the
 * options menu.
 *
 * @author Aditya Nivarthi
 */
public class ChangeAestheticButtonController implements ActionListener {

	protected GameApplication app;

	/**
	 * Creates a ChangeAestheticButtonController instance with the specified
	 * GameApplication.
	 *
	 * @param app
	 *            The GameApplicatiom currently running.
	 */
	public ChangeAestheticButtonController(GameApplication app) {
		this.app = app;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	public void actionPerformed(ActionEvent e) {
		Aesthetic aesthetic = (Aesthetic) app.getGameMenuView()
				.getOptionsMenuView().getAestheticDropDownMenu()
				.getSelectedItem();
		app.setCurrentAesthetic(aesthetic);
	}
}
