package org.howard.edu.lsp.assignment6.junit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
//import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
import org.howard.edu.lsp.assignment6.*;
import org.howard.edu.lsp.assignment4.implementation.IntegerSetException;
import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

class IntegerSetTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	@DisplayName("Test cases for the length of a set")
	public void lengthTest() {
		IntegerSet testSetOne = new IntegerSet();
		IntegerSet testSetTwo = new IntegerSet();
		IntegerSet testSetThree = new IntegerSet();
		
		testSetOne.add(1);
		testSetOne.add(2);
		testSetOne.add(3);
		testSetOne.add(4);
		
		testSetTwo.add(0);
		testSetTwo.add(10);
		
		
		
		int outcomeOne = testSetOne.length();
		int outcomeTwo = testSetTwo.length();
		int outcomeThree = testSetThree.length();
		
		assertEquals(4, outcomeOne);
		assertEquals(2, outcomeTwo);
		assertEquals(0, outcomeThree);
		
	}
	
	@Test
	@DisplayName("Test cases for two equal sets")
	public void equalTest() {
		IntegerSet testSetOne = new IntegerSet();
		IntegerSet testSetTwo = new IntegerSet();
		IntegerSet testSetThree = new IntegerSet();
		
		testSetOne.add(1);
		testSetOne.add(2);
		testSetOne.add(3);
		testSetOne.add(4);
		
		testSetTwo.add(1);
		testSetTwo.add(2);
		testSetTwo.add(3);
		testSetTwo.add(4);
		testSetTwo.add(5);
		
		testSetThree.add(1);
		testSetThree.add(2);
		testSetThree.add(3);
		testSetThree.add(4);
		
		boolean outcome = testSetOne.equals(testSetTwo);
		boolean outcomeTwo = testSetOne.equals(testSetThree);
		boolean outcomeThree = testSetTwo.equals(testSetThree);
		assertFalse(outcome);
		assertTrue(outcomeTwo);
		assertFalse(outcomeThree);
	}
	
	@Test
	@DisplayName("Test cases for containing a given value")
	public void containsTest() {
		IntegerSet testSetOne = new IntegerSet();
		IntegerSet testSetTwo = new IntegerSet();
		IntegerSet testSetThree = new IntegerSet();
		
		testSetOne.add(1);
		testSetOne.add(2);
		testSetOne.add(3);
		testSetOne.add(4);
		
		testSetTwo.add(1);
		testSetTwo.add(2);
		testSetTwo.add(3);
		testSetTwo.add(4);
		testSetTwo.add(5);
		
		testSetThree.add(1);
		testSetThree.add(2);
		testSetThree.add(3);
		testSetThree.add(4);
		
		int testValue1 = 2;
		int testValue2 = 10;
		int testValue3 = 15;
		
		boolean outcome = testSetOne.contains(testValue1);
		boolean outcomeTwo = testSetTwo.contains(testValue2);
		boolean outcomeThree = testSetThree.contains(testValue3);
		assertTrue(outcome);
		assertFalse(outcomeTwo);
		assertFalse(outcomeThree);
	}
	
	@Test
	@DisplayName("Test cases for smallest number in the set")
	public void smallestTest() throws IntegerSetException {
		IntegerSet testSetOne = new IntegerSet();
		IntegerSet testSetTwo = new IntegerSet();
		IntegerSet testSetThree = new IntegerSet();
		
		testSetOne.add(1);
		testSetOne.add(2);
		testSetOne.add(3);
		testSetOne.add(4);
		
		testSetTwo.add(1);
		testSetTwo.add(2);
		testSetTwo.add(3);
		testSetTwo.add(4);
		testSetTwo.add(5);
		
		testSetThree.add(8);
		testSetThree.add(2);
		testSetThree.add(3);
		testSetThree.add(4);
		
		int outcomeOne = testSetOne.smallest();
		int outcomeTwo = testSetTwo.smallest();
		int outcomeThree = testSetThree.smallest();
		
		
		assertEquals(1, outcomeOne);
		assertEquals(1, outcomeTwo);
		assertEquals(2, outcomeThree);
		
	}
	
//	@Test
//	@DisplayName("Test cases for smallest number in the set with exception")
//	public void smallestExcepTest() throws IntegerSetException {
//		IntegerSet testSetOne = new IntegerSet();
//		IntegerSet testSetTwo = new IntegerSet();
//		IntegerSet testSetThree = new IntegerSet();
//		
//		testSetOne.add(1);
//		testSetOne.add(2);
//		testSetOne.add(3);
//		testSetOne.add(4);
//		
//		testSetTwo.add(1);
//		testSetTwo.add(2);
//		testSetTwo.add(3);
//		testSetTwo.add(4);
//		testSetTwo.add(5);
//		
//		testSetThree.add(8);
//		testSetThree.add(2);
//		testSetThree.add(3);
//		testSetThree.add(4);
//		
//		int outcomeOne = testSetOne.smallest();
//		int outcomeTwo = testSetTwo.smallest();
//		int outcomeThree = testSetThree.smallest();
//		
//		
//		assertEquals(1, outcomeOne);
//		assertEquals(1, outcomeTwo);
//		assertEquals(2, outcomeThree);
//		
//	}
	
	@Test
	@DisplayName("Test cases for adding a number to the set")
	public void addTest() throws IntegerSetException {
		IntegerSet testSetOne = new IntegerSet();
		IntegerSet testSetTwo = new IntegerSet();
		IntegerSet testSetThree = new IntegerSet();
		
		testSetOne.add(1);
		testSetOne.add(2);
		testSetOne.add(3);
		testSetOne.add(4);
		
		testSetTwo.add(1);
		testSetTwo.add(2);
		testSetTwo.add(3);
		testSetTwo.add(4);
		testSetTwo.add(5);
		
		testSetThree.add(20);
		testSetThree.add(25);
		
		int item1 = 12;
		int item2 = 10;
		int item3 = -37;
		
		testSetOne.add(item1);
		testSetTwo.add(item2);
		testSetThree.add(item3);
	
		
		int outcomeOne = testSetOne.length();
		int outcomeTwo = testSetTwo.length();
		int outcomeThree = testSetThree.length();
		
		assertEquals(5, outcomeOne);
		assertEquals(6, outcomeTwo);
		assertEquals(3, outcomeThree);
		
	}
	
	@Test
	@DisplayName("Test cases for removing from the set")
	public void removeTest() throws IntegerSetException {
		IntegerSet testSetOne = new IntegerSet();
		IntegerSet testSetTwo = new IntegerSet();
		IntegerSet testSetThree = new IntegerSet();
		
		testSetOne.add(1);
		testSetOne.add(2);
		testSetOne.add(3);
		testSetOne.add(4);
		
		testSetTwo.add(1);
		testSetTwo.add(2);
		testSetTwo.add(3);
		testSetTwo.add(4);
		testSetTwo.add(5);
		
		testSetThree.add(27);
		testSetThree.add(37);
		
		int item1 = 12;
		int item2 = 10;
		int item3 = 27;
		
		testSetOne.add(item1);
		testSetTwo.add(item2);	
		testSetOne.remove(item1);
		testSetThree.remove(item3);
	
		
		int outcomeOne = testSetOne.length();
		int outcomeTwo = testSetTwo.length();
		int outcomeThree = testSetThree.length();
		
		assertEquals(4, outcomeOne);
		assertEquals(6, outcomeTwo);
		assertEquals(1, outcomeThree);
		
	}
	
	@Test
	@DisplayName("Test cases for empty set")
	public void emptyTest() {
		IntegerSet testSetOne = new IntegerSet();
		
		boolean outcome = testSetOne.isEmpty();
		assertTrue(outcome);
	}
	
	
	
	
	@Test
	@DisplayName("Test cases for the clearing of a set")
	public void clearTest() {
		IntegerSet testSetOne = new IntegerSet();
		IntegerSet testSetTwo = new IntegerSet();
		
		testSetOne.add(1);
		testSetOne.add(2);
		testSetOne.add(3);
		
		testSetOne.clear();
		
		String outcomeOne = testSetOne.toString();
		String outcomeTwo = testSetTwo.toString();
		assertEquals("[]", outcomeOne);
		assertEquals("[]", outcomeTwo);
	}
	
	@Test
	@DisplayName("Test cases for setting to string")
	public void toStringTest() {
		IntegerSet testSetOne = new IntegerSet();
		IntegerSet testSetTwo = new IntegerSet();
		
		testSetOne.add(1);
		testSetOne.add(2);
		testSetOne.add(3);
		
		testSetTwo.add(45);
		testSetTwo.add(27);
		testSetTwo.add(51);
		
		
		String outcomeOne = testSetOne.toString();
		String outcomeTwo = testSetTwo.toString();
		
		assertEquals("[1, 2, 3]", outcomeOne);
		assertEquals("[45, 27, 51]", outcomeTwo);
	}
	
	@Test
	@DisplayName("Test cases for largest item in a set")
	public void largestTest() throws IntegerSetException {
		IntegerSet testSetOne = new IntegerSet();
		IntegerSet testSetTwo = new IntegerSet();
		
		testSetOne.add(1);
		testSetOne.add(2);
		testSetOne.add(3);
		
		testSetTwo.add(5);
		testSetTwo.add(6);
		testSetTwo.add(7);
		
		int outcomeOne = testSetOne.largest();
		int outcomeTwo = testSetTwo.largest();
		
		
		assertEquals(3, outcomeOne);
		assertEquals(7, outcomeTwo);
		
	}
	
//	@Test
//	@DisplayName("Test cases for largest number in the set with exception")
//	public void largestExcepTest() throws IntegerSetException {
//		IntegerSet testSetOne = new IntegerSet();
//		IntegerSet testSetTwo = new IntegerSet();
//		IntegerSet testSetThree = new IntegerSet();
//		
//		testSetOne.add(1);
//		testSetOne.add(2);
//		testSetOne.add(3);
//		testSetOne.add(4);
//		
//		testSetTwo.add(1);
//		testSetTwo.add(2);
//		testSetTwo.add(3);
//		testSetTwo.add(4);
//		testSetTwo.add(5);
//		
//		testSetThree.add(8);
//		testSetThree.add(2);
//		testSetThree.add(3);
//		testSetThree.add(4);
//		
//		int outcomeOne = testSetOne.smallest();
//		int outcomeTwo = testSetTwo.smallest();
//		int outcomeThree = testSetThree.smallest();
//		
//		
//		assertEquals(1, outcomeOne);
//		assertEquals(1, outcomeTwo);
//		assertEquals(2, outcomeThree);
//		
//	}
	
	@Test
	@DisplayName("Test cases for union")
	public void unionTest() {
		IntegerSet testSetOne = new IntegerSet();
		IntegerSet testSetTwo = new IntegerSet();
		
		testSetOne.add(1);
		testSetOne.add(2);
		testSetOne.add(3);
		
		testSetTwo.add(5);
		testSetTwo.add(6);
		testSetTwo.add(7);
		testSetOne.union(testSetTwo);
		
		String outcomeOne = testSetOne.toString();
		
		assertEquals("[1, 2, 3, 5, 6, 7]", outcomeOne);
		
	}
	
	@Test
	@DisplayName("Test cases for intersection")
	public void intersectionTest() {
		IntegerSet testSetOne = new IntegerSet();
		IntegerSet testSetTwo = new IntegerSet();
		
		testSetOne.add(1);
		testSetOne.add(2);
		testSetOne.add(3);
		
		testSetTwo.add(1);
		testSetTwo.add(6);
		testSetTwo.add(3);
		testSetOne.intersect(testSetTwo);
		
		String outcomeOne = testSetOne.toString();
		
		assertEquals("[1, 3]", outcomeOne);
		
	}
	
	@Test
	@DisplayName("Test cases for difference")
	public void diffTest() {
		IntegerSet testSetOne = new IntegerSet();
		IntegerSet testSetTwo = new IntegerSet();
		
		testSetOne.add(1);
		testSetOne.add(2);
		testSetOne.add(3);
		
		testSetTwo.add(1);
		testSetTwo.add(6);
		testSetTwo.add(3);
		testSetOne.diff(testSetTwo);
		
		String outcomeOne = testSetOne.toString();

		
		
		assertEquals("[2]", outcomeOne);

		
	}
	

}
