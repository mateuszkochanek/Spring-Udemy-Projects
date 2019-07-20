package com.one.springdemo;

public class ClimbingCoach implements Coach {


	private FortuneService fortuneService;
	
	public ClimbingCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "1 hour of bouldering climbing";
	}

	@Override
	public String getDailyFortune() {
		return "GoGoGo! "+ fortuneService.getFortune();
	}

}
