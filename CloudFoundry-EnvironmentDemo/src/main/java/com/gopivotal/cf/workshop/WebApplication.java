package com.gopivotal.cf.workshop;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * Used to initialize the app when packaged as a JAR
 * @author kkrueger
 */
public class WebApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Config.class);
	}

	
}
