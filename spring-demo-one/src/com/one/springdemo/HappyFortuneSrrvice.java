package com.one.springdemo;

public class HappyFortuneSrrvice implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day";
	}

}
