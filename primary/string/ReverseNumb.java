package primary.string;

/**
 * @author Wwl
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。
 * 
 * 假设我们的环境只能存储 32 位有符号整数，
 * 其数值范围是 [−2^31,  2^31 − 1]。
 * 根据这个假设，如果反转后的整数溢出，则返回 0。
 */
public class ReverseNumb {
	/**
	 * 该方法当遇到经转换后，数值越界，导致无法正常格式化数字的的问题
	 * java.lang.NumberFormatException: For input string: "9646324351"
	 * 所以该思路不正确
	 */
	public int reverse(int x) {
		boolean flag = true;
		if(x<0) {
			x = Math.abs(x);
			flag = false;
		}
		int i = 0;
		StringBuilder sb = new StringBuilder();
		while(x!=0) {
			i = x%10;
			sb.append(i);
			x = x/10;
		}
		if(i==0)
			return 0;
		i = Integer.parseInt(sb.toString());
		if(!flag)
			i = -i;
		if(x>Integer.MAX_VALUE || x<Integer.MIN_VALUE )
			return 0;
		return i;
	}
	 
	/**
	 * 不断模10取得最低位，再不断乘10相加得到最终的反转结果
	 * （从一个数的最后一位开始，依次向前遍历，每次反转整数依次左移一位，并取出一位数作为新数的末位数。）
	 * 28ms
	 */
	public int reverse2(int x) {
        boolean flag = false;
        if (x < 0) {
        	x = -x;
        	flag = true;
        }
        
        long r = 0;
        while (x!=0) {
            r = r * 10 + x % 10;
            x /= 10;
        }
        if (flag) r = -r;
        if (r > Integer.MAX_VALUE || r < Integer.MIN_VALUE) return 0;
        return (int)r;
	}
	
	/**
	 * 思路3：改进思路2：
	 * 定义反转以后的数res初始为0，当x不为0时循环：
	 * 
	 * 记录temp=res*10+x%10，此时temp即为遍历到当前位之前的反转整数
	 * 然后比较temp/10与res是否相等，如果整数不溢出显然相等，否则说明反转后的整数溢出，直接返回0
	 * 最后把temp赋值给res，并令x=x/10，即去掉最后一位，继续反转之前的数字
	 * 31ms
	 */
	public int reverse3(int x) {
		int res = 0;
		while(x!=0){
			int temp = res * 10 + x % 10;
			if(temp / 10 != res)
				return 0;
			res = temp; 
			x /= 10;
		}
		return res;
	}
	
}
