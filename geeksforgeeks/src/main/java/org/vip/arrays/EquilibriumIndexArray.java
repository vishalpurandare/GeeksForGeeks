package org.vip.arrays;

/**
 * Equilibrium index of an array is an index such that the sum of elements at lower indexes
 * is equal to the sum of elements at higher indexes. For example, in an arrya A:
 * A[0] = -7, A[1] = 1, A[2] = 5, A[3] = 2, A[4] = -4, A[5] = 3, A[6]=0
 * 3 is an equilibrium index, because:
 * A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
 * @author vishalpurandare
 */
public class EquilibriumIndexArray {
	/**
	 * Simple solution to this problem would include running2 loops, for each index, checking the sum on left and right of it, but it is n*n solution
	 * Better solution is start off with the total sum of elements and then move on with each index checking if the left and right sum match
	 * @param arr
	 * @return
	 */
	public static int getEquilibriumIndexOfArray(int[] arr) {
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		int leftSum = 0;
		int rightSum = sum;
		
		for (int i = 0; i < arr.length; i++) {
			rightSum -= arr[i];
			
			if (leftSum == rightSum) {
				return i;
			}
			
			leftSum += arr[i];
		}
		
		return -1;
	}
}
