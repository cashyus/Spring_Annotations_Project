package com.luv2code.springdemoAnnotations;

import org.springframework.stereotype.Component;

@Component //when you don't specificlly set the beanid, default bean id gets created to class name 'tennisCoach'
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Tennis Coach: practice your backhand volley";
	}

}
