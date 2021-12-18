package com.wenwl.algorithm.test.easy;


import com.wenwl.algorithm.leetcode.easy.Intersect;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestIntersect {
	
	int[] nums1 = {1, 2, 2, 1};
	int[] nums2 = {2, 2};
	int[] intersection1 = {2, 2};

	int[] nums3 = {4, 9, 5};
	int[] nums4 = {9, 4, 9, 8, 4};
	int[] intersection2 = {4, 9};

	Intersect intersect = new Intersect();

	@Test
	public void test3() {
		int[] ints1 = intersect.intersect3(nums1, nums2);
		Arrays.sort(ints1);
		Assert.assertArrayEquals(intersection1, ints1);
		int[] ints2 = intersect.intersect3(nums3, nums4);
		Arrays.sort(ints2);
		Assert.assertArrayEquals(intersection2, ints2);
	}

	@Test
	public void test2() {
		int[] ints1 = intersect.intersect2(nums1, nums2);
		Arrays.sort(ints1);
		Assert.assertArrayEquals(intersection1, ints1);
		int[] ints2 = intersect.intersect2(nums3, nums4);
		Arrays.sort(ints2);
		Assert.assertArrayEquals(intersection2, ints2);
	}

	@Test
	public void test1() {
		int[] ints1 = intersect.intersect1(nums1, nums2);
		Arrays.sort(ints1);
		Assert.assertArrayEquals(intersection1, ints1);
		int[] ints2 = intersect.intersect1(nums3, nums4);
		Arrays.sort(ints2);
		Assert.assertArrayEquals(intersection2, ints2);
	}


}
