package com.annotations.springdemo;

import org.springframework.stereotype.Component;

@Component
public class ClimbingCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "CLIIIIIIMMMBBB!!!!!!!, Go! go! They are chasing us!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
