package org.howard.edu.lsp.assignment2.test;
import java.util.Arrays;
import org.howard.edu.lsp.assignment2.combination.Combination;

/**
 * This file tests possible array inputs of the Combination class
 * @author niaanderson
 *
 */

public class Test {
	/**
	 * Tests array inputs of the Combination class and prints the output
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Combination combination = new Combination();
		
		
		//This tests the combination class if the input contains double digits
		int[] arr0 = {20, 50, 35, 15, 30, 19};
		int target_sum0 = 50;
		System.out.println("Input Array: " + Arrays.toString(arr0));
		System.out.println("Target Sum Number: " + target_sum0);
		System.out.println("Final Output: " + combination.computeCombinations(arr0, target_sum0) + "\n");		
		
		//Tests the combination class if input array is a single number
		int[] arr1 = {28};
		int target_sum1 = 28;
		System.out.println("Input Array: " + Arrays.toString(arr1));
		System.out.println("Target Sum Number: " + target_sum1);
		System.out.println("Final Output: " + combination.computeCombinations(arr1, target_sum1) + "\n");
		
		//Test 1 is a standard test for various combinations
		int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int target_sum2 = 10;
		System.out.println("Input Array: " + Arrays.toString(arr2));
		System.out.println("Target Sum Number: " + target_sum2);
		System.out.println("Final Output: " + combination.computeCombinations(arr2, target_sum2) + "\n");
		
		//sorted array
		int[] arr3 = {1, 8, 9, 12, 13, 15, 16, 17};
		int target_sum3 = 17;
		System.out.println("Input Array: " + Arrays.toString(arr3));
		System.out.println("Target Sum Number: " + target_sum3);
		System.out.println("Final Output: " + combination.computeCombinations(arr3, target_sum3) + "\n");
	
		//unsorted array
		int[] arr4 = {8, 4, 1, 9, 7};
		int target_sum4 = 9;
		System.out.println("Input Array: " + Arrays.toString(arr4));
		System.out.println("Target Sum Number: " + target_sum4);
		System.out.println("Final Output: " + combination.computeCombinations(arr4, target_sum4) + "\n");
		
		//empty list
		int[] arr5 = {};
		int target_sum5 = 39;
		System.out.println("Input Array: " + Arrays.toString(arr5));
		System.out.println("Target Sum Number: " + target_sum5);
		System.out.println("Final Output: " + combination.computeCombinations(arr5, target_sum5) + "\n");
		
		//duplicate numbers in array
		int[] arr6 = {10, 20, 10};
		int target_sum6 = 20;
		System.out.println("Input Array: " + Arrays.toString(arr6));
		System.out.println("Target Sum Number: " + target_sum6);
		System.out.println("Final Output: " + combination.computeCombinations(arr6, target_sum6) + "\n");
		
		//Tests negative numbers put in as 
		int[] arr7 = {-8, -5, -20, -15, -13};
		int target_sum7 = -20;
		System.out.println("Input Array: " + Arrays.toString(arr7));
		System.out.println("Target Sum Number: " + target_sum7);
		System.out.println("Final Output: " + combination.computeCombinations(arr7, target_sum7) + "\n");
		
		//Tests triple digit numbers
		int[] arr8 = {123, 179, 345, 56, 122};
		int target_sum8 = 179;
		System.out.println("Input Array: " + Arrays.toString(arr8));
		System.out.println("Target Sum Number: " + target_sum8);
		System.out.println("Final Output: " + combination.computeCombinations(arr8, target_sum8) + "\n");
		
		//Test if the target sum is not in the input array
		int[] arr9 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int target_sum9 = 10;
		System.out.println("Input Array: " + Arrays.toString(arr9));
		System.out.println("Target Sum Number: " + target_sum9);
		System.out.println("Final Output: " + combination.computeCombinations(arr9, target_sum9) + "\n");
		
		
	}

}
