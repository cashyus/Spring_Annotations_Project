package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//no argument constructor created to remove error from the prototype in myApp.java
	public TrackCoach(){
		
	}
	
		//this is a constructor with the fortuneservice field
	public TrackCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
				
		
		return "run a hard 5k!";
	}

	@Override
	public String getDailyFortune() {
		//
		
		//this language here is different to show the difference when changing in the config file for which class is being called
		
		
		return "Just Do it: " + fortuneService.getFortune();
	}

	//adding an init method here
		public void doMyStartUpStuff(){
			System.out.println("TrackCoach class: inside the method domystartupStuff()");
		}
	
	
	//adding a destroy method here
	public void doMyCleanUpStuffDestroy(){
		System.out.println("Trackcoach class: inside the method domycleanupStuff()");
	}
}
