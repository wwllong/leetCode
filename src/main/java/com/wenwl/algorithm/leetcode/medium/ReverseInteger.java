package com.wenwl.algorithm.leetcode.medium;

/**
 * @author wenwl
 * @see <a href="https://leetcode-cn.com/problems/reverse-integer/">Q7-整数反转</a>
 * tips：
 * 1. 如果使用字符串拼接转换的方式，一旦超过上下限，将会有java.lang.NumberFormatException的问题
 * 2. 考核 % 运算
 */
public class ReverseInteger {

	/**
	 * m3(0ms)：基于m2改进，删除无用的处理，例如取绝对值、是否溢出的判断
	 * 利用java溢出处理的机制进行优化，如果没有溢出范围，那么反转处理前后的 /10 之后的操作应该是一致的。
	 */
	public int reverse2(int x) {
		int r = 0 , temp;
		while (x != 0){
			temp = r * 10 + x % 10;
			if (temp / 10 != r){
				return 0;
			}
			r = temp;
			x /= 10;
		}
		return r;
	}

	/**
	 * m1(1ms): 取绝对值，累计%10取得最低位，累计*10相加得到最终反转结果，最后处理正负。
	 * 即可以理解为，从数的最后一位开始，依次向前遍历（累计%10），
	 *   每次遍历进行反转（累计*10）、依次左移一位（累计/10）得到新数，直到新数不为0。
	 */
	public int reverse1(int x) {
		int xAbs = (x < 0) ? -x : x;
        long r = 0;
        while (xAbs != 0) {
            r = r * 10 + xAbs % 10;
			xAbs /= 10;
        }
		r = (x < 0) ? -r : r;
        if (r > Integer.MAX_VALUE || r < Integer.MIN_VALUE) {
			return 0;
		}
        return (int)r;
	}

}
