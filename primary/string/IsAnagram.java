package primary.string;

/**
 * @author Wwl
 * 给定两个字符串 s 和 t ,编写一个函数来判断 t 是否是 s 的一个字母异位词。
 * 假设字符串只包含小写字母,
 * 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 */
public class IsAnagram {
	
	//对每个字符串使用字符表（数组）进行统计 O(n) ,4 ms
	public boolean isAnagram1(String s,String t) {
		
		int[] temp1 = new int[26];
		for(int x=0; x<s.length(); ++x) {
			temp1[s.charAt(x)-'a'] += 1;
		}
		
		int[] temp2 = new int[26];
		for(int x=0; x<t.length(); ++x) {
			temp2[t.charAt(x)-'a'] += 1;
		}
		
		for(int x=0; x<temp1.length; ++x) {
			if(temp1[x]!=temp2[x]) return false;
		}
		
		return true;
	}
}
