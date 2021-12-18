package com.wenwl.algorithm.leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author wenwl
 * @see <a href="https://leetcode-cn.com/problems/word-pattern/˚">Q290-单词规律</a>
 */
public class WordPattern {

	/**
	 * m2(0ms,36tc): 简化m1，使用字符串数组（字母表）和HashSet实现
	 * m1中charStrMap，表示模式串对应的字母对应的单词，改进为字符数组，数组的索引代表了26个字母。
	 * HashSet，用于保存做过模式映射的单词，避免单词映射不同的字母。
	 */
	public boolean wordPattern2(String pattern, String s) {
		String[] splitArr = s.split(" ");
		if(pattern.length() != splitArr.length) {
			return false;
		}
		String[] patLetterArr = new String[26];
		Set<String> set = new HashSet<>();
		for(int i = 0; i < pattern.length(); i++) {
			int index = pattern.charAt(i) - 'a';
			String patWord = patLetterArr[index];
			String word = splitArr[i];
			if (patWord == null){
				if(set.contains(word)) {
					return false;
				}
				set.add(word);
				patLetterArr[index] = word;
			}else if (!patWord.equals(word)){
				return false;
			}
		}	
		return true;
    }
	
	
	/**
	 * m1(1ms,36tc): 通过Map的方式实现
	 */
	public boolean wordPattern1(String pattern, String s) {
		String[] splitArr = s.split(" ");
		if(pattern.length() != splitArr.length) {
			return false;
		}
		Map<Character, String> charStrMap = new HashMap<>();
		Map<String, Character> strCharMap = new HashMap<>();
		for (int i = 0; i < pattern.length(); i++) {
			char patChar = pattern.charAt(i);
			String word = splitArr[i];
			if(charStrMap.containsKey(patChar) && !charStrMap.get(patChar).equals(word)) {
				return false;
			}
			if(strCharMap.containsKey(word) && !strCharMap.get(word).equals(patChar)) {
				return false;
			}
			charStrMap.put(patChar, word);
			strCharMap.put(word, patChar);
		}
		return true;
    }

}
