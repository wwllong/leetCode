package com.wenwl.algorithm.test.easy;

import com.wenwl.algorithm.leetcode.easy.PlusOne;
import org.junit.Assert;
import org.junit.Test;

public class PlusOneTest {
	
	int[] testCase1 = {1,2,3};
	int[] expected1 = {1,2,4};

	int[] testCase2 = {4,3,2,1};
	int[] expected2 = {4,3,2,2};

	int[] testCase3 = {0};
	int[] expected3 = {1};

	int[] testCase4 = {9,9};
	int[] expected4 = {1,0,0};

	int[] testCase5 = {1,1,9};
	int[] expected5 = {1,2,0};

	@Test
	public void test2(){
		Assert.assertArrayEquals(expected1, PlusOne.plusOne2(testCase1));
		Assert.assertArrayEquals(expected2, PlusOne.plusOne2(testCase2));
		Assert.assertArrayEquals(expected3, PlusOne.plusOne2(testCase3));
		Assert.assertArrayEquals(expected4, PlusOne.plusOne2(testCase4));
		Assert.assertArrayEquals(expected5, PlusOne.plusOne2(testCase5));
	}

	@Test
	public void test1(){
		Assert.assertArrayEquals(expected1, PlusOne.plusOne1(testCase1));
		Assert.assertArrayEquals(expected2, PlusOne.plusOne1(testCase2));
		Assert.assertArrayEquals(expected3, PlusOne.plusOne1(testCase3));
		Assert.assertArrayEquals(expected4, PlusOne.plusOne1(testCase4));
		Assert.assertArrayEquals(expected5, PlusOne.plusOne1(testCase5));
	}
	
}
