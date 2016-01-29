package org.vip.arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberOccuringOddTimesTest {

	@Test
	public void testNumberOccuranceOddTimesXOR() {
		int arr[] = {2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
		assertTrue(5 == NumberOccuringOddTimes.getNumberOccuranceOddTimesWithXOR(arr));
	}
	
	@Test
	public void testNumberOccuranceOddTimesHash() {
		int arr[] = {2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
		assertTrue(5 == NumberOccuringOddTimes.getNumberOccuranceOddTimesWithXOR(arr));
	}

}
