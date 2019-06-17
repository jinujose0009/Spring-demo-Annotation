package com.jinu.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class TenniesCoach implements Coach {
    FortuneService fortuneService;
    
    @Autowired
	public TenniesCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDasilyworkout() {
		return "Practive daily backhand volley";
	}

	@Override
	public String getDasilyFortunes() {
		// TODO Auto-generated method stub
		return fortuneService.getFortuneService();
	}

}
