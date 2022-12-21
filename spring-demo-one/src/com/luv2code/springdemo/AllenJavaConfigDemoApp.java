package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AllenJavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AllenConfig.class);
		
		// get the bean from spring container
		AllenCoach theCoach = context.getBean("allenCoach", AllenCoach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
				
		// call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
		
	}

}


