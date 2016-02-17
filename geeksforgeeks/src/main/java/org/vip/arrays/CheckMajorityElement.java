package org.vip.arrays;

/**
 * Basically, we need to write a function say isMajority() that takes an array (arr[] ),
 * array’s size (n) and a number to be searched (x) as parameters and returns true if x is 
 * a majority element (present more than n/2 times).
 *
 */
public class CheckMajorityElement {
	/**
	 * The linear method of finding first occurrence of the element in the array is very simple.
	 * (1) Find first position of element by linear Search in Array
	 * (2) if (idxFoundAbove + n/2 < sizeOfArray and arr[idxFoundAbove + n/2] is x then it's majority element
	 * (3) else return false
	 * This works as Array is sorted
	 * So, we just need to find the first occurrence of the element in the array, this o(n) solution
	 * Below code is o(log n) using binary search
	 * Idea is same, find first occurrence, but using binary search
	 * @param arr
	 * @param x
	 * @return boolean
	 */
	public static boolean checkMajorityElementInArray(int[] arr, int x) {
		int high = arr.length - 1;
		int firstOccurrence = binarySearch(arr, 0, high, x);
		
		//System.out.println(firstOccurrence);
		
		if (firstOccurrence == -1) {
			return false;
		}
		
		if (firstOccurrence + (arr.length)/2 <= (arr.length - 1) && arr[firstOccurrence + (arr.length)/2] == x) {
			return true;
		}
		
		return false;
	}
	
	private static int binarySearch(int[] arr, int low, int high, int x) {
		if (low <= high) {
			int mid = (low + high) / 2;
			
			if ((mid == 0 || arr[mid-1] < x) && (arr[mid] == x)) {
				return mid;
			} else if (arr[mid] < x) {
				return binarySearch(arr, (mid + 1), high, x);
			} else {
				return binarySearch(arr, low, (mid - 1), x);
			}
		}
		
		return -1;
	}
}
