package org.vip.arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckMajorityElementTest {

	@Test
	public void testIfMajorityElementInSortedArray() {
		int[] arr = {1, 2, 3, 3, 3, 3, 10};
		int x = 3;
		assertTrue(CheckMajorityElement.checkMajorityElementInArray(arr, x));
	}

}
