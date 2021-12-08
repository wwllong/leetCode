package com.wenwl.algorithm.test.easy;


import com.wenwl.algorithm.leetcode.easy.ReverseInteger;
import org.junit.Test;

import junit.framework.TestCase;

public class ReverseIntegerTest {

	ReverseInteger ri = new ReverseInteger() ;

	int testCase1 = 123;
	int expected1 = 321;
	
	int testCase2 = -123;
	int expected2 = -321;
	
	int testCase3 = -120;
	int expected3 = -21;

	int testCase4 = 0;
	int expected4 = 0;

	@Test
	public void testReverse2() {
		TestCase.assertEquals(expected1, ri.reverse2(testCase1));
		TestCase.assertEquals(expected2, ri.reverse2(testCase2));
		TestCase.assertEquals(expected3, ri.reverse2(testCase3));
		TestCase.assertEquals(expected4, ri.reverse2(testCase4));
	}

	@Test
	public void testReverse1() {
		TestCase.assertEquals(expected1, ri.reverse1(testCase1));
		TestCase.assertEquals(expected2, ri.reverse1(testCase2));
		TestCase.assertEquals(expected3, ri.reverse1(testCase3));
		TestCase.assertEquals(expected4, ri.reverse1(testCase4));
	}


	

}
