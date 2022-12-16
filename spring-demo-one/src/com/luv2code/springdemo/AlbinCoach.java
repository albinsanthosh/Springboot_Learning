package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class AlbinCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Hey Albin Spend 30 minutes practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
