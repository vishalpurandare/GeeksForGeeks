package org.vip.arrays;

import java.util.Arrays;

public class SumOfNumInArrayMain {

	boolean sumOfNumInArrayWithHash (int[] arr, int num) {
		return false;
	}
	
	boolean sumOfNumInArrayWithSort (int[] arr, int num) {
		boolean retVal = false;
		Arrays.sort(arr);
		int start = 0;
		int end = arr.length - 1;
		
		while (start < end) {
			int temp = arr[start] + arr[end];
			if (temp == num) {
				retVal = true;
				break;
			} else if (temp < num) {
				start++;
			} else {
				end--;
			}
		}
		return retVal;
	}
}
