package org.vip.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 *
 */
public class LeaderInArray {

	public static List<Integer> getLeaderInArray(int[] arr) {
		List<Integer> leadersList = new ArrayList<Integer>();
		
		int len = arr.length;
		int currLeader = arr[len-1];
		
		leadersList.add(currLeader);
		for (int i = len-2; i >= 0; i--) {
			if (arr[i] > currLeader) {
				currLeader = arr[i];
				leadersList.add(currLeader);
			}
		}
		Collections.reverse(leadersList);
		return leadersList;
	}
	
}
