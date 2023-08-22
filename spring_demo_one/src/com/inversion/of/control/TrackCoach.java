package com.inversion.of.control;

public class TrackCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;
	
	public TrackCoach() {
		super();
	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "run Hard 5km";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}
	

}
