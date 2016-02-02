package org.vip.arrays;
/**
 * Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
 */
public class RotateArray {

	/**
	 * this is o(n) solution, but with extra space or o(d)
	 * @param arr
	 * @param d
	 */
	public static int[] rotateArrayExtraSpace(int[] arr, int d) {
		int[] arrD = new int[d];
		int len = arr.length;
		
		//Store d elements in temporary array
		for (int i = 0; i < d; i++) {
			arrD[i] = arr[i];
		}
		
		//Shift rest of the elements in array to left
		int currIdx = 0;
		for (int i = d; i < len; i++) {
			arr[currIdx] = arr[i];
			currIdx++;
		}
		
		//put temporary array elements in original array
		currIdx = len - d;
		for (int i = 0; i < arrD.length; i++) {
			arr[currIdx] = arrD[i];
			currIdx++;
		}
		
		return arr;
	}
	
	/**
	 * this is o(n*d) solution without any extra space requirement
	 * @param arr
	 * @param d
	 * @return
	 */
	public static int[] rotateArrayWithoutExtraSpace(int[] arr, int d) {
		int len = arr.length;
		int cnt = 0;
		while (cnt < d){
			int temp = arr[0];
			for (int j = 1; j < len; j++) {
				arr[j-1] = arr[j];
			}
			arr[len-1] = temp;
			cnt++;
		}
		
		return arr;
	}
	
}
