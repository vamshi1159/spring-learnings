package com.inversion.of.control;

/**
 * @author vamske
 *
 */
public class MyApp {
	/**
	 * main method
	 */
	public static void main(String[] args) {
		// create the object
		Coach theCoach = new TrackCoach();
		
		// use the object
		System.out.println(theCoach.getDailyWorkOut());

	}

}
