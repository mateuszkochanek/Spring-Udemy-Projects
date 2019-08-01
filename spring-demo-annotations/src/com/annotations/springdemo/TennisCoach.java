package com.annotations.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	/*@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	public TennisCoach() {
		System.out.println("Inside default tennis coach const");
	}
	
	/*@Autowired
	void setFortuneSErvice (FortuneService fortuneService) {
		System.out.println("Inside fortuneSErvice tennis coach setter");
		this.fortuneService = fortuneService;
	}*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
