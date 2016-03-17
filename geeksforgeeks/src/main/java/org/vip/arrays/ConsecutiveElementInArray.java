package org.vip.arrays;

/**
 * Given an unsorted array of numbers,
 * write a function that returns true if array consists of consecutive numbers.
 * @author vishalpurandare
 */
public class ConsecutiveElementInArray {

	/**
	 * Here the idea is: if there are n elements in the array, if we find max and min in array
	 * (max - min + 1) = n, this condition will give us there are elements between min and max
	 * we need one more thing, to have all the elements as disctict
	 * we can do this by having extra space, extra array will contain the array element as key and
	 * count the number of time it was found as a value, then we can determine if array elements are disctinct
	 * There is extra space requirement though in this case.
	 * After first step though, the problem becomes just determining if every element is distinct in array
	 * 
	 * we can do this by using following method.
	 * we know, it has elements from within the defined range and max and min determined
	 * while iterating over the array... we can do something like this, arr[i]-min will always give us different index.
	 * So make arr[arr[i]-min] as negative, and we can check if this element is already negative then it is repeated. 
	 * @param arr
	 * @return true, false
	 */
	public static boolean ifConsecutiveArray(int[] arr) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		int n = arr.length;
		//Find max and min from the array
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) { 
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		int i;
		for (i = 0; i < n; i++) {
			if ((max - min + 1) == n) {
				int idx = 0;
				
				if (arr[i] < 0) {
					idx = -arr[i] - min;
				} else {
					idx = arr[i] - min;
				}
				
				if (arr[idx] > 0) {
					arr[idx] = -arr[idx];
				} else {
					return false;
				}
				
			} else {
				return false;
			}
		}
		
		return true;
		
	}

}
