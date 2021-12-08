package com.wenwl.algorithm.leetcode.easy;

/**
 * @author wenwl
 * @see <a href="https://leetcode-cn.com/problems/longest-common-prefix/">Q14-最长公共前缀</a>
 */
public class LongestCommonPrefix {

	/**
	 * m2(0ms): 可从strs中任意选取一个元素视为最长公共前缀，
	 * 巧用startsWith函数，逐个比较，当不符合时就逐步砍去"尾巴"，如此反复即可。
	 *
	 */
	public String longestCommonPrefix2(String[] strs) {
		if( strs.length == 0){
			return "";
		}else{
			String commonPre = strs[0];
			for(String str : strs){
				while(!str.startsWith(commonPre)){
					if (commonPre.length() == 1){
						return "";
					}
					commonPre = commonPre.substring(0, commonPre.length() - 1);
				}
			}
			return commonPre;
		}
	}

	/**
	 * m1(1ms): 暴力嵌套匹配，注意边界、特殊情况即可。
	 */
	public String longestCommonPrefix1(String[] strs) {
		StringBuilder str = new StringBuilder();
		if (strs.length <= 1) {
			return strs.length == 0 ? str.toString() : strs[0];
		}
		for (int x = 0, len = strs[0].length(); x < len; ++x) {
			char c = strs[0].charAt(x);
			for (int y = 1, strsLen = strs.length; y < strsLen; ++y) {
				String matchStr = strs[y];
				// 提前退出：字符串长度溢出 或者 根本找不到匹配字符
				if (x >= matchStr.length() || c != matchStr.charAt(x)) {
					return str.toString();
				}
				if ( y == strsLen - 1 ){
					str.append(c);
				}
			}
		}
		return str.toString();
	}

}
