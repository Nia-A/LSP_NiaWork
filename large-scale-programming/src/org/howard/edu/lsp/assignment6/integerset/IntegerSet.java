package org.howard.edu.lsp.assignment6.integerset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.howard.edu.lsp.assignment4.implementation.IntegerSetException;


/**
 * This IntegerSet class contains methods for several functions
 * @author niaanderson
 *
 */
public class IntegerSet {
	/**
	 * This class contains all of the other smaller functions
	 */
	private List<Integer> set = new ArrayList<Integer>();
	/**
	 * 
	 * @param set creates a new arrayList
	 * @return None
	 */
	public List<Integer> getIntegerList(List<Integer> set) {
		return this.set;
	
	}
	// Clears the internal representation of the set
	public void clear() {
		set.clear();
	}

	// Returns the length of the set
	public int length() {
		int sizeOfList = set.size();
		return sizeOfList;
	} // returns the length

	/*
	 * Returns true if the 2 sets are equal, false otherwise;
	 * Two sets are equal if they contain all of the same values in ANY order.
	*/
	public boolean equals(IntegerSet b) {
		Collections.sort(set);
		if (set.equals(b.getIntegerList(set))){
			return true;
		}
		else {
			return false;
		}
	}

	// Returns true if the set contains the value, otherwise false
	public boolean contains(int value) {
		if (set.contains(value)) {
			return true;
		}
		return false;
	}    

	// Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
	public int largest() throws IntegerSetException {
		int biggestNum = Collections.max(set);
		if (set.isEmpty()) {
			throw new IntegerSetException("Warning: This set is empty!");
		}
		return biggestNum;
	} 

	// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	public int smallest() throws IntegerSetException {
		int smallestNum = Collections.min(set);
		if (set.isEmpty()) {
			throw new IntegerSetException("Warning: This set is empty!");
		}
		return smallestNum;
	}

	// Adds an item to the set or does nothing it already there	
 	public void add(int item) {
 		boolean hasItem = set.contains(item);
 		if (!hasItem) {
 			set.add(item);
 		}
 	}

	// Removes an item from the set or does nothing if not there
	public void remove(int item) {
		boolean hasItem = set.contains(item);
		if (hasItem) {
			//set.remove(item);
			set.remove(Integer.valueOf(item));
		}
	} 

	// Set union
	public void union(IntegerSet intSetb) {
		set.addAll(intSetb.getIntegerList(set));
		set.toString();
		
	}

	// Set intersection
	public void intersect(IntegerSet intSetb) {
		set.retainAll(intSetb.getIntegerList(set));
		set.toString();
	} 

	// Set difference, i.e., s1 –s2
	public void diff(IntegerSet intSetb) {
		set.removeAll(intSetb.getIntegerList(set));
		set.toString();
	} // set difference, i.e. s1 - s2

	// Returns true if the set is empty, false otherwise
	public boolean isEmpty() {
		if (set.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}

	// Return String representation of your set
	public String toString() {
		return set.toString();
	}
	

}

