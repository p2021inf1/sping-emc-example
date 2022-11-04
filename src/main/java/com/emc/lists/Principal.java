package com.emc.lists;



import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-config2.xml");

		// Property Dependency Injection
		
		TeacherList teacherlist = (TeacherList) context.getBean("teacherList");
		teacherlist.display();

		context.close();
	}

}
