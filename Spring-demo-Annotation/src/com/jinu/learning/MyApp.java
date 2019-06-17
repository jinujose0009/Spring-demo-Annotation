package com.jinu.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach thecoach=context.getBean("tenniesCoach",Coach.class);
		System.out.println(thecoach.getDasilyworkout());
		System.out.println(thecoach.getDasilyFortunes());
		context.close();
	}

}
