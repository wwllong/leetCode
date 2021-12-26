package com.wenwl.algorithm.test.medium;

import com.wenwl.algorithm.leetcode.medium.MaxProfit;
import org.junit.Test;

import junit.framework.TestCase;

public class MaxProfitTest {

	private MaxProfit maxProfit = new MaxProfit();

	private int[] prices1 = {7, 1, 5, 3, 6, 4};
	private int expected1 = 7;

	private int[] prices2 = {1, 2, 3, 4, 5};
	private int expected2 = 4;

	private int[] prices3 = {7, 6, 4, 3, 1};
	private int expected3 = 0;

	private int[] prices4 = {3, 2, 3, 1, 2};
	private int expected4 = 2;

	@Test
	public void testMaxProfit3() {
		TestCase.assertEquals(expected1, maxProfit.maxProfit3(prices1));
		TestCase.assertEquals(expected2, maxProfit.maxProfit3(prices2));
		TestCase.assertEquals(expected3, maxProfit.maxProfit3(prices3));
		TestCase.assertEquals(expected4, maxProfit.maxProfit3(prices4));
	}

	@Test
	public void testMaxProfit2() {
		TestCase.assertEquals(expected1, maxProfit.maxProfit2(prices1));
		TestCase.assertEquals(expected2, maxProfit.maxProfit2(prices2));
		TestCase.assertEquals(expected3, maxProfit.maxProfit2(prices3));
		TestCase.assertEquals(expected4, maxProfit.maxProfit2(prices4));
	}

	@Test
	public void testMaxProfit1() {
		TestCase.assertEquals(expected1, maxProfit.maxProfit1(prices1));
		TestCase.assertEquals(expected2, maxProfit.maxProfit1(prices2));
		TestCase.assertEquals(expected3, maxProfit.maxProfit1(prices3));
		TestCase.assertEquals(expected4, maxProfit.maxProfit1(prices4));
	}

}
