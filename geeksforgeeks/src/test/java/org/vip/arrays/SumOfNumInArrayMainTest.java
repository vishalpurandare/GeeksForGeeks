package org.vip.arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SumOfNumInArrayMainTest {

	@Test
	public void testSumOfNumInArraySort() {
		SumOfNumInArrayMain obj = new SumOfNumInArrayMain();
		int[] arr = {1, 4, 45, 6, 10, -8};
		int num = 11;
		assertTrue(obj.sumOfNumInArrayWithSort(arr, num));
	}
	
	@Test
	public void testSumOfNumInArrayNaive() {
		SumOfNumInArrayMain obj = new SumOfNumInArrayMain();
		int[] arr = {1, 4, 45, 6, 10, -8};
		int num = 5;
		assertTrue(obj.sumOfNumInArrayWithNaive(arr, num));
		num = 99;
		assertFalse(obj.sumOfNumInArrayWithNaive(arr, num));
	}
	
	@Test
	public void testSumOfNumInArrayHash() {
		SumOfNumInArrayMain obj = new SumOfNumInArrayMain();
		int[] arr = {1, 4, 45, 6, 10, -8};
		int num = 5;
		assertTrue(obj.sumOfNumInArrayWithHash(arr, num));
		num = 99;
		assertFalse(obj.sumOfNumInArrayWithHash(arr, num));
	}

}
