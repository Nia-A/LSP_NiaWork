package org.howard.edu.lsp.assignment4.test;
import org.howard.edu.lsp.assignment4.implementation.IntegerSet;
import org.howard.edu.lsp.assignment4.implementation.IntegerSetException;


public class testDriver {
	/**
	 * 
	 * @param args This holds all of the test cases for my IntegerSet
	 * @throws IntegerSetException throws an exception if a set is empty
	 */

	public static void main(String[] args) throws IntegerSetException {

		IntegerSet testSetOne = new IntegerSet();
		IntegerSet testSetTwo = new IntegerSet();
		IntegerSet testSetThree = new IntegerSet();
		
		testSetOne.add(5);
		testSetOne.add(10);
		testSetOne.add(15);
		testSetOne.add(20);
		System.out.println("Set 1: " + testSetOne);
		
		// Check for the length of specified set
		System.out.println("The length of the set is: " + testSetOne.length());
		
		testSetTwo.add(5);
		testSetTwo.add(10);
		testSetTwo.add(15);
		testSetTwo.add(20);
		System.out.println("Set 2: " + testSetTwo);
		
		// Check for the length of specified set		
		System.out.println("The length of the set is: " + testSetTwo.length());
		
		System.out.println("Set 3: " + testSetThree);
		
		// Check for the length of specified set		
		System.out.println("The length of the set is: " + testSetThree.length());
	
		// Checks if two sets are equal
		System.out.println("These sets are equal: " + testSetOne.equals(testSetThree));
		System.out.println("These sets are equal: " + testSetOne.equals(testSetTwo));
		
		// Checks if a set contains the given value
		int testValue1 = 15;
		int testValue2 = 9;
		System.out.println("Is " + testValue1 + " in set one: " + testSetOne.contains(testValue1));
		System.out.println("Is " + testValue1 + " in set two: " + testSetTwo.contains(testValue1));
		System.out.println("Is " + testValue2 + " in set two: " + testSetTwo.contains(testValue2));
		
		// Checks for the smallest number in the set
		System.out.println("The smallest number in set one is: " + testSetOne.smallest());
		System.out.println("The smallest number in set two is: " + testSetTwo.smallest());
		
		// Checks for smallest number with an exception
		try {
			testSetThree.smallest();
		}
		catch (Exception e) {
			System.out.println("Warning: This set is empty!");
		}
		
		
		// Checks for largest number in the set
		System.out.println("The largest number in set one is: " + testSetOne.largest());
		System.out.println("The largest number in set one is: " + testSetOne.largest());
		
		// Checks for largest number with an exception
		try {
			testSetThree.largest();
		}
		catch (Exception e) {
			System.out.println("Warning: This set is empty!");
		}

		// Checks for adding an item to the set
		int item1 = 12;
		testSetOne.add(item1);
		System.out.println(item1 + " added to set one: " + testSetOne);
		
			// Tests adding multiple items to one set
		int item2 = 21;
		int item3 = 50;
		testSetTwo.add(item2);
		testSetTwo.add(item3);
		System.out.println(item2 + " and " + item3 + " added to set two: " + testSetTwo);
		
			// Checks for adding an item added that's already in the set
		int item4 = 21;
		testSetTwo.add(item4);
		System.out.println(item4 + " added to set Two: " + testSetTwo);

		// Checks removing an item from the set
		testSetOne.remove(item1);
		System.out.println(item1 + " removed from set 1: " + testSetOne);
		
			// Checks removing multiple items from the set
		testSetTwo.remove(item2);
		testSetTwo.remove(item3);
		System.out.println(item2 + " and " + item3 + " removed from set 2: " + testSetTwo);
			// Checks removing an item if item not in set
		testSetTwo.remove(item4);
		System.out.println(item4 + " removed from set 2: " + testSetTwo);

		// Checks if a set is empty
		System.out.println("Test set 3 is empty: " + testSetThree.isEmpty());
		System.out.println("Test set 1 is empty: " + testSetOne.isEmpty());
		
		// Checks returning a string representation of the set
		System.out.println("A string representation: " + testSetOne.toString());
		
		
		// Checks the difference of two equal sets
		testSetOne.diff(testSetTwo);
		System.out.println("Difference of set 1 and set 2 is: " + testSetOne);

		testSetOne.add(5);
		testSetOne.add(10);
		testSetOne.add(15);
		testSetOne.add(20);
		testSetOne.add(56);
		System.out.println("Set 1: " + testSetOne);
		
		testSetTwo.add(5);
		testSetTwo.add(10);
		testSetTwo.add(15);
		testSetTwo.add(20);
		System.out.println("Set 2: " + testSetTwo);
			
		// Checks difference of two diff sets
		testSetOne.diff(testSetTwo);
		System.out.println("Difference of set 1 and set 2 is: " + testSetOne);

	
		
		// Checks for a clearing of the set
		testSetTwo.clear();
		System.out.println("Set 2 cleared is: " + testSetTwo);
	
	}

}
