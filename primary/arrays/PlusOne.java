package primary.arrays;

/**
 * @author Wwl
 * 给定一个非负整数组成的非空数组，在该数的基础上加一，返回一个新的数组。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 示例 1:
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 示例 2:
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 */

public class PlusOne {
	
	/* 加1运算，分为高位是否进位情况
	 * 高位进位：创建新length+1 数组，高位为1，低位都为0
	 * 高位不进位：不用创建数组，后续数字由低位计算而来
	 * carry：标记是否进位，
	 * 	当carry（temp/10）为0，表示并没有产生进位。
	 * -0ms
	 * */
	public int[] plusOne(int[] digits) {
		int carry = 1,temp = 0;
		
	    for (int i = digits.length - 1; i >= 0; --i) {
	        if (carry == 0) {
	            return digits;
	        }
	        temp = digits[i] + carry;
	        carry = temp / 10; //是否进位的标记   
	        digits[i] = temp % 10; //更新低位的值
	    }

	    if (carry != 0) {
	        int[] result = new int[digits.length + 1];
	        result[0] = 1;
	        return result;
	    }

	    return digits;

    }
	
	
}
