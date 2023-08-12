package com.inversion.of.control;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// step1: create a spring container ( load spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// step2: retrieve bean from spring container
		Coach theCoach = context.getBean("theCoach",Coach.class);
		
		// use bean
		System.out.println(theCoach.getDailyWorkOut());
		
		// close the context
		context.close();
		

	}

}
