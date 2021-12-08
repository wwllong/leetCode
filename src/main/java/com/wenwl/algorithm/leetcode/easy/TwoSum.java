package com.wenwl.algorithm.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wenwl
 * @see <a href="https://leetcode-cn.com/problems/two-sum/">Q1-两数之和</a>
 */
public class TwoSum {

	/**
	 * m4(2ms): 在m3的基础上改进，可以先创建一个返回的数组
	 */
	public int[] twoSum4(int[] nums, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		for (int x = 0, len = nums.length; x < len; ++x) {
			if (map.containsKey(target-nums[x])){
				result[0] = x;
				result[1] = map.get(target-nums[x]);
				return result;
			}
			map.put(nums[x], x);
		}
		return result;
	}
	
	/**
	 * m3(2ms): 利用HashMap进行判断和存储
	 * */
	public int[] twoSum3(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int x = 0, len = nums.length; x < len; ++x) {
			if (!map.containsKey(target-nums[x])) {
				map.put(nums[x], x);
			}else {
				return new int[]{map.get(target-nums[x]), x};
			}
		}
		return null;
	}
	
	/**
	 * m2(30ms): 优化遍历以及判断的次数
	 * */
	public int[] twoSum2(int[] nums, int target) {
		for (int x = 0, len = nums.length; x < len; ++x) {
			int temp = target - nums[x];
			for (int y= x+1; y < len; ++y) {
				if (temp == nums[y]) {
					return new int[] {x,y};
				}
			}
		}
		return null;
	}
	
	/**
	 * m1(110ms): 普通遍历每个元素
	 **/
	public int[] twoSum1(int[] nums, int target) {
		for (int x = 0, len = nums.length; x < len; ++x) {
			for (int y = 0; y < len; ++y) {
				if ( x==y ) {
					continue;
				}
				if (nums[x] + nums[y] == target) {
					return new int[] {x,y};
				}
			}
		}
		return null;
	}

}
