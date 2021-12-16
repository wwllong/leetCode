package com.wenwl.algorithm.test.easy;

import com.wenwl.algorithm.leetcode.easy.MoveZeroes;
import org.junit.Assert;
import org.junit.Test;

public class MoveZeroesTest {

	int[] testCase1 = {0, 1, 0, 3, 12};
	int[] expected1 = {1, 3, 12, 0, 0};
	int[] testCase2 = {0, 1};
	int[] expected2 = {1, 0};
	int[] testCase3 = {0, 0, 0, 1, 0, 2};
	int[] expected3 = {1, 2, 0, 0, 0, 0};

	@Test
	public void test3() {
		MoveZeroes.moveZeroes3(testCase1);
		Assert.assertArrayEquals(expected1, testCase1);
		MoveZeroes.moveZeroes3(testCase2);
		Assert.assertArrayEquals(expected2, testCase2);
		MoveZeroes.moveZeroes3(testCase3);
		Assert.assertArrayEquals(expected3, testCase3);
	}

	@Test
	public void test2() {
		MoveZeroes.moveZeroes2(testCase1);
		Assert.assertArrayEquals(expected1, testCase1);
		MoveZeroes.moveZeroes2(testCase2);
		Assert.assertArrayEquals(expected2, testCase2);
		MoveZeroes.moveZeroes2(testCase3);
		Assert.assertArrayEquals(expected3, testCase3);
	}

	@Test
	public void test1() {
		MoveZeroes.moveZeroes1(testCase1);
		Assert.assertArrayEquals(expected1, testCase1);
		MoveZeroes.moveZeroes1(testCase2);
		Assert.assertArrayEquals(expected2, testCase2);
		MoveZeroes.moveZeroes1(testCase3);
		Assert.assertArrayEquals(expected3, testCase3);
	}


}
