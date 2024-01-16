package kp.r_s;

import java.io.Serial;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

/**
 * The RESTful Web Services implemented as a stateless session bean.
 *
 */
@Stateless
@Path("text")
public class ReSe implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * The {@link Logger}.
	 */
	@SuppressWarnings("java:S6813") // switch off Sonarqube rule 'Avoid field dependency injection'
	@Inject
	private transient Logger logger;

	/**
	 * The constructor.
	 */
	public ReSe() {
		super();
	}

	/**
	 * Gets the text.
	 * 
	 * @return the text
	 */
	@GET
	public String getText() {
		if (logger.isLoggable(Level.INFO)) {
			logger.info("getText():");
		}
		return "text from 'ReSe' (no-interface view stateless session bean)";
	}
}