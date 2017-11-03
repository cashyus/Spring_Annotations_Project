package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		
		//retrieve beans from the spring container
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		
		
		//check to see if they are the same beans with a boolean
		
		boolean result = (theCoach == alphaCoach);
		
		//print out the results here
		
		System.out.println("\nPoint to the same object = " + result);
		
		
		System.out.println("\nMemory location for theCoach: " + theCoach);
		

		System.out.println("\nMemory location for alphaCoach: " + alphaCoach +"\n");

		
		//close context
		
		context.close();
	}

}
