package kp.client;

import java.lang.invoke.MethodHandles;
import java.util.logging.Level;
import java.util.logging.Logger;

import kp.Constants;
import kp.util.KpException;
import kp.util.Tools;
import kp.w_s.WebSe;

/**
 * The application for JBoss Application Client.
 *
 */
public class ClientApplication {

	private static final Logger logger = Logger.getLogger(MethodHandles.lookup().lookupClass().getName());
	private static final String ARG_TEXT = "appclient";

	/**
	 * The constructor.
	 */
	public ClientApplication() {
		super();
	}

	/**
	 * The main method.
	 * 
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		WebSe[] webSeArr = {};
		try {
			webSeArr = Tools.createWebSeImplementations();
		} catch (KpException ex) {
			logger.severe(String.format("main(): KpException[%s]", ex.getMessage()));
			System.exit(1);
		}
		final StringBuilder strBld = new StringBuilder();
		strBld.append(Constants.LINE_SEP).append(Constants.BREAK);
		strBld.append(Constants.LABEL).append(Constants.LINE_SEP);
		for (WebSe webSe : webSeArr) {
			strBld.append(webSe.tryIt(ARG_TEXT)).append(Constants.LINE_SEP);
		}
		strBld.append(Constants.BREAK);
		if (logger.isLoggable(Level.INFO)) {
			logger.info(strBld.toString());
		}
	}
}