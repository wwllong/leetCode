package com.wenwl.algorithm.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/**
 * @author wenwl
 * @see <a href="https://leetcode-cn.com/problems/single-number/">Q136-只出现一次的数字</a>
 */
public class SingleNumber {

	/**
	 * m3(1ms): 换一种思路，利用异或的运算特性(不带进位的二进制加法)
	 * - 交换律：a ^ b ^ c <=> a ^ c ^ b
	 * - 0异或任何数为任何数 0 ^ n => n
	 * - 相同的数异或为0: n ^ n => 0
	 */
	public static int singleNumber3(int[] nums) {
		int n = nums[0];
		for (int i = 1; i < nums.length; ++i) {
			n = n ^ nums[i];
		}
		return n;
	}


	/**
	 * m2(6ms): 在1的基础上修改，利用重复元素成对的特性，减少判断和遍历
	 */
	public static int singleNumber2(int[] nums) {
		if (nums.length == 1){
			return nums[0];
		}
		Arrays.sort(nums);
		int i = 0, len = nums.length - 1;
		while(i < len){
			if (nums[i] == nums[i+1]){
				i += 2;
			}else {
				return nums[i];
			}
		}
		return nums[nums.length - 1];
	}

	/**
	 * m1(8ms): 对数组排序，遍历判断，通过置空和更新值，确定最后的值
	 */
	public static int singleNumber1(int[] nums) {
		if (nums.length == 1){
			return nums[0];
		}
		Arrays.sort(nums);
		Integer cur = null;
		for (int num : nums) {
			if (cur == null) {
				cur = num;
			} else if (cur.equals(num)) {
				cur = null;
			}
		}
		return cur;
	}

}
