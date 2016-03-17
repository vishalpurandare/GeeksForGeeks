package org.vip.arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConsecutiveElementInArrayTest {

	@Test
	public void testConsecutiveElementsInArray() {
		int[] arr = {5, 2, 3, 1, 4};
		assertTrue(ConsecutiveElementInArray.ifConsecutiveArray(arr));
		
		int[] arr1 = {5, 2, 3, 1, 9};
		assertFalse(ConsecutiveElementInArray.ifConsecutiveArray(arr1));
	}

}
