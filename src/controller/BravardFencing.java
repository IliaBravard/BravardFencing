package controller; // The package where this class is located at

/**
 * @author Ilia Bravard - igbravard
 * CIS175 - Fall 2022
 * Sep 2, 2022
 */

// This is the first class for this application
public class BravardFencing {

	// These are the fields for this class
	private String customerName;
	private String address;
	private String typeOfBuilding;
	private boolean approvedByCity;

	/**
	 * This is the default, no argument constructor
	 */
	public BravardFencing() {

	}

	/**
	 * This is the non-default constructor that sets the fields of this class.
	 * 
	 * @param name     the customer name for whom the fence will be built
	 * @param location the place where the fence would be built
	 * @param building the type of building for the fence (duplex, apartment, house,
	 *                 mention, etc.)
	 * @param approved whether the fence is approved by the city or not
	 */
	public BravardFencing(String name, String location, String building, boolean approved) {
		this.customerName = name;
		this.address = location;
		this.typeOfBuilding = building;
		this.approvedByCity = approved;
	}

	// Generating the needed accessors and mutators
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTypeOfBuilding() {
		return typeOfBuilding;
	}

	public void setTypeOfBuilding(String typeOfBuilding) {
		this.typeOfBuilding = typeOfBuilding;
	}

	public boolean isApprovedByCity() {
		return approvedByCity;
	}

	public void setApprovedByCity(boolean approvedByCity) {
		this.approvedByCity = approvedByCity;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * This is a helper method that sets the email address for each customer.
	 * 
	 * @return the customer's email address
	 */
	public String createEmail() {
		String email = this.getCustomerName().toLowerCase() + "@bravardfencing.com";
		return email;
	}

	/**
	 * This is a helper method to help with debugging.
	 * 
	 * @return a string line showcasing the values for each instance variable used
	 *         in this class
	 */
	@Override
	public String toString() {
		return "BravardFencing [customerName = " + customerName + ", address = " + address + ", typeOfBuilding = "
				+ typeOfBuilding + ", approvedByCity = " + approvedByCity + "]";
	}
}