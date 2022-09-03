package model; // The package where this class is located at

/**
 * @author Ilia Bravard - igbravard
 * CIS175 - Fall 2022
 * Sep 2, 2022
 */

import controller.BravardFencing; // To allow access to the controller class

// This is  the class that constructs the business logic of the application
public class BdFencingModel {

	// Declaring the needed instance variables
	private String fenceType;
	private int fenceLength;
	private double price;

	/**
	 * This is the default, no argument constructor.
	 */
	public BdFencingModel() {

	}

	/**
	 * This is the default constructor that sets the instance variables of this
	 * class.
	 * 
	 * @param type   the type of the fence (wood, vinyl, chain-link, ot steel)
	 * @param length how long the fence will be (in feet)
	 */
	public BdFencingModel(String type, int length) {
		this.fenceType = type;
		this.fenceLength = length;
	}

	// Declaring the needed accessors and mutators
	public String getFenceType() {
		return fenceType;
	}

	/**
	 * This method sets the value for the fence type and checks whether a valid
	 * input has been enterered (i.e. the customer can only choose between wood,
	 * vinyl, chain-link, and steel types).
	 * 
	 * @param fenceType the type of the fence
	 */
	public void setFenceType(String fenceType) {
		if (!(fenceType.equalsIgnoreCase("wood") || fenceType.equalsIgnoreCase("vinyl")
				|| fenceType.equalsIgnoreCase("chain-link") || fenceType.equalsIgnoreCase("steel"))) {
			fenceType = null;
			System.out.println("We do not build this type of fence!");
		}
		this.fenceType = fenceType;
	}

	public int getFenceLength() {
		return fenceLength;
	}

	public void setFenceLength(int fenceLength) {
		this.fenceLength = fenceLength;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * This is a helper method to verify that the fence has been approved by the
	 * city.
	 * 
	 * @return true(approved), false (not approved)
	 */
	public boolean toBuild(BravardFencing fence) {
		if (fence.isApprovedByCity() == false) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * This method determines the price for the fence based on the linear footage as
	 * well as the cost per each foot.
	 * 
	 * @return the price of the fence
	 */
	public double determinePrice() {

		// Declaring the constants to avoid magic numbers and to set the price per
		// linear footage
		final double woodFootage = 45.66;
		final double vinylFootage = 65.78;
		final double chainLinkFootage = 38.54;
		final double steelFootage = 40.01;

		if (this.getFenceType() == "wood") {
			this.setPrice(fenceLength * woodFootage);
		} else if (this.getFenceType() == "vinyl") {
			this.setPrice(fenceLength * vinylFootage);
		} else if (this.getFenceType() == "chain-link") {
			this.setPrice(fenceLength * chainLinkFootage);
		} else {
			this.setPrice(fenceLength * steelFootage);
		}
		return this.getPrice();
	}
}