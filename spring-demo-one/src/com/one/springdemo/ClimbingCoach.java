package com.one.springdemo;

public class ClimbingCoach implements Coach {


	private FortuneService fortuneService;
	
	public ClimbingCoach() {
		System.out.println("ClimbingCoach: no-arg const");
	}
	@Override
	public String getDailyWorkout() {
		return "1 hour of bouldering climbing";
	}

	@Override
	public String getDailyFortune() {
		return "GoGoGo! "+ fortuneService.getFortune();
	}
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("ClimbingCoach: setter");
		this.fortuneService = fortuneService;
	}

}
