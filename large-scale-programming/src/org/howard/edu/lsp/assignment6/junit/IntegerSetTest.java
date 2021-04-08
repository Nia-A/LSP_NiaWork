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
		
		testSetOne.add(1);
		testSetOne.add(2);
		testSetOne.add(3);
		testSetOne.add(4);
		
		int outcome = testSetOne.length();
		assertEquals(4, outcome);
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
		assertFalse(outcome);
		assertTrue(outcomeTwo);
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
		
		boolean outcome = testSetOne.contains(testValue1);
		boolean outcomeTwo = testSetTwo.contains(testValue2);
		assertTrue(outcome);
		assertFalse(outcomeTwo);
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
		
		int item1 = 12;
		int item2 = 10;
		
		testSetOne.add(item1);
		testSetTwo.add(item2);	
	
		
		int outcomeOne = testSetOne.length();
		int outcomeTwo = testSetTwo.length();
		
		assertEquals(5, outcomeOne);
		assertEquals(6, outcomeTwo);
		
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
		
		int item1 = 12;
		int item2 = 10;
		
		testSetOne.add(item1);
		testSetTwo.add(item2);	
		testSetOne.remove(item1);
	
		
		int outcomeOne = testSetOne.length();
		int outcomeTwo = testSetTwo.length();
		
		assertEquals(4, outcomeOne);
		assertEquals(6, outcomeTwo);
		
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
		
		testSetOne.add(1);
		testSetOne.add(2);
		testSetOne.add(3);
		
		testSetOne.clear();
		
		String outcome = testSetOne.toString();
		assertEquals("[]", outcome);
	}
	
	@Test
	@DisplayName("Test cases for setting to string")
	public void toStringTest() {
		IntegerSet testSetOne = new IntegerSet();
		
		testSetOne.add(1);
		testSetOne.add(2);
		testSetOne.add(3);
		
		
		String outcome = testSetOne.toString();
		assertEquals("[1,2,3]", outcome);
	}
	
	@Test
	@DisplayName("Test cases for largest item in a set")
	public void largestTest() throws IntegerSetException {
		IntegerSet testSetOne = new IntegerSet();
		IntegerSet testSetTwo = new IntegerSet();
		IntegerSet testSetThree = new IntegerSet();
		
		testSetOne.add(1);
		testSetOne.add(2);
		testSetOne.add(3);
		
		testSetTwo.add(5);
		testSetTwo.add(6);
		testSetTwo.add(7);
		
		int outcomeOne = testSetOne.largest();
		int outcomeTwo = testSetTwo.largest();
		
		
		assertEquals(7, outcomeOne);
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

}
