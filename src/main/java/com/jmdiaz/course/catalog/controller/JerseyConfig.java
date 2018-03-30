package com.jmdiaz.course.catalog.controller;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * Configuration class for Jersey Resources
 * @author kentaro
 *
 */
@Component
public class JerseyConfig extends ResourceConfig {

	/*
	 *  Registration resources 
	 */
	public JerseyConfig() {
		registerClasses(CourseCatalogRestController.class);
	}

}
