package com.emc.presentation.pure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {
	
	@Bean(name= "helloWorld")
	public HelloWorld helloworld() {
		HelloWorld helloworld = new HelloWorld();
		helloworld.setHello("Hello World using pure Configuration Classes");
		return helloworld;
	}

}
