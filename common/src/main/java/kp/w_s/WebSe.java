package kp.w_s;

import java.io.Serializable;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

/**
 * The web service <B>WebSe</B>.
 *
 */
@WebService
public interface WebSe extends Serializable {
	/**
	 * The business method.
	 * 
	 * @param arg the argument
	 * @return result the result
	 */
	@WebMethod
	String tryIt(String arg);
}