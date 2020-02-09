// L3 Assignment
// Author: Ethan Rutledge
// Date: Jan 29, 2020
// Class: CS165
// ethanrut@rams.colostate.edu

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TestCases {

	//Switch which line is commented out in order to test the correct vs broken code
	//TestingFunctions functions = new BlackBoxCorrect();
	//TestingFunctions functions = new BlackBoxIncorrect();
	TestingFunctions functions = new MyFunctions();
	
	/**
	 * This is a simple validity check for the method greatestCommonDivisor. Checks that the method
	 * returns the correct result for a known GCD problem gcd(2,4) = 2
	 */
	@Test
	public void testGCD() {
		assertEquals("Error: should return 2", 2, functions.greatestCommonDivisor(2, 4));
	}
	
	@Test
	public void testFirstNeg() {
		assertEquals("Error: should return -1", -1, functions.greatestCommonDivisor(-2, 4));
	}
	
	@Test
	public void testSecNeg() {
		assertEquals("Error: should return -1", -1, functions.greatestCommonDivisor(2, -4));
	}
	
	@Test
	public void testBothNeg() {
		assertEquals("Error: should return -1", -1, functions.greatestCommonDivisor(-2, -4));
	}
	
	
	@Test
	public void testFirst0() {
		assertEquals("Error: should return 4", 4, functions.greatestCommonDivisor(0, 4));
	}
	

	@Test
	public void testSec0() {
		assertEquals("Error: should return 2", 2, functions.greatestCommonDivisor(2, 0));
	}
	
	@Test
	public void testBoth0() {
		assertEquals("Error: should return 0", 0, functions.greatestCommonDivisor(0, 0));
	}
	
	@Test
	public void testSame() {
		assertEquals("Error: shoudl return 3", 3, functions.greatestCommonDivisor(3, 3));
	}
	
	@Test
	public void testFirstisGCD() {
		assertEquals("Error: should return 3", 3, functions.greatestCommonDivisor(3, 9));
	}
	
	/**
	 * This is a simple check of the reverseWindow method. Checks if the method will reverse the entire contents
	 * of the passed array correctly.
	 */
	
	public int[] test = {1,2,3,4,5};
	
	@Test
	public void testReverseWindow() {
		int[] result = {3,2,1,4,5};
		functions.reverseWindow(test, 0, 3);
		assertArrayEquals(result, test);
	}
	
	@Test
	public void testFirstIndexOutofBounds() {
		functions.reverseWindow(test, -1, 4);
	}
	
	@Test
	public void testLastIndexOutofBounds() {
		functions.reverseWindow(test, 0, 8);
	}
	
	@Test
	public void testFirstIndexAtBound() {
		int[] result = {3,2,1,4,5};
		functions.reverseWindow(test, 0, 3);
		assertArrayEquals(result, test);
	}
	
	@Test
	public void testLastIndexAtBound() {
		int[] result = {1,4,3,2,5};
		functions.reverseWindow(test, 1, 4);
		assertArrayEquals(result, test);
	}
	
	@Test
	public void testSwitchedIndices() {
		int[] result = {1,4,3,2,5};
		functions.reverseWindow(test, 4, 1);
		assertArrayEquals(result, test);
	}
	
	@Test
	public void testEmptyInputArray() {
		int[] empty = {};
		functions.reverseWindow(empty, 0, 0);
		assertArrayEquals(empty, empty);
	}
	
	@Test
	public void testEqualIndices() {
		functions.reverseWindow(test, 2, 2);
		assertArrayEquals(test,test);
	}
	
	

	//For completion, write additional tests as described in the lab documentation.
}
