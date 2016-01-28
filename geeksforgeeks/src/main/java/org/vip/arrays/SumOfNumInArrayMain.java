package org.vip.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumOfNumInArrayMain {
	/**
	 * Given an array A[] and a number x, check for pair in A[] with sum as x
	 * nlog(n) solution with sorting
	 * @param arr
	 * @param num
	 * @return
	 */
	boolean sumOfNumInArrayWithSort (int[] arr, int num) {
		Arrays.sort(arr);
		int start = 0;
		int end = arr.length - 1;
		
		while (start < end) {
			int temp = arr[start] + arr[end];
			if (temp == num) {
				return true;
			} else if (temp < num) {
				start++;
			} else {
				end--;
			}
		}
		return false;
	}
	
	/**
	 * Given an array A[] and a number x, check for pair in A[] with sum as x
	 * Naive n*n solution
	 * @param arr
	 * @param num
	 * @return
	 */
	boolean sumOfNumInArrayWithNaive (int[] arr, int num) {
		int len = arr.length;
		
		for (int idx = 0; idx < len; idx++) {
			if (arr[idx] > num) {
				continue;
			}
			for (int idx1 = idx + 1; idx1 < len; idx1++) {
				int tempNum = arr[idx] + arr[idx1];
				if (tempNum == num) {
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * Given an array A[] and a number x, check for pair in A[] with sum as x
	 * Hashmap solution, O(n) extra space, Arguably O(n) solution
	 * @param arr
	 * @param num
	 * @return
	 */
	boolean sumOfNumInArrayWithHash (int[] arr, int num) {
		Map<Integer, Integer> auxMap = new HashMap<Integer, Integer>();
		
		for (int idx = 0; idx < arr.length; idx++) {
			if (arr[idx] > num) {
				continue;
			}
			int temp = num - arr[idx];
			if (auxMap.containsKey(arr[idx])) {
				return true;
			} else {
				auxMap.put(temp, arr[idx]);
			}
		}
		
		return false;
	}
	
}
