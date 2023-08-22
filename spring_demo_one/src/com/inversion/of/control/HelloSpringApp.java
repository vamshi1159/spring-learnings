package com.inversion.of.control;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// step1: create a spring container ( load spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// step2: retrieve bean from spring container
		
		// construtor injection example
		Coach theCoach = context.getBean("baseBallCoach",Coach.class);
		
		// use bean
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
		
		// setter injection example
		Coach trackCoach = context.getBean("theCoach", Coach.class);
		
		// use bean
		System.out.println(trackCoach.getDailyFortune());
		System.out.println(trackCoach.getDailyWorkOut());
		
		// setter injection literal example
		Coach cricketCoach = context.getBean("cricketCoach",Coach.class);
		
		// print object
		System.out.println(cricketCoach);
				
		// close the context
		context.close();
		

	}

}
