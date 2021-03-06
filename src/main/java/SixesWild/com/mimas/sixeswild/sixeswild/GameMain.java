package SixesWild.com.mimas.sixeswild.sixeswild;

import java.awt.EventQueue;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import SixesWild.com.mimas.sixeswild.boundaries.GameApplication;

/**
 * This class is used to create and run an instance of the GameApplication for
 * the main game.
 *
 * @author Aditya Nivarthi
 */
public class GameMain {

	public static final Logger logger = Logger.getGlobal();
	private static FileHandler loggingFileHandler;
	private static ConsoleHandler loggingConsoleHandler;

	/**
	 * Main to launch the game.
	 *
	 * @param args
	 *            Runtime arguments.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// Set up global logger
					logger.setUseParentHandlers(false);

					loggingFileHandler = new FileHandler("./gamelog.log");
					loggingConsoleHandler = new ConsoleHandler();
					loggingFileHandler.setLevel(Level.ALL);
					loggingConsoleHandler.setLevel(Level.ALL);

					// Remove old handlers
					Handler[] handlers = Logger.getGlobal().getHandlers();

					for (Handler handler : handlers) {
						Logger.getGlobal().removeHandler(handler);
					}

					logger.addHandler(loggingFileHandler);
					logger.addHandler(loggingConsoleHandler);

					SimpleFormatter simpleFormatter = new SimpleFormatter();
					loggingFileHandler.setFormatter(simpleFormatter);

					logger.setLevel(Level.ALL);
					logger.log(Level.INFO, "GameMain initialized.");

					// Start game
					GameApplication window = new GameApplication();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
