package com.luv2code.springdemoAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		//call the classpath xml context file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringDemoAnnotations-ApplicationContext.xml");
		
		//get the bean
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		//call the method
		
		System.out.println(theCoach.getDailyWorkout());
		//close the context
		context.close();
	}

}
