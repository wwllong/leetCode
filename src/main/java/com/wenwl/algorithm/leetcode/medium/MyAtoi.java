package com.wenwl.algorithm.leetcode.medium;

/**
 * @author wenwl
 * @see <a href="https://leetcode-cn.com/problems/string-to-integer-atoi/">Q8-字符串转换整数 (atoi)</a>
 */
public class MyAtoi {

	/**
	 * m2()：基于m1优化，将遍历和转换成数字计算整合，优化遍历中的判断
	 */
	public int myAtoi2(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}

		char[] chars = s.toCharArray();
		int start = 0, index = 0;
		int result = 0, sign = 1;
		// 标记是否出现过数字，避免中间出现 ' '、'+'、'-'的情况
		boolean hasNumber = false;
		while (index < chars.length){
			char aChar = chars[index];
			if (aChar >= '0' && aChar <= '9'){
				hasNumber = true;
				// 计算结果
				int temp = result * 10 + (aChar - '0');
				if (temp / 10 != result) {
					return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
				}
				result = temp;
				index++;
			}else {
				if (aChar == ' '){
					if (hasNumber){
						break;
					}
					start = ++index;
					continue;
				} else if (aChar == '-' || aChar == '+'){
					if (hasNumber){
						break;
					}
					// 特殊情况: 索引已经达到末端或下一个字符不是数字
					if (index == s.length() - 1 || chars[index+1] < '0' || chars[index+1] > '9'){
						return 0;
					}
					sign = aChar == '-' ? -1 : 1;
					index++;
					continue;
				}else if (aChar < '0' || aChar > '9'){
					if (index == start){
						return 0;
					}
				    break;
				}
			}

//			if (aChar == ' '){
//				if (hasNumber){
//					break;
//				}
//				start = ++index;
//				continue;
//			}
//			else if (aChar == '-' || aChar == '+'){
//				if (hasNumber){
//					break;
//				}
//				// 特殊情况: 索引已经达到末端或下一个字符不是数字
//				if (index == s.length() - 1 || chars[index+1] < '0' || chars[index+1] > '9'){
//					return 0;
//				}
//				sign = aChar == '-' ? -1 : 1;
//				index++;
//				continue;
//			}
//			else if (aChar < '0' || aChar > '9'){
//				if (index == start){
//					return 0;
//				}
//				break;
//			}

		}

		return result * sign;
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
