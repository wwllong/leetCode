package com.wenwl.algorithm.leetcode.easy;

/**
 * @author wenwl
 * @see <a href="https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/>Q26-删除有序数组中的重复项</a>
 */
public class RemoveDuplicatesFromSortedArray {

	/**
	 * m1(0ms): 遍历数组，当遇到不重复当元素进行互换即可，计数器统计互换次数就是新长度。
	 */
	public static int removeDuplicates1(int[] nums) {
		int newLen = 0;
		for(int x = 1, len = nums.length; x < len; ++x) {
			if(nums[newLen] != nums[x]) {
				++newLen;
				nums[newLen] = nums[x];
			}
		}
        return newLen + 1;
    }

}
