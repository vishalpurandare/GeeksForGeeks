package org.vip.arrays;
/**
 * There are two sorted arrays. 
 * First one is of size m+n containing only m elements.
 * Another one is of size n and contains n elements.
 * Merge these two arrays into the first array of size m+n such that the output is sorted.
 * @author
 */
public class MergeTwoArraysMnN {
	
	public static int[] mergeNSizedArrayInMnN(int[] arrMnN, int[] arrN) {
		int mNn = arrMnN.length;
		int n = arrN.length;
		
		//Assuming the NA elements are having value -1
		
		//Move all elements to last in array of size m+n
		int currLastIdx = mNn - 1;
		
		for (int i = mNn - 1; i >= 0; i--) {
			if (arrMnN[i] != -1) {
				arrMnN[currLastIdx] = arrMnN[i];
				currLastIdx--;
			}
		}
		int idxMnN = n;
		int mainIdx = 0, idxN = 0;
		
		//Now merge two arrays, big one starting from its elements and small one from 0
		while (idxMnN < mNn && idxN < n) {
			if (arrMnN[idxMnN] <= arrN[idxN]) {
				arrMnN[mainIdx] = arrMnN[idxMnN];
				idxMnN++;
			} else {
				arrMnN[mainIdx] = arrN[idxN];
				idxN++;
			}
			mainIdx++;
		}
		
		while (idxN < n)
	    {
	       arrMnN[mainIdx] = arrN[idxN];
	       idxN++; 
	    }
		
		return arrMnN;
	}
	
}
