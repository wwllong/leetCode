package com.wenwl.algorithm.leetcode.easy;

/**
 * @author wenwl
 * @see <a href="https://leetcode-cn.com/problems/valid-palindrome/">Q125-验证回文串</a>
 */
public class IsPalindrome {

	/**
	 * m3(1ms): 在m2的基础上，将验证以及获取值模块整合
	 */
	public static boolean isPalindrome3(String s) {

		if(s.isEmpty()) {
			return true;
		}

		char[] charArray = s.toCharArray();
		int i = 0, y = charArray.length - 1;
		while ( i < y){
			char c1 = validateChar(charArray[i]);
			if(c1 == 0) {
				++i;
				continue;
			}
			char c2 = validateChar(charArray[y]);
			if(c2 == 0) {
				--y;
				continue;
			}
			if(c1 != c2) {
				return false;
			}
			++i;
			--y;
		}

		return true;
	}

	private static char validateChar(char ch) {
		if(ch >= 'A' && ch <= 'Z') {
			return (char)(ch+'a'-'A');
		}else if((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <='9')) {
			return ch;
		}else {
			return 0;
		}
	}

	/**
	 * m2(1ms): 在m1的基础上，将toLowerCase滞后，使用s.toCharArray
	 * @param s
	 * @return
	 */
	public static boolean isPalindrome2(String s) {

		if(s.isEmpty()) {
			return true;
		}

		char[] charArray = s.toCharArray();
		int i = 0 , y = charArray.length-1;
		while(i < y) {
			char c1 = charArray[i];
			if(!isAlphabet(c1)) {
				++i;
				continue;
			}
			char c2 = charArray[y];
			if(!isAlphabet(c2)) {
				--y;
				continue;
			}
			//此处对大小写进行转换
			if(getValue(c1) != getValue(c2)) {
				return false;
			}
			++i;
			--y;
		}

		return true;
	}

	private static char getValue(char c) {
		if(c >= 'A' && c <= 'Z') {
			return (char)( c - 'A' + 'a');
		}else {
			return c;
		}
	}

	/**
	 * m1(3ms): 字符串转换为小写，双指针进行前后对比（排除非字符/数字的对比）
	 */
	public static boolean isPalindrome1(String s) {

		if(s.isEmpty()) {
			return true;
		}

		s = s.toLowerCase();
		int x = 0, y = s.length()-1;
		char c1, c2;
		while(x < y) {
			c1 = s.charAt(x);
			c2 = s.charAt(y);
			if(!isAlphabet(c1)) {
				++x;
				continue;
			}
			if(!isAlphabet(c2)) {
				--y;
				continue;
			}
			if(c1 != c2) {
				return false;
			}
			++x;
			--y;
		}
		return true;

	}
	
	private static boolean isAlphabet(char c) {
		return (c >= 'A' && c<= 'Z' || c >= 'a' && c<='z' || c>='0' && c<='9');
	}
	
}
