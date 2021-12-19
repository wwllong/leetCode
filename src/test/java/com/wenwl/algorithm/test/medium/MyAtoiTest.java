package com.wenwl.algorithm.test.medium;

import static org.junit.Assert.*;

import com.wenwl.algorithm.leetcode.medium.MyAtoi;
import org.junit.Before;
import org.junit.Test;


public class MyAtoiTest {
	
	MyAtoi myAtoi = new MyAtoi();

	String str1 = "42";
	int expected1 = -42;
	String str2 = "   -42";
	int expected2 = -42;
	String str3 = "4193 with words";
	int expected3 = 4193;
	String str4 = "words and 987";
	int expected4 = 0;
	String str5 = "-91283472332";
	int expected5 = -2147483648;
	String str6 = "   +0 123";
	int expected6 = 0;
	String str7 = "20000000000000000000";
	int expected7 = 2147483647;
	String str8 = "-5-";
	int expected8 = -5;
	String str9 = "-";
	int expected9 = 0;
	String str10 = "-9223372036854775809";
	int expected10 = -2147483648;

	@Test
	public void test1() {
		assertEquals(expected1, myAtoi.myAtoi1(str1));
		assertEquals(expected2, myAtoi.myAtoi1(str2));
		assertEquals(expected3, myAtoi.myAtoi1(str3));
		assertEquals(expected4, myAtoi.myAtoi1(str4));
		assertEquals(expected5, myAtoi.myAtoi1(str5));
		assertEquals(expected6, myAtoi.myAtoi1(str6));
		assertEquals(expected7, myAtoi.myAtoi1(str7));
		assertEquals(expected8, myAtoi.myAtoi1(str8));
		assertEquals(expected9, myAtoi.myAtoi1(str9));
		assertEquals(expected10, myAtoi.myAtoi1(str10));
	}
	
	@Test
	public void test2() {
		assertEquals(-42, myAtoi.myAtoi2(str1));
		assertEquals(4193, myAtoi.myAtoi2(str2));
		assertEquals(0, myAtoi.myAtoi2(str3));
		assertEquals(-2147483648, myAtoi.myAtoi2(str4));
		assertEquals(0, myAtoi.myAtoi2(str5));
		assertEquals(2147483647, myAtoi.myAtoi2(str6));
		assertEquals(-5, myAtoi.myAtoi2(str7));
		assertEquals(0, myAtoi.myAtoi2(str8));
		assertEquals(-2147483648, myAtoi.myAtoi2(str9));
	}

}
