package com.annotations.springdemo;

import org.springframework.stereotype.Component;

@Component("thatCoach")
public class TennisCoach implements Coach {

	@Override
	public String GetDailyWorkout() {
		return "Practice your backhand volley";
	}

}
