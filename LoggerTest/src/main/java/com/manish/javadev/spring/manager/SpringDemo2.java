package com.manish.javadev.spring.manager;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

/**
 * @author Manish
 * 
 */
public class SpringDemo2 {
	static Logger LOG = Logger.getLogger(SpringDemo2.class);

	public static void main(String[] args) {
		// DOMConfigurator is used to configure logger from xml configuration
		// file
		DOMConfigurator.configure("C:\\Users\\m.d.srivastava\\workspace\\LoggerTest\\log4j-config.xml");

		// Log in console in and log file
		LOG.debug("Log4j appender configuration is successful !!");
		// Logging Levels DEBUG <INFO< WARN< ERROR< FATAL
		LOG.debug("HI");
		System.out.println("Done");
	}
}