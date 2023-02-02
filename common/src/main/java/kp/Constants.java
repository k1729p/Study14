package kp;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * The constants.
 *
 */
public final class Constants {
	/**
	 * The label
	 */
	public static final String LABEL = "* * * 'WebSe' from created service instance: * * *";
	/**
	 * The line separator.
	 */
	public static final String LINE_SEP = System.getProperty("line.separator");
	/**
	 * The long horizontal line with '#'.
	 */
	public static final String BREAK = new StringBuilder()//
			.append(IntStream.rangeClosed(1, 150).boxed().map(arg -> "#").collect(Collectors.joining()))//
			.append(LINE_SEP).toString();
	/**
	 * The target namespace.
	 */
	public static final String TARGET_NAMESPACE = "http://w_s.kp/";

	private Constants() {
		throw new IllegalStateException("Utility class");
	}
}