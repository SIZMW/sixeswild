package SixesWild.com.mimas.sixeswild.controllers;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JPanel;

import SixesWild.com.mimas.sixeswild.boundaries.GameApplication;

/**
 * This controller displays the options menu when the options menu button is
 * pressed.
 *
 * @author Aditya Nivarthi
 */
public class OptionsMenuButtonController implements ActionListener {

	private static final Logger logger = Logger.getGlobal();

	protected GameApplication app;

	/**
	 * Creates a OptionsMenuButtonController instance with the specified
	 * GameApplication.
	 *
	 * @param app
	 *            The GameApplication currently running.
	 */
	public OptionsMenuButtonController(GameApplication app) {
		this.app = app;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	public void actionPerformed(ActionEvent e) {
		JPanel currentPanel = app.getGameMenuView().getSubMenuPanel();
		currentPanel.removeAll();

		// Layout for panel
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0 };
		gridBagLayout.rowHeights = new int[] { 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		currentPanel.setLayout(gridBagLayout);

		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.insets = new Insets(0, 0, 0, 0);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 0;
		gbc_list.gridy = 0;

		setUpControllers();

		// Add panel to view
		currentPanel.add(app.getGameMenuView().getOptionsMenuView(), gbc_list);
		currentPanel.updateUI();

		logger.log(Level.FINE, "Options menu requested and displayed.");
	}

	/**
	 * Set up controllers for the options menu view.
	 */
	protected void setUpControllers() {
		app.getGameMenuView().getOptionsMenuView().getAestheticButton()
				.addActionListener(new ChangeAestheticButtonController(app));
		app.getGameMenuView().getOptionsMenuView().getSwitchUserButton()
				.addActionListener(new SwitchUserButtonController(app));

		logger.log(Level.FINE, "Options menu controllers initialized.");
	}
}
