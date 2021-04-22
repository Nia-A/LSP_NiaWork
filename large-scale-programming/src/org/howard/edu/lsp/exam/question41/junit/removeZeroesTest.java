package org.howard.edu.lsp.exam.question41.junit;
import org.howard.edu.lsp.exam.question41.zeroesRemoved;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class removeZeroesTest {

	zeroesRemoved num = new zeroesRemoved();

	
	@Test
	@DisplayName("Test cases for removing 0s from an ArrayList")
	public void removeZeroesTester() {
		
		ArrayList<Integer> arrlist = new ArrayList<Integer>();

		arrlist.add(0);
		arrlist.add(10);
		arrlist.add(5);
		arrlist.add(25);
		arrlist.add(6);
		arrlist.add(0);
		arrlist.add(1);
		num.removeZeroes(arrlist);
		
		int length = arrlist.size();
		assertEquals(length, 5);
		
		ArrayList<Integer> arrlist2 = new ArrayList<Integer>(7);
		
		arrlist2.add(0);
		arrlist2.add(7);
		arrlist2.add(2);
		arrlist2.add(0);
		arrlist2.add(0);
		arrlist2.add(4);
		arrlist2.add(1);
		
		num.removeZeroes(arrlist2);
		
		int length2 = arrlist2.size();
		assertEquals(length2, 4);
		
		
	
		}
	
	@Test
	@DisplayName("Test cases for removing 0s from an ArrayList with negatives")
	public void removeZeroesNegativeTester() {
		
		ArrayList<Integer> arrlist = new ArrayList<Integer>();

		arrlist.add(0);
		arrlist.add(-10);
		arrlist.add(5);
		arrlist.add(-28);
		arrlist.add(6);
		arrlist.add(0);
		arrlist.add(1);
		arrlist.add(0);
		arrlist.add(2);
		num.removeZeroes(arrlist);
		
		int length = arrlist.size();
		assertEquals(length, 6);
		
		
		}
	
	@Test
	@DisplayName("Test cases for removing 0s from an empty ArrayList")
	public void removeEmptyZeroesTester() {
		
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		int length = arrlist.size();

		assertEquals(length, 0);
		
	
		}

	
}