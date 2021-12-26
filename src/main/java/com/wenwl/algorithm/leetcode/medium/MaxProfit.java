package com.wenwl.algorithm.leetcode.medium;

/**
 * @author wenwl
 * @see <a href="https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/">Q122-买卖股票的最佳时机 II</a>
 */
public class MaxProfit {

	/**
	 * m3(2ms,200tc): 动态规划
	 * T(n) = O(n), S(n) = O(1)
	 * */
	public static int maxProfit3(int[] prices) {
		int n = prices.length;
		int dp0 = 0, dp1 = -prices[0];
		for (int i = 1; i < n; ++i) {
			int newDp0 = Math.max(dp0, dp1 + prices[i]);
			int newDp1 = Math.max(dp1, dp0 - prices[i]);
			dp0 = newDp0;
			dp1 = newDp1;
		}
		return dp0;
	}


	/**
	 * m2(1ms,200tc): 基于m1, 由于股票的购买没有限制,采用贪心算法
	 * T(n) = O(n), S(n) = O(1)
	 * */
	public static int maxProfit2(int[] prices) {
		int profit = 0;
		for (int i = 1; i < prices.length; ++i) {
			profit += Math.max(0, prices[i] - prices[i - 1]);
		}
		return profit;
	}

	/**
	 * m1(1ms,200tc): 根据前小后大，决定买卖。
	 * T(n) = O(n), S(n) = O(1)
	 */
	public static int maxProfit1(int[] prices) {
		int buyPrice = prices[0], sellPrice = prices[0];
		int profit = 0;
		for (int i = 1; i < prices.length; i++) {
			// 当前值小，更新买入的价格
			if (prices[i - 1] > prices[i]) {
				profit += sellPrice - buyPrice;
				buyPrice = prices[i];
			}
			sellPrice = prices[i];
		}
		if (sellPrice > buyPrice){
			profit += sellPrice - buyPrice;
		}
		return profit;
	}

}
