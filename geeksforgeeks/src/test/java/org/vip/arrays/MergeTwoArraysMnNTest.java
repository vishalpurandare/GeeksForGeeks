package org.vip.arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class MergeTwoArraysMnNTest {

	@Test
	public void test() {
		int[] arrMnN = {2, 8, -1, -1, -1, 13, -1, 15, 25};
		int[] arrN = {5, 7, 9, 20};
		int[] expectedOutput ={2, 5, 7, 8, 9, 13, 15, 20, 25};
		int[] arrRet = MergeTwoArraysMnN.mergeNSizedArrayInMnN(arrMnN, arrN);
		assertArrayEquals(arrRet, expectedOutput);
	}
}
