package org.vip.arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class RotateArrayTest {

	@Test
	public void testRotateArrayWithExtraSpace() {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		int d = 3;
		int[] ret = RotateArray.rotateArrayExtraSpace(arr, d);
		int[] expected = {4, 5, 6, 7, 1, 2, 3};
		assertArrayEquals(expected, ret);
	}
	
	@Test
	public void testRotateArrayWithoutExtraSpace() {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		int d = 3;
		int[] ret = RotateArray.rotateArrayWithoutExtraSpace(arr, d);
		int[] expected = {4, 5, 6, 7, 1, 2, 3};
		assertArrayEquals(expected, ret);
	}

}
