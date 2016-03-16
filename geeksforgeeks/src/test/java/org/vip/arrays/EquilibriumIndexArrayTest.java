package org.vip.arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class EquilibriumIndexArrayTest {

	@Test
	public void testEquilibriumIndexOfArray() {
		int[] arr = {-7, 1, 5, 2, -4, 3, 0};
		int retVal = EquilibriumIndexArray.getEquilibriumIndexOfArray(arr);
		System.out.println(retVal);
		assertTrue(retVal == 3);
	}

}
