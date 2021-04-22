package org.howard.edu.lsp.exam.question41.junit;
import org.howard.edu.lsp.exam.question41.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class removeZeroesTest {

	@Test
	@DisplayName("Test cases for removing 0s from an ArrayList")
	public void removeZeroesTester() {
		
		ArrayList<Integer> arrlist = new ArrayList<Integer>(7);

		arrlist.add(0);
		arrlist.add(10);
		arrlist.add(5);
		arrlist.add(25);
		arrlist.add(6);
		arrlist.add(0);
		arrlist.add(1);
		removeZeros(arrlist);
		
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
		
		removeZeros(arrlist2);
		
		int length2 = arrlist2.size();
		assertEquals(length2, 5);
        
		}

	private void removeZeros(ArrayList<Integer> arrlist) {
		// TODO Auto-generated method stub
		for (int index = 0; index < arrlist.size(); index++)
			if(arrlist.get(index) == 0)
			arrlist.remove(index);
		
	}

	

}
