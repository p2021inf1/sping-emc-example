package com.emc.presentation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {
	
	@Bean(name= "helloWorld")
	public HelloWorld helloworld() {
		
		return new HelloWorld();
	}

}
