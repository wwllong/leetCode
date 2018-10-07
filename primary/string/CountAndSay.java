package primary.string;

/**
 * @author Wwl
 * 报数
 * 一个整数照其中的整数的顺序进数序列，按行报数，得到下一个数。
 * 1. 1
 * 2. 11
 * 3. 21
 * 4. 1211
 * 5. 111221
 * 
 *  n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
 *  整数顺序将表示为一个字符串。
 *  
 *  整个题目的意思是：
 *  第i+1个字符串是第i个字符串的读法
 */
public class CountAndSay {
	
	/**
	 * 模拟从1~n的过程
	 * 
	 * 14ms,O(n^2)
	 */
	public String countAndSay1(int n) {
		
		if( n<= 0) return null;
		
		String result = "1";
		
		//模拟生成过程
		int num = 1;
		for(int i = 0; i < n-1; ++i){
			StringBuilder current = new StringBuilder();
			//报数
			for(int y = 0; y<result.length(); ++y) {
				//出现连续相同的数字
				if(y<result.length()-1 && result.charAt(y) == result.charAt(y+1)) {
					++num;
				}else {
					current.append(num + "" + result.charAt(y));
					num = 1;
				}
			}
			
			result = current.toString();
		}
		
		return result;
	}
	
	/**
	 * 改进1的代码实现，但是思路一致
	 * 10ms,O（n^2)
	 */
	public String countAndSay2(int n) {
		String result = "1";
		
		//模拟过程
		while( --n > 0) {
			int count = 1;
			StringBuilder current = new StringBuilder();
			
			//索引改为从1开始
			for(int i = 1; i < result.length(); ++i) {
				if(result.charAt(i) == result.charAt(i-1)) {
					++count;
				}else {
					current.append(count).append(result.charAt(i-1));
					count = 1;
				}
			}
			
			//此处转换为字符串，需要添加最后一个字符的统计
			result = current.append(count).append(result.charAt(result.length()-1)).toString();
		}
		
		return result;
	}
	
	/**
	 * 3ms
	 */
	public String countAndSay3(int n) {
		String result = "1";
		
		//模拟报数过程
		for(int i = 1; i < n; ++i) {
			StringBuilder temp = new StringBuilder();
			char cur = result.charAt(0);//被报数的字符串result起始字符
			int count = 1;
			for(int j = 1; j < result.length(); ++j) {
				if(result.charAt(j)==cur) {
					++count;
				}else {
					temp.append(count).append(cur);
					cur = result.charAt(j);
					count = 1;
				}
			}//end for
			result = temp.append(count).append(cur).toString();
		}
		return result;
	}
}
