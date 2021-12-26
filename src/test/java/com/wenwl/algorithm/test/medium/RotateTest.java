package com.wenwl.algorithm.test.medium;

import static org.junit.Assert.*;

import com.wenwl.algorithm.leetcode.medium.Rotate;
import org.junit.*;

public class RotateTest {

	private Rotate rotate = new Rotate();

	private int[] nums1 = new int[] {1, 2, 3, 4, 5, 6, 7};
	private int[] nums1_3 = new int[] {5, 6, 7, 1, 2, 3, 4};

	private int[] nums2 = new int[] {-1, -100, 3, 99 };
	private int[] nums2_2 = new int[] {3, 99, -1, -100};

	@Test
	public void testRotate3() {
		rotate.rotate3(nums1, 3);
		assertArrayEquals(nums1_3, nums1);
		rotate.rotate3(nums2, 2);
		assertArrayEquals(nums2_2, nums2);
	}

	@Test
	public void testRotate2() {
		rotate.rotate2(nums1, 3);
		assertArrayEquals(nums1_3, nums1);
		rotate.rotate2(nums2, 2);
		assertArrayEquals(nums2_2, nums2);
	}

	@Test
	public void testRotate1() {
		rotate.rotate1(nums1, 3);
		assertArrayEquals(nums1_3, nums1);
		rotate.rotate1(nums2, 2);
		assertArrayEquals(nums2_2, nums2);
	}

}
