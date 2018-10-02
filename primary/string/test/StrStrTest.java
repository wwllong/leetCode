package primary.string.test;

import static org.junit.Assert.*;

import org.junit.Test;

import primary.string.StrStr;

public class StrStrTest {
	
	private StrStr strStr = new StrStr();;
	private String haystack1 = "hello";
	private String needle1 = "ll";
	private String haystack2 = "aaaaa";
	private String needle2 = "bba";
	private String needle = "";

	@Test
	public void test1() {
		assertEquals(2,strStr.strStr1(haystack1, needle1));
		assertEquals(-1,strStr.strStr1(haystack2, needle2));
		assertEquals(0,strStr.strStr1(haystack2, needle));
	}
	
	@Test
	public void test2() {
		assertEquals(2,strStr.strStr2(haystack1, needle1));
		assertEquals(-1,strStr.strStr2(haystack2, needle2));
		assertEquals(0,strStr.strStr2(haystack2, needle));
	}

}
