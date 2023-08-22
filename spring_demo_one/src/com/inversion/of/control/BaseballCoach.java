package com.inversion.of.control;

/**
 * @author vamske
 *
 */
public class BaseballCoach implements Coach {
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for depdency injection
	public BaseballCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	/**
	 * 
	 * @param amb
	 * @return
	 */
	public String getDailyWorkOut() {
		return "Spend 30 minutes on batting Practice";
	}
	@Override
	public String getDailyFortune() {
		
		// use my fortuneService to get a fortune -- dependency inversion
		return fortuneService.getDailyFortune();
	}
	
	


}
