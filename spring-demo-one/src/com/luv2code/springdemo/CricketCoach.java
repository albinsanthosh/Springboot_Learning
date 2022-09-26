package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public CricketCoach() {
		
	}
	
	public CricketCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice batting for 20 min";
	}

	@Override
	public String getDailyFortune() {
		return "Cricket: " + fortuneService.getFortune();
	}

}
