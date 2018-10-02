package primary.string;

/**
 * @author Wwl 
 * 实现 strStr() 函数。 给定一个 haystack 字符串和一个 needle 字符串， 在 haystack
 * 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回 -1。
 */
public class StrStr {
	
	/**
	 * 使用String封装的indexOf函数实现
	 * 6ms
	 */
	public int strStr1(String haystack, String needle) {
		return haystack.indexOf(needle);
	}
	
	/**
	 * 参考String的indexOf源代码实现
	 */
	public int strStr2(String haystack,String needle) {
		return myIndexOf(haystack,needle);
	}
	
	/**
	 * @param haystack 匹配字符串
	 * @param needle 模式串（字串）
	 * @param formIndex 开始匹配的位置
	 * 1.转换为字符数组
	 * 2.有效匹配检测
	 * 3.循环遍历匹配
	 * 7ms
	 */
	private int myIndexOf(String haystack,String needle) {
		char[] source = haystack.toCharArray();
		char[] target = needle.toCharArray();
		
		int sourceCount = source.length;//匹配字符串长度
		int targetCount = target.length;//字串长度
		int formIndex = 0;
		
		//进行匹配搜索前的检测
//		if(formIndex >= sourceCount) {
//			return (targetCount == 0 ? sourceCount : -1);
//		}
//		if(formIndex < 0) {
//			formIndex = 0;
//		}
		if(targetCount == 0) { //空子串，默认返回0
			return formIndex;
		}
		
		int sourceOffset = 0; //匹配字符串的偏移量
		int targetOffset = 0; //字串偏移量
		
		char first = target[targetOffset];
		int max = sourceOffset + (sourceCount - targetCount);//遍历匹配字符串可达到的最大偏移量
		
		for(int i = sourceOffset + formIndex; i <= max; ++i) {
			//查找字串第一个字符出现的位置
			if(source[i] != first) {
				while(++i <= max && source[i] != first);
			}
			
			//找到第一个字符后，查找剩下的其他字符
			if(i <= max) {
				int j = i + 1;
				int end = j + targetCount - 1; 
				for(int k = targetOffset + 1; j < end && source[j] 
						== target[k]; ++j,k++);
				
				if(j == end) {
					//找到了整个匹配的字符串，返回起始索引
					return i-sourceOffset;
				}
			}
		}
		return -1;
	}
	
	
}
