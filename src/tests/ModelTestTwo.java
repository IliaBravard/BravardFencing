package tests; // This is the package where the second model test is at

/**
 * @author Ilia Bravard - igbravard
 * CIS175 - Fall 2022
 * Sep 2, 2022
 */

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import controller.BravardFencing;
import model.BdFencingModel;

public class ModelTestTwo {

	// Instantiating the needed objects for testing
	BdFencingModel chainLinkFence = new BdFencingModel("chain-link", 313);
	BdFencingModel steellFence = new BdFencingModel("steel", 99);
	BravardFencing fence2 = new BravardFencing();

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
		assertEquals(chainLinkFence.determinePrice(), 12063.02, 0.01);
		assertEquals(steellFence.determinePrice(), 3960.99, 0.01);
	}

	/**
	 * This assertNull() method tests the setFenceType() method of the model class.
	 */
	@Test
	public void testType1() {
		chainLinkFence.setFenceType("aluminum");
		assertNull(chainLinkFence.getFenceType());
	}

	/**
	 * This assertNotNull() method tests the setFenceType() method of the model
	 * class.
	 */
	@Test
	public void testType2() {
		chainLinkFence.setFenceType("wood");
		assertNotNull(chainLinkFence.getFenceType());
	}
}