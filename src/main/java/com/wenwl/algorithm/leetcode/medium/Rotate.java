package com.wenwl.algorithm.leetcode.medium;

/**
 * @author wenwl
 * @see <a href="https://leetcode-cn.com/problems/rotate-array/">Q189-轮转数组</a>
 */
public class Rotate {

	/**
	 * m3(0ms, 38tc): 数组翻转, 详见官方讲解
	 * 将数组的元素向右移动 k 次后，尾部 k%n 个元素会移动至数组头部，其余元素向后移动 k%n 个位置。
	 * - 先将所有元素翻转，尾部的 k%n 个元素就被移至数组头部
	 * - 再翻转 [0, k%n-1]的元素 和 [k%n, n-1] 的元素
	 * Tn = O(n)，Sn = O(1)
	 */
	public void rotate3(int[] nums, int k) {
		int n = nums.length;
		k %= n;
		reverse(nums, 0, n - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, n - 1);
	}

	private void reverse(int[] arr,int start,int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start++] = arr[end];
			arr[end--] = temp;
		}
	}

	/**
	 * m2(1ms, 38tc): 环状替换，详见官方讲解
	 * 将被替换的元素保存在变量，反复带入公式 (i + k) % n 计算
	 * 遍历圈数恰好走了整数数量的圈。圈数为gcd(n,k)（最大公约数）
	 * 或者采用单独的变量count跟踪当前已经访问的元素数量count=n时，结束遍历过程.
	 * Tn = O(n)，Sn = O(1)
	 */
	public void rotate2(int[] nums, int k) {
		int n = nums.length;
		k = k % n;
		int count = gcd(k, n);
		for (int start = 0; start < count; ++start) {
			int current = start;
			int prev = nums[start];
			do {
				int next = (current + k) % n;
				int temp = nums[next];
				nums[next] = prev;
				prev = temp;
				current = next;
			} while (start != current);
		}
	}

	private int gcd(int x, int y) {
		return y > 0 ? gcd(y, x % y) : x;
	}

	/**
	 * m1(1ms, 38tc): 辅助数组, 关键是 (i + k) % n
	 * Tn = O(n)，Sn = O(n)
	 */
	public void rotate1(int[] nums, int k) {
		int n = nums.length;
		int[] newArr = new int[n];
		for (int i = 0; i < n; ++i) {
			newArr[(i + k) % n] = nums[i];
		}
		System.arraycopy(newArr, 0, nums, 0, n);
	}


}
