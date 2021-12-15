package com.wenwl.algorithm.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author wenwl
 * @see <a href="https://leetcode-cn.com/problems/valid-palindrome/">Q217-存在重复元素</a>
 */
public class ContainsDuplicate {

	/**
	 * m4(18ms): 排序，相邻比较
	 */
	public static boolean containsDuplicate4(int[] nums) {
		if (nums.length < 2) {
			return false;
		}
		Arrays.sort(nums);
		for (int i = 0, len = nums.length - 1; i < len; ++i) {
			if(nums[i] == nums[i+1]){
				return true;
			}
		}
		return false;
	}

	/**
	 * m3(5ms): 利用Set集合的元素唯一
	 */
	public static boolean containsDuplicate3(int[] nums) {
		if (nums.length < 2) {
			return false;
		}
		Set<Integer>  set = new HashSet<>();
		for(int num : nums) {
			if(!set.add(num)){
				return true;
			}
		}
		return false;
	}

	/**
	 * m2(8ms): 利用Map进行比较
	 */
	public static boolean containsDuplicate2(int[] nums) {
		if (nums.length < 2) {
			return false;
		}
		Map<Integer, Boolean> map = new HashMap<>();
		for(int num : nums) {
			if(map.containsKey(num)) {
				return true;
			}else {
				map.put(num, true);
			}
		}
		return false;
	}

	/**
	 * m1(21提交超出时间限制，18年提交是400ms): 暴力循环
	 */
	public static boolean containsDuplicate1(int[] nums) {
		if (nums.length < 2) {
			return false;
		}
		for(int x = 0, len = nums.length; x < len; ++x) {
			for(int y = x + 1; y < len; ++y) {
				if(nums[x] == nums[y]) {
					return true;
				}
			}
		}
		return false;
    }

}
