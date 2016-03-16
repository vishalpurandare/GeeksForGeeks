package org.vip.arrays;

/**
 * Segregate Even and Odd numbers
 * Given an array A[], write a function that segregates even and odd numbers.
 * The functions should put all even numbers first, and then odd numbers.
 *
 */
public class SegregateEvenAndOdd {

	public static int[] segregateEvenAndOddInArray(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		
		while (left < right) {
			
			while (arr[left] % 2 == 0) {
				left++;
			}
			
			while (arr[right] % 2 == 1) {
				right--;
			}
			
			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
		
		return arr;
	}
}
