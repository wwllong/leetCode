package com.wenwl.algorithm.test.easy;

import com.wenwl.algorithm.leetcode.easy.RemoveDuplicatesFromSortedArray;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArrayTest {

	private int[] testCase1 = new int[]{1, 1, 2};
	private int[] expected1 = new int[]{1, 2};

	private int[] testCase2 = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
	private int[] expected2 = new int[]{0, 1, 2, 3, 4};

	@Test
	public void test1() {
		Assert.assertEquals(expected1.length, RemoveDuplicatesFromSortedArray.removeDuplicates1(testCase1));
		Assert.assertArrayEquals(expected1, Arrays.copyOf(testCase1, expected1.length));
		Assert.assertEquals(expected2.length, RemoveDuplicatesFromSortedArray.removeDuplicates1(testCase2));
		Assert.assertArrayEquals(expected2, Arrays.copyOf(testCase2, expected2.length));
	}


}
