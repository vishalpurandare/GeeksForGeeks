package org.vip.arrays;


/**
 * Maximum difference between two elements such that larger element appears after the smaller number
 * Given an array arr[] of integers, 
 * find out the difference between any two elements such that larger element appears after the smaller number in arr[].
 * Examples: If array is [2, 3, 10, 6, 4, 8, 1] then returned value should be 8 (Diff between 10 and 2).
 * If array is [ 7, 9, 5, 6, 3, 2 ] then returned value should be 2 (Diff between 7 and 9) 
 *
 */
public class MaxDiffBetTwoArrayElem {

	/**
	 * Keep track of the min element found till now and maxDiff variable.
	 * update minimum element and max diff as you progress through the array
	 * Time Complexity O(n)
	 * @param arr
	 * @return maxDiff
	 */
	public static int getMaxDiffBetArray(int[] arr) {
		int maxDiff = arr[1] - arr[0];
		int minElement = arr[0];
		
		for (int i  = 1; i < arr.length; i++) {
			if (arr[i] - minElement > maxDiff) {
				maxDiff = arr[i] - minElement;
			}
			
			if (minElement > arr[i]) {
				minElement = arr[i];
			}
			
		}
		
		return maxDiff;
	}
}
