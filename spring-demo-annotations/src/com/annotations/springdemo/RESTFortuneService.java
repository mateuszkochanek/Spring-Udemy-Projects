package com.annotations.springdemo;

import org.springframework.stereotype.Component;

@Component	//deafult name of the bean will still be RESTFortuneSErvice, not rESTFortuneService!
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "REST Fortune";
	}

}
