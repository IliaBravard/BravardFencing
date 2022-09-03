package tests; // This is the package where the first model test is at

/**
 * @author Ilia Bravard - igbravard
 * CIS175 - Fall 2022
 * Sep 2, 2022
 */

import static org.junit.Assert.*;

import org.junit.Before; // Allows for the use of the setUp() method
import org.junit.Test; // Allows for the use of the assert methods

import controller.BravardFencing; // Allows access to the controller class
import model.BdFencingModel; // Allows access to the model class

// This is the first model test class
public class ModelTestOne {

	// Instantiating the needed objects for testing
	BdFencingModel woodFence = new BdFencingModel("wood", 175);
	BdFencingModel vinylFence = new BdFencingModel("vinyl", 200);
	BravardFencing fence1 = new BravardFencing();

	/**
	 * This method is run first before any other test.
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * This assertEquals() method tests the determinePrice() method of the model
	 * class.
	 */
	@Test
	public void testPrice() {
		assertEquals(woodFence.determinePrice(), 7990.5, 0.01); // Here I am using a delta value to compare double
		assertEquals(vinylFence.determinePrice(), 13156, 0.01); // values
	}

	/**
	 * This assertTrue() method tests the createEmail() method of the controller
	 * class.
	 */
	@Test
	public void testEmail() {
		fence1.setCustomerName("ChriStOPheR");
		String email = "christopher@bravardfencing.com";
		assertTrue((fence1.createEmail()).equals(email));
	}

	/**
	 * This assertFalse() method tests the setApprovedByCity() method of the model
	 * class.
	 */
	@Test
	public void testApproval() {
		fence1.setApprovedByCity(false);
		assertFalse(woodFence.toBuild(fence1) == true);
	}
}