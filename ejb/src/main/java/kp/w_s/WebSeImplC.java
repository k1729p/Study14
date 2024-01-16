package kp.w_s;

import java.io.Serial;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.jws.WebService;

/**
 * The web service endpoint {@link WebSe} implemented as a <b>stateless</b>
 * session bean.
 *
 */
@Stateless
@WebService
public class WebSeImplC implements WebSe {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * The {@link Logger}.
	 */
	@SuppressWarnings("java:S6813") // switch off Sonarqube rule 'Avoid field dependency injection'
	@Inject
	private transient Logger logger;

	/**
	 * The report.
	 */
	@SuppressWarnings("java:S6813") // switch off Sonarqube rule 'Avoid field dependency injection'
	@Inject
	private List<String> report;

	/**
	 * The constructor.
	 */
	public WebSeImplC() {
		super();
	}

	/**
	 * {@inheritDoc} Implemented.
	 * 
	 */
	@Override
	public String tryIt(String arg) {

		final String msg = String.format("implementation[%s], arg[%s]", this.getClass().getSimpleName(), arg);
		report.add(msg);
		if (logger.isLoggable(Level.INFO)) {
			logger.info("tryIt():");
		}
		return msg;
	}
}