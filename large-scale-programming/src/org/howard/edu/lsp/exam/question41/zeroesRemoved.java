package org.howard.edu.lsp.exam.question41;
import java.util.ArrayList;

/**
 * 
 * @author niaanderson
 * Removes any 0 integers from an ArrayList
 */
public class zeroesRemoved {
	/**
	 * 
	 * @param arrlist contains the arraylist with the numbers
	 */
    public void removeZeroes(ArrayList<Integer> arrlist){
        int index = 0;
        while (index < arrlist.size()){
            if(arrlist.get(index)==0){
                arrlist.remove(index);
            }
            else {
                index++;
            }
        }
    }
    }


