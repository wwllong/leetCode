package primary.string.test;

import static org.junit.Assert.*;

import org.junit.Test;

import primary.string.LongestCommonPrefix;

public class LongestCommonPrefixTest {
	
	private LongestCommonPrefix lCommonPrefix = 
			new LongestCommonPrefix();
	
	private String[] str1 = { "flower","flow","flight"};
	private String[] str2 = {"dog","racecar","car"};

	@Test
	public void test() {
		assertEquals("fl", lCommonPrefix.longestCommonPrefix(str1));
		assertEquals("", lCommonPrefix.longestCommonPrefix(str2));
	}

}
