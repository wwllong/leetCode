package primary.string.test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import primary.string.IsPalindrome;

class IsPalindromeTest {
	
	private IsPalindrome isPalindrome = null;

	@BeforeEach
	public void init() {
		isPalindrome = new IsPalindrome();
	}
	
	
	void test1() {
		TestCase.assertEquals(true, isPalindrome.isPalindrome1("A man, a plan, a canal: Panama"));
		TestCase.assertEquals(false, isPalindrome.isPalindrome1("race a car"));
		TestCase.assertEquals(false, isPalindrome.isPalindrome1("0P"));
	}
	
	@Test
	void test2() {
		TestCase.assertEquals(true, isPalindrome.isPalindrome2("A man, a plan, a canal: Panama"));
		TestCase.assertEquals(false, isPalindrome.isPalindrome2("race a car"));
		TestCase.assertEquals(false, isPalindrome.isPalindrome2("0P"));
	}
	
	@Test
	void test3() {
		TestCase.assertEquals(true, isPalindrome.isPalindrome3("A man, a plan, a canal: Panama"));
		TestCase.assertEquals(false, isPalindrome.isPalindrome3("race a car"));
		TestCase.assertEquals(false, isPalindrome.isPalindrome3("0P"));
	}

}
