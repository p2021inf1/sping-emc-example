package com.emc.presentation.annotations.props;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {
	//Example with prototype scope

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext annotationContext = 
				new AnnotationConfigApplicationContext();
		
		annotationContext.scan("com.emc.presentation.annotations.props");
		annotationContext.refresh();
		
		


		HelloWorld helloWorld = (HelloWorld) annotationContext.getBean("helloWorld");
		System.out.println(helloWorld.getUuid());
		System.out.println(helloWorld.getHello());


		HelloWorld helloWorld1 = (HelloWorld) annotationContext
				.getBean("helloWorld");
		System.out.println(helloWorld1.getUuid());
		System.out.println(helloWorld1.getHello());

		annotationContext.close();
	}

}
