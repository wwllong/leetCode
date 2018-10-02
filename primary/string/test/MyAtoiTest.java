package primary.string.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import primary.string.MyAtoi;

public class MyAtoiTest {
	
	MyAtoi myAtoi = null;
	String str1 = null;
	String str2 = null;
	String str3 = null;
	String str4 = null;
	String str5 = null;
	String str6 = null;
	String str7 = null;
	String str8 = null;
	String str9 = null;
	
	@Before
	public void init() {
		myAtoi = new MyAtoi();
		str1 = "   -42";
		str2 = "4193 with words";
		str3 = "words and 987";
		str4 = "-91283472332";
		str5 = "   +0 123";
		str6 = "20000000000000000000";
		str7 = "-5-";
		str8 = "-";
		str9 = "-9223372036854775809";
	}

	@Test
	public void test1() {
		assertEquals(-42, myAtoi.myAtoi1(str1));
		assertEquals(4193, myAtoi.myAtoi1(str2));
		assertEquals(0, myAtoi.myAtoi1(str3));
		assertEquals(-2147483648, myAtoi.myAtoi1(str4));
		assertEquals(0, myAtoi.myAtoi1(str5));
		assertEquals(2147483647, myAtoi.myAtoi1(str6));
		assertEquals(-5, myAtoi.myAtoi1(str7));
		assertEquals(0, myAtoi.myAtoi1(str8));
		assertEquals(-2147483648, myAtoi.myAtoi1(str9));
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
