package com.wenwl.algorithm.test.easy;

import com.wenwl.algorithm.leetcode.easy.MaximumSubarray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumSubarrayTest {

    private MaximumSubarray maximumSubarray = new MaximumSubarray();

    private int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    private int expected1 = 6;

    private int[] nums2 = {1};
    private int expected2 = 1;

    private int[] nums3 = {5, 4, -1, 7, 8};
    private int expected3 = 23;

    @Test
    public void test3(){
        assertEquals(expected1, maximumSubarray.maxSubArray3(nums1));
        assertEquals(expected2, maximumSubarray.maxSubArray3(nums2));
        assertEquals(expected3, maximumSubarray.maxSubArray3(nums3));
    }

    @Test
    public void test2(){
        assertEquals(expected1, maximumSubarray.maxSubArray2(nums1));
        assertEquals(expected2, maximumSubarray.maxSubArray2(nums2));
        assertEquals(expected3, maximumSubarray.maxSubArray2(nums3));
    }

    @Test
    public void test1(){
        assertEquals(expected1, maximumSubarray.maxSubArray1(nums1));
        assertEquals(expected2, maximumSubarray.maxSubArray1(nums2));
        assertEquals(expected3, maximumSubarray.maxSubArray1(nums3));
    }

}
