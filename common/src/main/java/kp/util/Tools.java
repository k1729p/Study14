package kp.util;

import java.lang.invoke.MethodHandles;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.IntStream;

import javax.xml.namespace.QName;

import jakarta.xml.ws.Service;
import kp.Constants;
import kp.w_s.WebSe;

/**
 * The tools.
 *
 */
public class Tools {

	private static final Logger logger = Logger.getLogger(MethodHandles.lookup().lookupClass().getName());

	private static final String WSDL_LOC_PREFIX = "http://localhost:8080/Study14_ejb";
	private static final String[] IMPL_NAME_ARR = new String[] { "WebSeImplA", "WebSeImplB", "WebSeImplC" };

	/**
	 * The hidden constructor.
	 */
	private Tools() {
		super();
	}

	/**
	 * Gets the text list.
	 * 
	 * @return the textList
	 */
	public static List<String> getTextList() {
		return IntStream.concat(//
				IntStream.rangeClosed("A".codePointAt(0), "Z".codePointAt(0)), //
				IntStream.rangeClosed("a".codePointAt(0), "z".codePointAt(0)))//
				.mapToObj(num -> Character.toString((char) num)).toList();
	}

	/**
	 * Creates the web services implementations.
	 * 
	 * @return the {@link WebSe} instances array
	 * @throws KpException the {@link KpException}
	 */
	public static WebSe[] createWebSeImplementations() throws KpException {

		final WebSe[] webSeArr = new WebSe[3];
		for (int i = 0; i < IMPL_NAME_ARR.length; i++) {
			webSeArr[i] = createWebSeImpl(IMPL_NAME_ARR[i]);
		}
		return webSeArr;
	}

	/**
	 * Creates the web service implementation.
	 * 
	 * @param implName the implementation name
	 * @return the {@link WebSe} instance
	 * @throws KpException the {@link KpException}
	 */
	private static WebSe createWebSeImpl(String implName) throws KpException {

		final String wsdlDocumentLocation = String.format("%s/%s?wsdl", WSDL_LOC_PREFIX, implName);
		final String localPart = String.format("%sService", implName);
		final Service service = createService(wsdlDocumentLocation, localPart);
		return service.getPort(WebSe.class);
	}

	/**
	 * Creates the service.
	 * 
	 * @param wsdlDocumentLocation the WSDL document location
	 * @param localPart            the local part
	 * @return the {@link Service}
	 * @throws KpException the {@link KpException}
	 */
	private static Service createService(String wsdlDocumentLocation, String localPart) throws KpException {

		final URL wsdlDocumentLocationURL;
		try {
			wsdlDocumentLocationURL = new URI(wsdlDocumentLocation).toURL();
		} catch (URISyntaxException | MalformedURLException ex) {
			logger.severe(String.format("researchWebService(): exception[%s]", ex.getMessage()));
			throw new KpException();
		}
		final QName serviceName = new QName(Constants.TARGET_NAMESPACE, localPart);
		return Service.create(wsdlDocumentLocationURL, serviceName);
	}

}
