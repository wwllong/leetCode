package com.wenwl.algorithm.leetcode.easy;

/**
 * @author wenwl
 * @see <a href="https://leetcode-cn.com/problems/maximum-subarray/">Q53-最大子数组和</a>
 */
public class MaximumSubarray {

    /**
     * m3(2ms, 209tc): 动态规划，若前一个元素大于0，则将其加到当前元素
     * Tn = O(n)，Sn = O(1)
     */
    public int maxSubArray3(int[] nums) {
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i - 1] > 0){
                nums[i] += nums[i - 1];
            }
        }
        int result = nums[0];
        for (int num : nums) {
            result = Math.max(num, result);
        }
        return result;
    }

    /**
     * m2(1ms, 209tc): 贪心算法,m1代码简化
     * Tn = O(n)，Sn = O(1)
     */
    public int maxSubArray2(int[] nums) {
        int res = nums[0], sum = 0;
        for (int num : nums) {
            sum = Math.max(num, sum + num);
            res = Math.max(res, sum);
        }
        return res;
    }

    /**
     * m1(1ms, 209tc): 贪心算法，若当前指针指向元素之前的和小于0，则丢弃当前元素之前的数列
     * Tn = O(n)，Sn = O(1)
     */
    public int maxSubArray1(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0){
                sum += num;
            }else{
                sum = num;
            }
            res = Math.max(res, sum);
        }
        return res;
    }

}
