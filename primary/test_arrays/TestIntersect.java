package primary.test_arrays;


import org.junit.Assert;
import org.junit.Test;

import primary.arrays.Intersect;

public class TestIntersect {
	
	int[] nums1 = {1, 2, 2, 1};
	int[] nums2 = {2, 2};
	int[] nums3 = {1, 1, 2 , 3};
	Intersect i = new Intersect();
	@Test
	public void test1() {
		Assert.assertArrayEquals(new int[] {2, 2}, i.intersect1(nums1, nums2));
		Assert.assertArrayEquals(new int[] {1, 1, 2}, i.intersect1(nums1, nums3));
	}
	
	public void test2() {
		Assert.assertArrayEquals(new int[] {2, 2}, i.intersect2(nums1, nums2));
		Assert.assertArrayEquals(new int[] {1, 1, 2}, i.intersect2(nums1, nums3));
	}
	
	public void test3() {
		Assert.assertArrayEquals(new int[] {2, 2}, i.intersect3(nums1, nums2));
		Assert.assertArrayEquals(new int[] {1, 1, 2}, i.intersect3(nums1, nums3));
	}

}
