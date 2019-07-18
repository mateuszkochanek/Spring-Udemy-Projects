package com.one.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		//Create a coach
		Coach theCoach = new TrackCoach();
		
		//Use the object
		System.out.println(theCoach.getDailyWorkout());

	}

}
