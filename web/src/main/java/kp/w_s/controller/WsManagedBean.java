package kp.w_s.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import kp.Constants;
import kp.util.KpException;
import kp.util.Tools;
import kp.w_s.WebSe;

/**
 * The CDI managed bean for <B>JAX-WS</B> research<BR>
 * (Java API for XML-Based Web Services).
 * 
 */
@Named
@RequestScoped
public class WsManagedBean {

	@SuppressWarnings("java:S6813") // switch off Sonarqube rule 'Avoid field dependency injection'
	@Inject
	private Logger logger;

	@SuppressWarnings("java:S6813") // switch off Sonarqube rule 'Avoid field dependency injection'
	@Inject
	private List<String> report;

	private static final List<String> MUTABLE_TEXT_LIST = new ArrayList<>(Tools.getTextList());

	/**
	 * The constructor.
	 */
	public WsManagedBean() {
		super();
	}

	/**
	 * Researches web service.
	 * 
	 * @return the result
	 */
	public String researchWebService() {

		final String text = MUTABLE_TEXT_LIST.getFirst();
		Collections.rotate(MUTABLE_TEXT_LIST, -1);
		report.add(Constants.LABEL);
		final WebSe[] webSeArr;
		try {
			webSeArr = Tools.createWebSeImplementations();
		} catch (KpException ex) {
			logger.severe(String.format("researchWebService(): KpException[%s]", ex.getMessage()));
			return "";
		}
		final StringBuilder strBld = new StringBuilder();
		strBld.append("researchWebService():").append(System.lineSeparator()).append(Constants.BREAK);

		for (WebSe webSe : webSeArr) {
			strBld.append(webSe.tryIt(text)).append(System.lineSeparator());
		}
		strBld.append(Constants.BREAK);
		if (logger.isLoggable(Level.INFO)) {
			logger.info(strBld.toString());
		}
		return "";
	}

}