package com.wenwl.algorithm.leetcode.easy;

/**
 * @author wenwl
 * @see <a href="https://leetcode-cn.com/problems/first-unique-character-in-a-string/submissions/">Q387-字符串中的第一个唯一字符</a>
 */
public class FirstUniqChar {

	/**
	 * m4(2ms, 104tc): m3方法的变种，减少了统计
	 */
	public int firstUniqChar4(String s) {
		int result = s.length();
		for(char c = 'a'; c <= 'z'; c++) {
			int index = s.indexOf(c);
			if(index != -1 && index == s.lastIndexOf(c)) {
				result = Math.min(result, index);
			}
		}
		return result == s.length() ? -1 : result;
	}

	/**
	 * m3(3ms, 104tc): 使用计数器（字母表数组）统计字母出现次数
	 */
	public int firstUniqChar3(String s) {
		int[] charsCount = new int[26];
		char[] chars = s.toCharArray();
		for (char aChar : chars) {
			charsCount[aChar - 'a'] += 1;
		}
		for (int i = 0; i < chars.length; i++) {
			if(charsCount[chars[i] - 'a'] == 1){
				return i;
			}
		}
		return -1;
	}

	/**
	 * m2(24ms,104tc): 思路与m1差不多，主要是用来String封装的index方法
	 * 代码简洁了，但执行时间却变慢了，因为多了一次index遍历。
	 */
	public int firstUniqChar2(String s) {
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			char aChar = chars[i];
			if (s.indexOf(aChar) == s.lastIndexOf(aChar)){
				return i;
			}
		}
		return -1;
	}

	/**
	 * m1(13ms,104tc): 暴力循环嵌套
	 */
	public int firstUniqChar1(String s) {
		if (s.length() == 0) {
			return -1;
		}
		if (s.length() == 1) {
			return 0;
		}
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			boolean single = true;
			for(int j = 0; j < c.length; j++) {
				if(c[i] == c[j] && i != j) {
					single = false;
					break;
				}
			}
			if(single) {
				return i;
			}
		}
		return -1;
    }

}
