package org.vip.arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class SegregateEvenAndOddTest {

	@Test
	public void testSegregateEvenAndOdd() {
		int[] arr = {12, 34, 45, 9, 8, 90, 3};
		int[] arrResult = SegregateEvenAndOdd.segregateEvenAndOddInArray(arr);
		
		//check if no even element occur after the odd element in the result array
		boolean oddStarted = false;
		boolean failedTest = false;
		for (int i = 0; i < arrResult.length; i++) {
			if (arrResult[i] % 2 == 0) {
				if (oddStarted) {
					failedTest = true;
					break;
				}
			} else {
				oddStarted = true;
			}
		}
		assertFalse(failedTest);
	}

}
