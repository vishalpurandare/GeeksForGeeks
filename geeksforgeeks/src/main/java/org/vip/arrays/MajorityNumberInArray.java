package org.vip.arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityNumberInArray {
	
	/**
	 * A majority element in an array A[] of size n is an element that 
	 * appears more than n/2 times (and hence there is at most one such element).
	 * @param arr
	 */
	public static Integer findMajorityElemInArray (int[] arr) {
		Map<Integer, Integer> auxMap = new HashMap<Integer, Integer>();
		int len = arr.length;
		int majorityThreshold = len / 2;
		
		for (int idx = 0; idx < len; idx++) {
			if (auxMap.containsKey(arr[idx])) {
				int cnt = auxMap.get(arr[idx]);
				cnt++;
				auxMap.put(arr[idx], cnt);
			} else {
				auxMap.put(arr[idx], 1);
			}
		}
		
		for (Map.Entry<Integer, Integer> entry : auxMap.entrySet()) {
		    System.out.println(entry.getKey() + "/" + entry.getValue());
		    
		    if (entry.getValue() > majorityThreshold) {
		    	return entry.getKey();
		    }
		}
		
		return null;
	}
	
}
