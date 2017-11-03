package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService{

	//defines the language here on what the fortuneservice method will send to the coach classess
	public String getFortune(){
		
		// new method dependency implmenting a random generator of string array
		String[] randomFortune = {"Today is a good day","You might have a bad day", "Good luck"};
		int idx = new Random().nextInt(randomFortune.length);
		String random = (randomFortune[idx]);
		
		return random;
	}
}
