package tests; // The package where this class is located at

/**
 * @author Ilia Bravard - igbravard
 * CIS175 - Fall 2022
 * Sep 2, 2022
 */

import controller.BravardFencing; // To provide access to the controller class

// This class represents the controller tester
public class BravardFencingTester {

	/**
	 * This is the main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Testing the createEmail() method
		BravardFencing woodFence = new BravardFencing();
		woodFence.setCustomerName("JaIdEN"); // To check whether the .toLower() method works
		System.out.println(woodFence.createEmail());

		// Testing the toString() helper method to verify initializations
		BravardFencing vinylFence = new BravardFencing("Jace", "999 1st Street, Sandusky, Ohio", "mention", false);
		System.out.println(vinylFence.toString());

		// Testing the default constructor for setting null values
		BravardFencing noFence = new BravardFencing();
		System.out.println(noFence.toString());
	}
}