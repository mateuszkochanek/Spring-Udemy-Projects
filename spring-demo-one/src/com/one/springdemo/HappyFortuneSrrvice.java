package com.one.springdemo;

import java.util.Random;

public class HappyFortuneSrrvice implements FortuneService {

	Random random = new Random();
	@Override
	public String getFortune() {
		int x;
		String[] Fortunes= new String[5];
		for(int i = 0; i<5 ; i++) {
			Fortunes[i] = "Fortune number= " + i;
		}
		x = random.nextInt(5);
		return Fortunes[x];
	}

}
