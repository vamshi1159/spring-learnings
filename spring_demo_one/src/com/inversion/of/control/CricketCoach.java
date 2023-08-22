package com.inversion.of.control;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	private String emailAddress;
	
	private String team;
	

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "practice for 5 hrs";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

	@Override
	public String toString() {
		return "CricketCoach [emailAddress=" + emailAddress + ", team=" + team + "]";
	}
	
	

}
