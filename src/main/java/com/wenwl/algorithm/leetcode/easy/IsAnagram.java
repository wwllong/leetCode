package com.wenwl.algorithm.leetcode.easy;

/**
 * @author wenwl
 * @see <a href="https://leetcode-cn.com/problems/valid-anagram/">Q242-有效的字母异位词</a>
 */
public class IsAnagram {
	
	/**
	 * m1(1ms): 遍历统计，使用"字母表"数组
	 */
	public static boolean isAnagram1(String s, String t) {
		if (s.length() != t.length()){
			return false;
		}
		
		int[] arr1 = new int[26], arr2 = new int[26];
		char[] sChars1 = s.toCharArray(), sChars2 = t.toCharArray();
		for (char c : sChars1) {
			arr1[c - 'a'] += 1;
		}
		for (char c : sChars2) {
			arr2[c - 'a'] += 1;
		}
		for (int i = 0; i < arr1.length; i++) {
			if(arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}
}
