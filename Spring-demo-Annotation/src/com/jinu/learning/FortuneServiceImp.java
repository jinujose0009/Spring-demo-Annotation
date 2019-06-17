package com.jinu.learning;

import org.springframework.stereotype.Component;

@Component
public class FortuneServiceImp implements FortuneService {

	@Override
	public String getFortuneService() {
		
		return "Today is your lucky day";
	}

}
