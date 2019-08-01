package com.annotations.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data = {
			"We can easily forgive a child who is afraid of the dark; the real tragedy of life is when men are afraid of the light.\n- Plato",
			"When you light a candle, you also cast a shadow.\n- Ursula K. Le Guin ",
			"Fear is the path to the dark side. Fear leads to anger. Anger leads to hate. Hate leads to suffering.\n- Yoda"
	};
	private Random myRandom = new Random();
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		return data[index];
	}

}
