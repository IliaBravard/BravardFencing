package tests; //This is the package where the test suite is located at

/**
 * @author Ilia Bravard - igbravard
 * CIS175 - Fall 2022
 * Sep 2, 2022
 */

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

// This test suite runs the two model tests all at once which provides for efficiency and saves time.
@RunWith(Suite.class)
@SuiteClasses({ ModelTestOne.class, ModelTestTwo.class })
public class ModelTestsSuite {
}