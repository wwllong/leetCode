package com.wenwl.algorithm.leetcode.easy;

/**
 * @author wenwl
 * @see <a href="https://leetcode-cn.com/problems/plus-one/">Q66-加一</a>
 */
public class PlusOne {

	/**
	 * m2(0ms): 思路同m1，不过可以利用题目的'单个数字'【0-9】并且数组第一个数非0的前提简化代码
	 * @param digits
	 * @return
	 */
	public static int[] plusOne2(int[] digits){
		for (int i = digits.length - 1; i >= 0; --i){
			if (digits[i] != 9){
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		int[] result = new int[digits.length + 1];
		result[0] = 1;
		return result;
	}


	/**
	 * m1(0ms): 倒叙遍历数组，进行+1操作，注意最处理高位收否有进位的情况。
	 * - 高位进位：创建len+1的数组，其余位为0
	 * - carry = 0，说明没有进位
	 */
	public static int[] plusOne1(int[] digits) {

		int carry = 1, temp;
		
	    for (int i = digits.length - 1; i >= 0; --i) {
	        if (carry == 0) {
	            return digits;
	        }
	        temp = digits[i] + carry;
	        carry = temp / 10;
	        digits[i] = temp % 10;
	    }

	    if (carry != 0) {
	        int[] result = new int[digits.length + 1];
	        result[0] = 1;
	        return result;
	    }

	    return digits;

    }
	
	
}
