package kp.r_s.controller;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;

/**
 * The CDI managed bean for <B>JAX-RS</B> research<BR>
 * (JAX-RS: Java API for RESTful Web Services).
 * 
 */
@Named
@RequestScoped
public class RsManagedBean {

	@SuppressWarnings("java:S6813") // switch off Sonarqube rule 'Avoid field dependency injection'
	@Inject
	private Logger logger;

	@SuppressWarnings("java:S6813") // switch off Sonarqube rule 'Avoid field dependency injection'
	@Inject
	private List<String> report;

	private static final String SERVICE_ENDPOINT = "http://localhost:8080/Study14/rs/text/";

	/**
	 * The constructor.
	 */
	public RsManagedBean() {
		super();
	}

	/**
	 * Researches RESTful web service.
	 * 
	 * @return the result
	 */
	public String researchRestfulWebService() {

		try (Client client = ClientBuilder.newClient()) {
			final WebTarget webTarget = client.target(SERVICE_ENDPOINT);
			final Response response = webTarget.request().get();
			report.add(String.format("JAX-RS response status[%s]", response.getStatusInfo()));
			report.add(String.format("JAX-RS response entity[%s]", response.readEntity(String.class)));
		}
		if (logger.isLoggable(Level.INFO)) {
			logger.info("researchRestfulWebService():");
		}
		return "";
	}
}