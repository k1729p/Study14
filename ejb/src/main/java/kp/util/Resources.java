package kp.util;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import jakarta.enterprise.inject.Produces;
import jakarta.enterprise.inject.spi.InjectionPoint;
import jakarta.inject.Named;

/**
 * The resources.
 *
 */
public class Resources {
	/**
	 * The constructor.
	 */
	public Resources() {
		super();
	}

	/**
	 * Produces the {@link Logger}.
	 * 
	 * @param injectionPoint the injection point
	 * @return logger the {@link Logger}
	 */
	@Produces
	public Logger getLogger(InjectionPoint injectionPoint) {
		final String category = injectionPoint.getMember().getDeclaringClass().getName();
		return Logger.getLogger(category);
	}

	/**
	 * Produces the report list.
	 */
	@Named
	@Produces
	protected static final List<String> report = new ArrayList<>();
}