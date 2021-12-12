package com.wenwl.algorithm.leetcode.easy;

/**
 * @author wenwl
 * @see <a href="https://leetcode-cn.com/problems/implement-strstr/">Q28-实现strStr()</a>
 * "大海捞针"，编写属于自己的indexOf()
 * 子字符串查找：KMP算法，推荐博客：
 * -- https://www.cnblogs.com/yjiyjige/p/3263858.html
 * -- https://www.cnblogs.com/dusf/p/kmp.html
 */
public class StrStr {

	/**
	 * m3(6ms): KMP算法
	 */
	public static int strStr3(String haystack, String needle){
		return KMP(haystack, needle);
	}

	public static int KMP(String ts, String ps){

		char[] tsChars = ts.toCharArray();
		char[] psChars = ps.toCharArray();

		// 主串、模式串的index
		int i = 0, j = 0;
		// KMP核心算法
		int[] next = getNext(ps);

		while (i < ts.length() && j < ps.length()){
			// 当j为-1时，要移动的是i，j也要归0
			if (j == -1 || tsChars[i] == psChars[j]) {
				i++;
				j++;
			}
			// j回到指定位置，同时i不需要回溯
			else{
				j = next[j];
			}
		}

		return j == ps.length() ? i-j : -1;
	}

	/**
	 * 模next[j] = k，表示当T[i] != P[j]时，模式串j指针的下一个位置。
	 */
	private static int[] getNext(String ps) {

		if (ps.length() == 0){
			return new int[0];
		}

		char[] p = ps.toCharArray();
		int[] next = new int[p.length];

		next[0] = -1;

		int j = 0, k = -1;

		while (j < p.length - 1) {

			if (k == -1 || p[j] == p[k]) {
				// 优化next[++j] = ++k; 跳过t[j] == t[next[j]]的情况，
				if (p[++j] == p[++k]) {
					next[j] = next[k];
				} else {
					next[j] = k;
				}
			} else {
				k = next[k];
			}
		}

		return next;
	}

	/**
	 * m2(382ms): 参考String的indexOf源代码实现，并做了修改
	 */
	public static int strStr2(String haystack, String needle) {

		char[] source = haystack.toCharArray();
		char[] target = needle.toCharArray();

		int sourceCount = source.length, targetCount = target.length;
		int formIndex = 0;

		if(formIndex >= sourceCount) {
			return targetCount == 0 ? sourceCount : -1;
		}
		if(targetCount == 0) {
			return formIndex;
		}

		int sourceOffset = 0, targetOffset = 0;

		char first = target[targetOffset];
		// 遍历匹配字符串可达到的最大偏移量
		int max = sourceOffset + (sourceCount - targetCount);

		for(int i = 0; i <= max; ++i) {
			// 查找子串第一个字符出现的位置
			if(source[i] != first) {
				while(++i <= max && source[i] != first);
			}

			// 找到第一个字符后，查找剩下的其他字符
			if(i <= max) {
				int j = i + 1;
				int end = j + targetCount - 1;
				// 匹配剩余字符
				for(int k = targetOffset + 1; j < end && source[j] == target[k]; ++j, k++);

				if(j == end) {
					// 找到了整个匹配的字符串，返回起始索引
					return i - sourceOffset;
				}
			}
		}
		return -1;
	}

	/**
	 * m1(382ms): 题目就是想让你实现类似indexOf的功能，ps：同样的代码18年提交才7ms
	 */
	public static int strStr1(String haystack, String needle) {
		return haystack.indexOf(needle);
	}

}
