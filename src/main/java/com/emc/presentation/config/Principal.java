package com.emc.presentation.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext appcontext = new AnnotationConfigApplicationContext(
				SpringConfiguration.class);

		HelloWorld helloWorld = (HelloWorld) appcontext.getBean("helloWorld");
		System.out.println(helloWorld.getHello());

		appcontext.close();
	}

}
