package primary.string.test;

import static org.junit.Assert.*;

import org.junit.Test;

import primary.string.CountAndSay;

public class CountAndSayTest {
	
	private CountAndSay countAndSay = null;

	@Test
	public void test1() {
		countAndSay = new CountAndSay();
		
		assertEquals("1", countAndSay.countAndSay1(1));
		assertEquals("1211", countAndSay.countAndSay1(4));
	}
	
	@Test
	public void test2() {
		countAndSay = new CountAndSay();
		
		assertEquals("1", countAndSay.countAndSay2(1));
		assertEquals("1211", countAndSay.countAndSay2(4));
	}

	@Test
	public void test3() {
		countAndSay = new CountAndSay();
		
		assertEquals("1", countAndSay.countAndSay3(1));
		assertEquals("1211", countAndSay.countAndSay3(4));
	}
}
