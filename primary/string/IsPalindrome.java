package primary.string;

/**
 * @author Wwl
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 将空字符串定义为有效的回文串
 */
public class IsPalindrome {
	
	// 13 ms 
	public boolean isPalindrome1(String s) {
		if(s.isEmpty()) return true;
		
		s = s.toLowerCase(); //较耗时
		int x=0,y=s.length()-1;
		char c1 = ' ';
		char c2 = ' ';
		
		while(x<y) {
			c1 = s.charAt(x);
			c2 = s.charAt(y);
			if(!isAlphabet(c1)) {
				++x;
				continue;
			}
			if(!isAlphabet(c2)) {
				--y;
				continue;
			}
			if(c1 != c2) {
				return false;
			}
			++x;
			--y;
		}
		return true;
	}
	
	private boolean isAlphabet(char c) {
		if(c>='A'&&c<='Z' || c>='a'&&c<='z' || c>='0' && c<='9')
			return true;
		return false;
	}
	
	//消除部分大小写转换,以及多次字符串获取对应字符操作--4ms
	public boolean isPalindrome2(String s) {
		if(s==null || s.length()==0) return true;
		
		char[] charArray = s.toCharArray();
		int i=0;
		int j=charArray.length-1;
		while(i<=j) {
			if(!isValidChar(charArray[i])) {
				++i;
				continue;
			}
			if(!isValidChar(charArray[j])) {
				--j;
				continue;
			}
			//此处对大小写进行转换
			if(getValue(charArray[i]) == getValue(charArray[j])) {
				++i;
				--j;
			}else {
				return false;
			}
		}
		return true;
	}
	
	private boolean isValidChar(char c) {
		return ((c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9'));
	}
	
	private char getValue(char c) {
		if(c>='A' && c<='Z') {
			return (char)(c-'A' + 'a');
		}else {
			return c;
		}
	}
	
	//大佬方法:在方法2的基础上,将验证以及获取值模块整合
	private char validateChar(char ch) {
		if(ch >= 'A' && ch <= 'Z') {
			return (char)(ch+'a'-'A');
		}else if((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <='9')) {
			return ch;
		}else {
			return 0;
		}
	}
	
	public boolean isPalindrome3(String s) {
		
		char[] charArray = s.toCharArray();
		char prev = ' ';
		char end = ' ';
		for(int i=0,j=charArray.length -1; i<j;) {
			prev = validateChar(charArray[i]);
			if(prev == 0) {
				++i;
				continue;
			}
			end = validateChar(charArray[j]);
			if(end == 0) {
				--j;
				continue;
			}
			
			if( prev != end) {
				return false;
			}
			++i;
			--j;
		}
		return true;
	}
	
}
