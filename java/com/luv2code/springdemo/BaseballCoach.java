package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	//define a private field for the dependency(fortuneService)
	private FortuneService fortuneService;

	@Override
		public String getDailyWorkout(){
			return "Spending 30 minutes on batting practice";
		}
	//this is a constructor the defines thefortuneservice private field -- constructor for dependency injection
	//spring will construct the object and pass in the dependency and then we accept it and assign it = dependency injection
	public BaseballCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService; 
	}
	@Override
	public String getDailyFortune() {
		//use myFortuneService to get a fortunes
		//for the fortunes he needs a dependency = helper but for the dialy workout this class can do it by itself
		
		// this is the helper we created
		return fortuneService.getFortune(); 
	}
}
