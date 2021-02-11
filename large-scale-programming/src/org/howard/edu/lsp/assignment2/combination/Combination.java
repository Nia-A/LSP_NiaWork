package org.howard.edu.lsp.assignment2.combination;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * This program takes an array of integers and a target sum, calculates the 
 * combinations which add up to the desired target sum, and returns it 
 * 
 * @author Nia Anderson
 *
 */
public class Combination {
	
	/**
	 * 
	 * @param inputArray The original array placed into the computeCombinations method
	 * @param targetSum The desired target sum
	 * @return an arraylist containing the indexes of the final combinations that add up to the targetSum
	 */

	public ArrayList<ArrayList<Integer>> computeCombinations(int[] inputArray, int targetSum) {
		
		ArrayList<Integer> temporaryArray = new ArrayList<>(); // a temporary array which holds integers
		ArrayList<ArrayList<Integer>> temporaryCombos = new ArrayList<>(); // a temporary arraylist that contains other arraylists
	    ArrayList<ArrayList<Integer>> finalCombos = new ArrayList<>(); // the final list containing combinations which add up to the targetSum
	    ArrayList<Integer> clonedArray = new ArrayList<>(); // makes a clone of the first initial array

	    
	    int[] sortedArray = inputArray.clone();
	    Arrays.sort(sortedArray); // sorts the input array
	    
	    int diff, temporaryArraySum, temporaryArrayDiff, temporarySum; // initializes the variables

	    
	    // finds if the component in the inputArray is equal adds up to the targetSum
	    for (int num = 0; num < inputArray.length; num++) {  
	      if (inputArray[num] == targetSum) {   // adds to the temporary combos arraylist
	        temporaryArray.add(inputArray[num]); 
	        temporaryCombos.add(temporaryArray); 
	        temporaryArray = new ArrayList<>(); // empties the temporary array
	      }
	    }
	    
	    // iterates through the sorted array backwards
	    for (int i = sortedArray.length - 1; i >= 0; i--) { 
	    	temporarySum = sortedArray[i];
	    	temporaryArray.add(sortedArray[i]);

	    	// adds items within the input array to the temporary array only if their sum is equal to the target sum
	    	for (int j = i - 1; j >= 0; j--) {
		      diff = targetSum - temporarySum;
		      
		      if (sortedArray[j] <= diff && sortedArray[j] != targetSum) {
		        temporaryArray.add(sortedArray[j]);
		        temporarySum += sortedArray[j];
		        
		        if(temporarySum == targetSum) {
		          temporaryCombos.add(temporaryArray);
		        }
		      }
		   // finds the sum and the difference of the temporary array
		      else if (sortedArray[j] != targetSum) {
		        temporaryArraySum = temporarySum + sortedArray[j];
		        temporaryArrayDiff = temporaryArraySum - targetSum;
		        
		        // distinguishes the element within the sorted array that add up to make the desired target sum
		        if(temporaryArray.contains(temporaryArrayDiff)) {
		          temporaryArray.remove(Integer.valueOf(temporaryArrayDiff));
		          temporaryArray.add(sortedArray[j]);
		          temporarySum += sortedArray[j];
		          temporaryCombos.add(temporaryArray);
		        }
		      }
		    }
	    temporaryArray = new ArrayList<>(); // empties the temporary array
	    }

	    // clones the original input array
	    for (int element = 0; element < inputArray.length; element++) {
	        clonedArray.add(inputArray[element]);
	    }

	    // the numbers within temporary arraylist are replaced with their indices from the input array
	    for (int m = 0; m < temporaryCombos.size(); m++) {
	      ArrayList<Integer> row = new ArrayList<>();
	      
	      for (int n = 0; n < temporaryCombos.get(m).size(); n++) {
	        row.add(clonedArray.indexOf(temporaryCombos.get(m).get(n)));
	      }
	      finalCombos.add(row);
	    }
		return finalCombos;	// Returns the array of final combinations containing the indices that add up to the desired target sum
		}
	}


