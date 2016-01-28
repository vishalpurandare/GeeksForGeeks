package org.vip.arrays;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SumOfNumInArrayMainTest {

	@Test
	public void testSumOfNumInArray() {
		SumOfNumInArrayMain obj = new SumOfNumInArrayMain();
		int[] arr = {1, 4, 45, 6, 10, -8};
		int num = 5;
		assertTrue(obj.sumOfNumInArrayWithSort(arr, num));
	}

}
