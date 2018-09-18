package primary.string;

/**
 * @author Wwl
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 */
public class FirstUniqChar {
	
	//O(n^2) ,嵌套循环,70ms
	public int firstUniqChar1(String s) {
		
		if(s.length()==0) return -1;
		if(s.length()==1) return 0;
		
		char[] c = s.toCharArray();
		boolean repeated = false;
		for(int x = 0; x<c.length; ++x) {
			repeated = false;
			for(int y = 0; y < c.length ; ++y) {
				if(c[x] == c[y] && x!=y) {
					repeated = true;
					break;
				}
			}
			if(!repeated) {
				return x;
			}
		}
		return -1;
    }
	
	//O(n^2),前后索引搜索,42ms
	public int firstUniqChar2(String s) {
		char a = ' ';
		for(int i=0; i<s.length(); ++i) {
			a = s.charAt(i);
			if(s.indexOf(a) == s.lastIndexOf(a)) {
				return i;
			}
		}
		return -1;
	}
	
	//O(n),字母表查询,31ms
	public int firstUniqChar3(String s) {
		//字母表存储
		int[] charsCount = new int[26];
		
		for(int i=0; i<s.length(); ++i) {
			//按字母顺序标记字符，并保存出现次数（n）
			charsCount[s.charAt(i)-'a'] += 1;
		}
		for(int i=0; i<s.length(); ++i) {
			//判断是否只出现一次，并且第一次出现一次就返回结果
			if(charsCount[s.charAt(i)-'a']==1)
				return i;
		}
		return -1;
	}
	
	//排名第一的大佬的方法 ,O(n),10ms
	public int firstUniqChar4(String s) {
		int result = -1;
		int index = 0;
		for(char c = 'a'; c <= 'z'; ++c) {
			index = s.indexOf(c);
			//字符串中有该字符,并唯一
			if(index != -1 && index == s.lastIndexOf(c)) {
				//找到第一个唯一的字符
				result = result!=-1 ? Math.min(result, index) : index;
			}
		}
		return result;
	}
}
