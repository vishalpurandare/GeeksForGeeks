package org.vip.arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class MajorityNumberInArrayTest {

	@Test
	public void testMajorityElemInArray() {
		int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
		Integer retVal = MajorityNumberInArray.findMajorityElemInArray(arr);
		assertTrue(retVal == 4);
		
		int[] arr1 = {3, 3, 4, 2, 4, 4, 2, 4};
		retVal = MajorityNumberInArray.findMajorityElemInArray(arr1);
		assertTrue(retVal == null);
	}

}
