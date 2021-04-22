package org.howard.edu.lsp.exam.question41;

import java.util.ArrayList;
/**
 * 
 * @author niaanderson
 * Method removes zeros from a given ArrayList
 */
public class zeroesRemoved {

	//
	/**
	 * removeZeros method removes any zeros from a list
	 * @param arrlist is the Arraylist containing the numbers
	 */
	public void removeZeros(ArrayList<Integer> arrlist) {
	for (int index = 0; index < arrlist.size(); index++)
	if(arrlist.get(index) == 0)
	arrlist.remove(index);
	}
}
