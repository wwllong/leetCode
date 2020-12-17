package primary.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 290. 单词规律
 * 	给定一种规律 pattern 和一个字符串 str ，判断 str 是否遵循相同的规律。
	
	这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。
	
	示例1:
	
	输入: pattern = "abba", str = "dog cat cat dog"
	输出: true
	示例 2:
	
	输入:pattern = "abba", str = "dog cat cat fish"
	输出: false
	示例 3:
	
	输入: pattern = "aaaa", str = "dog cat cat dog"
	输出: false
	示例 4:
	
	输入: pattern = "abba", str = "dog dog dog dog"
	输出: false
	说明:
	你可以假设 pattern 只包含小写字母， str 包含了由单个空格分隔的小写字母。    
 * @author 温万龙
 *
 */
public class WordPattern {
	
	
	/**
	 *  通过数组和Set实现
	 */
	public boolean wordPattern(String pattern, String s) {
		String[] patternArr = new String[26];
		String[] split = s.split(" ");
		Set<String> set = new HashSet<>();
		if(pattern.length() != split.length) {
			return false;
		}
		for(int i = 0,len = pattern.length(); i < len; i++) {
			int index = pattern.charAt(i) - 'a';
			if(patternArr[index] == null) {
				patternArr[index] = split[i];
				if(set.contains(patternArr[index])) {
					return false;
				}
				set.add(patternArr[index]);
				
			}else if(!patternArr[index].equals(split[i])){
				return false;
			}
			
		}	
		return true;
        
    }
	
	
	/**
	 *  通过Map的方式实现
	 */
	public boolean wordPattern1(String pattern, String s) {
		String[] split = s.split(" ");
		if(pattern.length() != split.length) {
			return false;
		}
		Map<Character, String> charStrmap = new HashMap<>();
		Map<String, Character> strCharmap = new HashMap<>();
		char patChar;
		String str;
		for(int i = 0,len = split.length; i < len; i++) {
			patChar = pattern.charAt(i);
			str = split[i];
			if(charStrmap.containsKey(patChar) && !charStrmap.get(patChar).equals(str)) {
					return false;	
			}
			if(strCharmap.containsKey(str) && !strCharmap.get(str).equals(patChar)) {
				return false;
			}
			charStrmap.put(patChar, str);
			strCharmap.put(str, patChar);
		}	
		return true;
        
    }

}
