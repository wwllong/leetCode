package primary.test_string;

import org.junit.Test;

import junit.framework.TestCase;
import primary.string.ReverseString;

public class TestRevString {

	ReverseString revString = new ReverseString();
	String s = "hello";
	String rs = "olleh";
	
	@Test
	public void test() {
		TestCase.assertEquals(rs, revString.reverseString(s));
	}
	
	@Test
	public void test2() {
		TestCase.assertEquals(rs, revString.reverseString2(s));
	}

	@Test
	public void test3() {
		TestCase.assertEquals(rs, revString.reverseString3(s));
	}
}
