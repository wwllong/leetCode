package com.wenwl.algorithm.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wenwl
 * @see <a href="https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/">Q350-两个数组的交集 II</a>
 */
public class Intersect {

	/**
	 * m3(1ms): 基于m2方法进行优化，list改成固定Array，最后进行copy处理
	 */
	public int[] intersect3(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int len1 = nums1.length, len2 = nums2.length;
		int i = 0, j = 0, c = 0;
		int[] result = new int[Math.max(len1, len2)];
		while (i < len1 && j < len2) {
			if (nums1[i] == nums2[j]) {
				result[c++] = nums1[i];
				++i;
				++j;
			} else if (nums1[i] > nums2[j]) {
				++j;
			} else {
				++i;
			}
		}
		return c > 0 ? Arrays.copyOf(result, c) : new int[0];
	}

	/**
	 * m2(4ms,55tc): 对两个数组进行排序，同时进行有序比较。
	 * 元素相等加入list，两个索引同时+1，不想等时，数值较小的一方移动索引
	 */
	public int[] intersect2(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int len1 = nums1.length, len2 = nums2.length;
		int i = 0, j = 0;
		List<Integer> list = new ArrayList<>();
		while (i < len1 && j < len2) {
			if (nums1[i] == nums2[j]) {
				list.add(nums1[i]);
				++i;
				++j;
			} else if (nums1[i] > nums2[j]) {
				++j;
			} else if (nums1[i] < nums2[j]) {
				++i;
			}
		}
		return list.stream().mapToInt(Integer::valueOf).toArray();
	}

	/**
	 * m1(5ms,55tc): 用Map统计nums1的数字出现次数，遍历nums2数组与map进行比较，求出合集。
	 */
	public int[] intersect1(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int n1 : nums1) {
			Integer value = map.get(n1);
			map.put(n1, value == null ? 1 : ++value);
		}

		List<Integer> list = new ArrayList<>();
		for (int n2 : nums2) {
			Integer count = map.get(n2);
			if (count != null && count > 0) {
				list.add(n2);
				map.put(n2, count - 1);
			}
		}

		return list.stream().mapToInt(Integer::valueOf).toArray();
	}

}
