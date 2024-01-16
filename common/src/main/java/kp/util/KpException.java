package kp.util;

import java.io.Serial;

/**
 * The customized exception.
 *
 */
public class KpException extends Exception {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * The constructor.
	 */
	public KpException() {
		super();
	}

	/**
	 * The constructor with the message parameter.
	 * 
	 * @param message the message
	 */
	public KpException(String message) {
		super(message);
	}
}
