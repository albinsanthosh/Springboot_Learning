package com.luv2code.springdemo;

public class AllenCoach implements Coach {

	private FortuneService fortuneService;
	
	public AllenCoach(FortuneService fortuneService) {
		// TODO Auto-generated constructor stub
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Hey Allen Here, run 100 miles";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
