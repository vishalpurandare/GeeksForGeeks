package org.vip.arrays;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class LeaderInArrayTest {

	@Test
	public void testLeaderInArray() {
		int arr[] = {16, 17, 4, 3, 5, 2};
		List<Integer> returnedList = LeaderInArray.getLeaderInArray(arr);
		assertEquals(new Integer(17), returnedList.get(0));
		assertEquals(new Integer(5), returnedList.get(1));
		assertEquals(new Integer(2), returnedList.get(2));
	}
}
