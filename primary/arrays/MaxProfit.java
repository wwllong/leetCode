package primary.arrays;

/**
 * @author Wwl 买卖股票的最佳时机 II
 * 
 *         给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 *         设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 *         注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）
 * 
 *         eg: 输入: [7,1,5,3,6,4] 输出: 7 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 =
 *         5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。 随后，在第 4 天（股票价格 = 3）的时候买入，在第 5 天（股票价格
 *         = 6）的时候卖出, 这笔交易所能获得利润 = 6-3 = 3 。
 * 
 *         输入: [1,2,3,4,5] 输出: 4 解释: 在第 1 天（股票价格 = 1）的时候买入，在第 5 天 （股票价格 =
 *         5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。 注意你不能在第 1 天和第 2 天接连购买股票，之后再将它们卖出。
 *         因为这样属于同时参与了多笔交易，你必须在再次购买前出售掉之前的股票。
 * 
 *         输入: [7,6,4,3,1] 输出: 0 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 */
public class MaxProfit {

	/*
	 * 根据前小后大，决定买卖。 默认设置 买卖的值都为第一个价格 从index=1遍历价格，
	 * 如果当前的值小，说明：之前的买入价格过高，我们应该以当前的值作为买入。 所以要同时更新我们的买入价格和卖出价格 都为当前价格。
	 * 注意的是，因为这里买卖的价格都需要改变，再改变之前 要计算我们之前交易的价格。 如果当前的值大的时候，更新我们的卖价格 ，因为应该高价卖出 最后
	 * 再进行一次买价与卖价的比较，防止出现单纯地更改卖价格
	 */
	public static int maxProfit1(int[] prices) {
		if (prices.length < 2)
			return 0;
		int pre = prices[0], buyPrice = prices[0], sellPrice = prices[0];
		int profit = 0;

		for (int i = 1; i < prices.length; i++) {
			if (pre > prices[i]) { // 当前值小，更新买卖的价格
				profit += sellPrice - buyPrice;
				buyPrice = prices[i];
				sellPrice = prices[i];
			} else if (pre < prices[i]) {// 当前值大，更新卖价
				sellPrice = prices[i];
			}
			pre = prices[i];
		}
		if (sellPrice > buyPrice)
			profit += sellPrice - buyPrice;
		return profit;

	}

	/* 在1方法上 改进：使用贪心算法，不从总体上考虑，只关心当前最优解法
	 * 将index=0默认当作买入，在比较index+1当作卖出，计算利润
	 * 当利润>0的时候，我们将叠加总利润，否则不叠加
	 * */
	public static int maxProfit2(int[] prices) {
		int profit = 0, tmp = 0;
		for (int i = 1; i < prices.length; ++i) {
			tmp = prices[i] - prices[i - 1];
			if (tmp > 0)
				profit += tmp;
		}
		return profit;
	}
}
