package com.one.springdemo;

public class ClimbingCoach implements Coach {


	private FortuneService fortuneService;
	private String emailAdress;
	private String team;
	
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
	
	public String getEmailAdress() {
		System.out.println("ClimbingCoach: inside email adress");
		return emailAdress;
	}
	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}

}
