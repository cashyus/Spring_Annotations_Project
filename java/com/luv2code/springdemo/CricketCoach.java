package com.luv2code.springdemo;

public class CricketCoach implements Coach{
		//these two variables were added for setter injection tutorial
	private String emailAddress;
	private String team;
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside the setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		System.out.println("CricketCoach: inside the setter method - setTeam");
		this.team = team;
	}
	//------------------------------------------------------------
	private FortuneService fortuneService;
	
	public CricketCoach(){
		System.out.println(" cricket coach: im inside this no arg-constructor");
		
	}
	//called by spring during setter injection 
	public void setFortuneService(FortuneService fortuneService){
		System.out.println("CricketCoach: inside the setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// 
		return "i love cricket so much that i do it for 30 minutes";
	}
	@Override
	public String getDailyFortune() {
		// have to use the helper method stuff here
		return "THIS IS THE CRICKET COACH: I DONT ACTUALLY DO CRICKET\n" + fortuneService.getFortune();
	}
}
