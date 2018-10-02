package primary.string;

/**
 * @author Wwl
 * 字符串转整数 (atoi)
 * 1.丢弃多余空格字符，直到找到第一个非空格字符。
 *   如果是正号、负号、数字，拼接连续的数字
 * 2.无效的转换：第一个非空字符序列不是有效整数，字符字符串为空，
 *   返回0
 * 3.转换超过限制，数值范围为4个字节。
 *   返回最大值或最小值
 * 
 */
public class MyAtoi {
	
	/**思路1：遍历字符串(charAt)，逐个判断
	 * 截取字符串，包含+、-
	 * 对字符串进行数字拼接
	 * 转换字符串（返回有效字符）
	 * 33ms
	 * */
	public int myAtoi1(String str) {
		if(str == null) return 0;
		if(str.length()<0) return 0;
		
		StringBuffer strBuf = new StringBuffer();
		
		//截取字符：第一个非空字符到末端
		boolean flag = true; //是否有带+ 、 -
		for(int x=0 ; x<str.length(); ++x) {
			if(str.charAt(x)==' ') {
				continue;
			} else {
				//对字符的正负号进行判断
				if(str.charAt(x)=='-') {
					flag = false;
					if(x+1>str.length()) {//特殊情况 ，说明第一个字符后面没有字符了
						return 0;
					}else {
						++x;
					}
				} else if(str.charAt(x)=='+') {
					if(x+1>str.length()) {//特殊情况 ，说明第一个字符后面没有字符了
						return 0;
					}else {
						++x;
					}
				}
				str = str.substring(x);
				break;
			}
		}
		
		int i = 0;
		int j = str.length()-1;
		char temp = ' ';
		//遍历字符，拼接有效字符
		while(i<=j) {
			temp = str.charAt(i);
			
			//对符号的判断，避免字符串前后都有一个+或者-
			if(temp >= '0' && temp <= '9') { //有效字符
				strBuf.append(temp);
				++i;
			}else {
				//添加数字的正负号信息
				break;
			}
			
		}
		
		int result = 0;
		long parse = 0l;
		try {
			//添加正负号信息
			if(!flag) strBuf.insert(0, '-');
			parse = Long.parseLong(strBuf.toString()); 
		}catch(NumberFormatException e) {
			if(strBuf.length()>10) { //避免出现比long还大或者小的数导致的异常
				result = (flag==true)?Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
			return result; //无法转换，直接返回0
		}
		
		if(parse > Integer.MAX_VALUE) {
			result = Integer.MAX_VALUE;
		}else if(parse < Integer.MIN_VALUE){
			result = Integer.MIN_VALUE;
		}else {
			result =(int) parse;
		}
		
		return strBuf.toString().length()==0?0:result;
	}
	
	/**
	 * 改进1方法：方法1带来的复杂判断问题主要是字符串转换为整型导致的，改成通过累加思想对其进行判断。
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
	
	
}
