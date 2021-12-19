package com.wenwl.algorithm.test.easy;

import com.wenwl.algorithm.leetcode.easy.FirstUniqChar;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstUniqCharTest {

	FirstUniqChar firstUniqChar = new FirstUniqChar();

	private String s1 = "leetcode";
	private int expected1 = 0;

	private String s2 = "loveleetcode";
	private int expected2 = 2;

	private String s3 = "z";
	private int expected3 = 0;

	private String s4 = "aadadaad";
	private int expected4 = -1;

	private String s5 = "aadadaadx";
	private int expected5 = 8;

	@Test
	public void test4() {
		assertEquals(expected1, firstUniqChar.firstUniqChar4(s1));
		assertEquals(expected2, firstUniqChar.firstUniqChar4(s2));
		assertEquals(expected3, firstUniqChar.firstUniqChar4(s3));
		assertEquals(expected4, firstUniqChar.firstUniqChar4(s4));
		assertEquals(expected5, firstUniqChar.firstUniqChar4(s5));
	}

	@Test
	public void test3() {
		assertEquals(expected1, firstUniqChar.firstUniqChar3(s1));
		assertEquals(expected2, firstUniqChar.firstUniqChar3(s2));
		assertEquals(expected3, firstUniqChar.firstUniqChar3(s3));
		assertEquals(expected4, firstUniqChar.firstUniqChar3(s4));
		assertEquals(expected5, firstUniqChar.firstUniqChar3(s5));
	}

	@Test
	public void test2() {
		assertEquals(expected1, firstUniqChar.firstUniqChar2(s1));
		assertEquals(expected2, firstUniqChar.firstUniqChar2(s2));
		assertEquals(expected3, firstUniqChar.firstUniqChar2(s3));
		assertEquals(expected4, firstUniqChar.firstUniqChar2(s4));
		assertEquals(expected5, firstUniqChar.firstUniqChar2(s5));
	}

	@Test
	public void test1() {
		assertEquals(expected1, firstUniqChar.firstUniqChar1(s1));
		assertEquals(expected2, firstUniqChar.firstUniqChar1(s2));
		assertEquals(expected3, firstUniqChar.firstUniqChar1(s3));
		assertEquals(expected4, firstUniqChar.firstUniqChar1(s4));
		assertEquals(expected5, firstUniqChar.firstUniqChar1(s5));
	}
	
//
//
//
//	@Test
//	public void test3() {
//		assertEquals(0, firstUniqChar.firstUniqChar3(s1));
//		assertEquals(2, firstUniqChar.firstUniqChar3(s2));
//		assertEquals(0, firstUniqChar.firstUniqChar3(s3));
//		assertEquals(-1, firstUniqChar.firstUniqChar3(s4));
//	}
//
//	@Test
//	public void test4() {
//		assertEquals(0, firstUniqChar.firstUniqChar4(s1));
//		assertEquals(2, firstUniqChar.firstUniqChar4(s2));
//		assertEquals(0, firstUniqChar.firstUniqChar4(s3));
//		assertEquals(-1, firstUniqChar.firstUniqChar4(s4));
//	}

}
