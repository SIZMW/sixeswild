package SixesWild.com.mimas.sixeswild.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import SixesWild.com.mimas.sixeswild.boundaries.BuilderApplication;

/**
 * This controller decrements the count of special move four for a level in the
 * level builder.
 *
 * @author Aditya Nivarthi
 */
public class SpecialMoveFourDecreaseButtonController implements ActionListener {

	protected BuilderApplication app;

	/**
	 * Creates a SpecialMoveFourDecreaseButtonController with the specified
	 * BuilderApplication.
	 *
	 * @param app
	 *            The GameApplication currently running.
	 */
	public SpecialMoveFourDecreaseButtonController(BuilderApplication app) {
		this.app = app;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	public void actionPerformed(ActionEvent e) {
		int value = Integer.parseInt(app.getBuilderView()
				.getBuilderSettingsPanel().getSpecialMoveFourLabel().getText());

		// Modify value
		if (value <= 0) {
			value = 0;
		} else {
			value--;
		}

		app.getBuilderView().getBuilderSettingsPanel()
				.getSpecialMoveFourLabel().setText(Integer.toString(value));
		app.getBuilderView().getBuilderSettingsPanel().updateUI();
	}
}
