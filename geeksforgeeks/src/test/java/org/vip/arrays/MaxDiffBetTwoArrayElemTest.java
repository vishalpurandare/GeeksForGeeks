package org.vip.arrays;

import static org.junit.Assert.*;
import org.junit.Test;

public class MaxDiffBetTwoArrayElemTest {
	@Test
	public void testMaxDiffBetweenArrayElem() {
		int[] arr = {2, 3, 10, 6, 4, 8, 1};
		assertTrue(MaxDiffBetTwoArrayElem.getMaxDiffBetArray(arr) == 8);
		
		int[] arr2 = {7, 9, 5, 6, 3, 2};
		assertTrue(MaxDiffBetTwoArrayElem.getMaxDiffBetArray(arr2) == 2);
	}
}
