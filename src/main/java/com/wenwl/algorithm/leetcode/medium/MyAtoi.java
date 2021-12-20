package com.wenwl.algorithm.leetcode.medium;

/**
 * @author wenwl
 * @see <a href="https://leetcode-cn.com/problems/string-to-integer-atoi/">Q8-字符串转换整数 (atoi)</a>
 */
public class MyAtoi {

	/**
	 * m2()：基于m1优化
	 * 方法1带来的复杂判断问题主要是字符串转换为整型导致的，改成通过累加思想对其进行判断。
	 * 字符串的预处理，去除两端空字符,无效字符判断等
	 * 获取到正负号信息
	 * 进行累加判断
	 * 29ms
	 */
	public int myAtoi2(String str) {
		str = str.trim();
		if(str.isEmpty()) return 0;

		int i = 0;
		int sign = 1;
		//正负号信息记录
		if(str.charAt(i)=='+' || str.charAt(i)=='-') {
			sign = str.charAt(i)=='+' ? 1 : -1;
			++i;
		}

		long result = 0;
		//判断合法，并累加结果
		while(i<str.length() && str.charAt(i) >='0' && str.charAt(i) <='9') {
			result = result * 10 + (str.charAt(i)-'0');
			//溢出判断
			if(result > Integer.MAX_VALUE) {
				return sign==1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
			++i;

		}
		return ((int)result)*sign;
	}
	
	/**
	 * m1(1ms，1082tc)：按照要求遍历str字符串，返回整型
	 * 对+、-、数字做定位，截取成"数字"字符串
	 * 对数字字符串转换成数字
	 * 33ms
	 * */
	public int myAtoi1(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}

		char[] chars = s.toCharArray();
		int start = 0, i = 0;
		// 标记是否出现过数字，避免中间出现 ' '、'+'、'-'的情况
		boolean hasNumber = false;
		while (i < chars.length){
			char aChar = chars[i];
			if (aChar == ' '){
				if (hasNumber){
					break;
				}
				start = ++i;
				continue;
			}
			if (aChar == '-' || aChar == '+'){
				if (hasNumber){
					break;
				}
				// 特殊情况: 索引已经达到末端或下一个字符不是数字
				if (i == s.length() - 1 || chars[i+1] < '0' || chars[i+1] > '9'){
					return 0;
				}
			}else if (aChar < '0' || aChar > '9'){
				if (i == start){
					return 0;
				}
				break;
			}
			hasNumber = true;
			i++;
		}

		String digitalStr = s.substring(start, i);
		char[] digitalCharArr = digitalStr.toCharArray();
		int result = 0, sign = 1;
		for (char c : digitalCharArr) {
			if (c == '-' || c == '+') {
				sign = c == '-' ? -1 : 1;
				continue;
			}
			int temp = result * 10 + (c - '0');
			if (temp / 10 != result) {
				return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
			result = temp;
		}
		
		return result * sign;
	}
	
	
}
