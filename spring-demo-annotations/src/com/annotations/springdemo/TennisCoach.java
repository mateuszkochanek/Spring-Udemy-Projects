package com.annotations.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	/*@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	public TennisCoach() {
		System.out.println("Inside default tennis coach const");
	}
	
	@PostConstruct
	public void doStartup() {
		System.out.println("Doing startup");
	}
	
	@PreDestroy
	public void doCleanup() {
		System.out.println("Destoy");
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
