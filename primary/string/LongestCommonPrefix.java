package primary.string;

/**
 * @author Wwl
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""
 */
public class LongestCommonPrefix {
	
	public String longestCommonPrefix(String[] strs) {
		String str = "";
		
		int judge = 1; //1 继续匹配 , 0 结束匹配 
		if(strs.length==0) {
			return str;
		}
		
		for(int x=0; x<strs[0].length(); ++x) {
			char a = strs[0].charAt(x); //从第一个字符串数组的第一个字母开始匹配
			
			for(int y=0; y<strs.length; ++y) {
				
				if(x>=strs[y].length()) { //每个字符串不同,防止字符串长度溢出
					judge = 0;
					break;
				}
				
				if(a != strs[y].charAt(x)) {
					judge = 0;
					break; //找到不匹配直接退出循环
				}else {
					if(y==strs.length-1)
						str += a;
				}
				
			}
			
			if(judge==0) break; //直接退出
		}
		
		return str;
	}
}
