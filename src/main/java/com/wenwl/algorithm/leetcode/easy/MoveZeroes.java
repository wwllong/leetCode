package com.wenwl.algorithm.leetcode.easy;

/**
 * @author wenwl
 * @see <a href="https://leetcode-cn.com/problems/move-zeroes/">Q283-移动零</a>
 * testCaseNums: 74
 */
public class MoveZeroes {

	/**
	 * m3(1ms): 在m2的基础上改进，删除swap的操作（直接替换再init为0）
	 */
	public static void moveZeroes3(int[] nums){
		if (nums == null || nums.length <= 1){
			return;
		}
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0){
				nums[index] = nums[i];
				index++;
			}
		}
		for (int i = index; i < nums.length; i++) {
			nums[i] = 0;
		}
	}

	/**
	 * m2(2ms): 反方向思考，移动非0数字，采用双索引。
	 * m1耗时主要在swap和遍历，双指针减少这些操作。
	 * 一个索引指向数组开始（非0数字姚交换的位置），另一个指向非0的数字。
	 */
	public static void moveZeroes2(int[] nums) {
		for (int i = 0, index = 0; i < nums.length; i++) {
			if (nums[i] != 0){
				swap(nums, index, i);
				index++;
			}
		}
	}

	/**
	 * m1(111ms): swap方法是必须的，使用冒泡排序算法思想进行实现
	 *     0 1 0 3 12
	 * r1：1 0 3 12 0
	 * r2：1 3 12 0 0
	 */
	public static void moveZeroes1(int[] nums) {
		int zeroNum = 0;
		for (int i = 0; i < nums.length - 1 - zeroNum; i++) {
			if (nums[i] != 0){
				continue;
			}
			for (int j = i; j < nums.length - 1 - zeroNum; j++) {
				swap(nums, j, j + 1);
			}
			zeroNum++;
			// 一轮冒泡后，前进的0后退
			if (nums[i] == 0){
				i--;
			}
		}
	}
	
	private static void swap(int[] nums,int a,int b) {
		int temp = nums[a];
		nums[a] = nums[b]; 
		nums[b] = temp;
	}

}
