package primary.string.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import primary.string.FirstUniqChar;

/**
 * @author Wwl
 * s = "leetcode" 返回 0.
 * s = "loveleetcode", 返回 2.
 */
class FirstUniqCharTest {
	FirstUniqChar firstUniqChar = null;
	String s1 = null;
	String s2 = null;
	String s3 = null;
	String s4 = null;
	
	@BeforeEach
	public void init() {
		firstUniqChar = new FirstUniqChar();
		s1 = "leetcode";
		s2 = "loveleetcode";
		s3 = "z";
		s4 = "aadadaad";
	} 
	
	@Test
	public void test() {
		assertEquals(0, firstUniqChar.firstUniqChar1(s1));
		assertEquals(2, firstUniqChar.firstUniqChar1(s2));
		assertEquals(0, firstUniqChar.firstUniqChar1(s3));
		assertEquals(-1, firstUniqChar.firstUniqChar1(s4));
	}
	
	@Test
	public void test2() {
		assertEquals(0, firstUniqChar.firstUniqChar2(s1));
		assertEquals(2, firstUniqChar.firstUniqChar2(s2));
		assertEquals(0, firstUniqChar.firstUniqChar2(s3));
		assertEquals(-1, firstUniqChar.firstUniqChar2(s4));
	}
	

	@Test
	public void test3() {
		assertEquals(0, firstUniqChar.firstUniqChar3(s1));
		assertEquals(2, firstUniqChar.firstUniqChar3(s2));
		assertEquals(0, firstUniqChar.firstUniqChar3(s3));
		assertEquals(-1, firstUniqChar.firstUniqChar3(s4));
	}
	
	@Test
	public void test4() {
		assertEquals(0, firstUniqChar.firstUniqChar4(s1));
		assertEquals(2, firstUniqChar.firstUniqChar4(s2));
		assertEquals(0, firstUniqChar.firstUniqChar4(s3));
		assertEquals(-1, firstUniqChar.firstUniqChar4(s4));
	}

}
