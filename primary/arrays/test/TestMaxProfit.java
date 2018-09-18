package primary.arrays.test;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import junit.framework.TestCase;

import static primary.arrays.MaxProfit.*;

public class TestMaxProfit {

	int[] prices1 = { 7, 1, 5, 3, 6, 4 }; // 7
	int[] prices2 = { 1, 2, 3, 4, 5 }; // 4
	int[] prices3 = { 7, 6, 4, 3, 1 }; // 0
	int[] prices4 = { 3, 2, 3, 1, 2 }; // 2
	
	@Test
	public void testMaxProfit1() {
		HashMap<int[], Integer> maxProfitMap = new HashMap<int[], Integer>();
		maxProfitMap.put(prices1, maxProfit1(prices1));
		maxProfitMap.put(prices2, maxProfit1(prices2));
		maxProfitMap.put(prices3, maxProfit1(prices3));
		maxProfitMap.put(prices4, maxProfit1(prices4));
		
		System.out.println("MaxProfit1:");
		printByKeySet(maxProfitMap);
		
		TestCase.assertEquals(7, maxProfit1(prices1));
		TestCase.assertEquals(4, maxProfit1(prices2));
		TestCase.assertEquals(0, maxProfit1(prices3));
		TestCase.assertEquals(2, maxProfit1(prices4));
	}
	
	@Test
	public void testMaxProfit2() {
		HashMap<int[], Integer> maxProfitMap = new HashMap<int[], Integer>();
		maxProfitMap.put(prices1, maxProfit2(prices1));
		maxProfitMap.put(prices2, maxProfit2(prices2));
		maxProfitMap.put(prices3, maxProfit2(prices3));
		maxProfitMap.put(prices4, maxProfit2(prices4));
		
		System.out.println("MaxProfit2:");
		printByEntry(maxProfitMap);
		
		TestCase.assertEquals(7, maxProfit2(prices1));
		TestCase.assertEquals(4, maxProfit2(prices2));
		TestCase.assertEquals(0, maxProfit2(prices3));
		TestCase.assertEquals(2, maxProfit2(prices4));
	}
	
	private static void printByEntry(HashMap<int[], Integer> maxProfitMap) {
		Set<Map.Entry<int[], Integer>> entrySet = maxProfitMap.entrySet();
		Iterator<Map.Entry<int[], Integer>> itor = entrySet.iterator();

		while (itor.hasNext()) {
			Map.Entry<int[], Integer> entry = itor.next();
			System.out.println("Prices:" + Arrays.toString(entry.getKey()) + " ,Profit:" + entry.getValue());
		}
	}

	private static void printByKeySet(HashMap<int[], Integer> map) {
		Set<int[]> keySet = map.keySet();

		Iterator<int[]> itor = keySet.iterator();

		while (itor.hasNext()) {
			int[] key = itor.next();
			System.out.println("Prices:" + Arrays.toString(key) + " ,Profit:" + map.get(key));
		}
	}
}
