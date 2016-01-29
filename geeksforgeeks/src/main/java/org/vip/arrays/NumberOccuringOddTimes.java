package org.vip.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of positive integers.
 * All numbers occur even number of times except one number which occurs odd number of times. 
 * Find the number in O(n) time & constant space.
 * @author vishalpurandare
 */
public class NumberOccuringOddTimes {

	/**
	 * Here the trick to solve it in o(n) is to XOR the elements of the array starting with 0
	 * a XOR a is 0
	 * @param arr
	 * @return
	 */
	public static int getNumberOccuranceOddTimesWithXOR(int[] arr) {	
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result = result ^ arr[i];
		}
		return result;
	}
	
	/**
	 * Simple solution with Hash Map with o(n) extra space, with time complexity would be o(n)
	 * @param arr
	 * @return
	 */
	public static int getNumberOccuringOddTimesHash(int[] arr) {
		Map<Integer, Integer> auxMap = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			if (auxMap.containsKey(arr[i])) {
				int cnt = auxMap.get(arr[i]);
				cnt++;
				auxMap.put(arr[i], cnt);
			} else {
				auxMap.put(arr[i], 1);
			}
		}
		
		for (Map.Entry<Integer, Integer> entry : auxMap.entrySet()) {
		    System.out.println(entry.getKey() + "/" + entry.getValue());
		    
		    if (entry.getValue() % 2 != 0 ) {
		    	return entry.getKey();
		    }
		}
		
		return 0;
	}
	
}
