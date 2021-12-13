package com.wenwl.algorithm.test.easy;

import com.wenwl.algorithm.leetcode.easy.SingleNumber;
import org.junit.Test;

import junit.framework.TestCase;

public class SingleNumberTest {
	
	int[] testCase1 = {2, 1, 2};
	int expected1 = 1;

	int[] testCase2 = {4, 1, 2, 1, 2};
	int expected2 = 4;

	@Test
	public void testSingleNumber3() {
		TestCase.assertEquals(expected1, SingleNumber.singleNumber3(testCase1));
		TestCase.assertEquals(expected2, SingleNumber.singleNumber3(testCase2));
	}

	@Test
	public void testSingleNumber2() {
		TestCase.assertEquals(expected1, SingleNumber.singleNumber2(testCase1));
		TestCase.assertEquals(expected2, SingleNumber.singleNumber2(testCase2));
	}

	@Test
	public void testSingleNumber1() {
		TestCase.assertEquals(expected1, SingleNumber.singleNumber1(testCase1));
		TestCase.assertEquals(expected2, SingleNumber.singleNumber1(testCase2));
	}
	
//
//
//	@Test
//	public void testSingleNumber3() {
//		TestCase.assertEquals(1, SingleNumber.singleNumber3(testCase1));
//		TestCase.assertEquals(4, SingleNumber.singleNumber3(testCase2));
//	}
//
//	@Test
//	public void testSingleNumber4() {
//		TestCase.assertEquals(1, SingleNumber.singleNumber4(testCase1));
//		TestCase.assertEquals(4, SingleNumber.singleNumber4(testCase2));
//		TestCase.assertEquals(0, SingleNumber.singleNumber4(new int[] {1,0,1}));
//	}

}
