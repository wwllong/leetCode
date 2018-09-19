package primary.string.test;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import primary.string.IsAnagram;

public class IsAnagramTest {
	
	private IsAnagram isAnagram = null;
	
	@Before
	public void init() {
		isAnagram = new IsAnagram();
	}
	
	@Test
	public void test1() {
		TestCase.assertEquals(true, isAnagram.isAnagram1("anagram", "nagaram"));
		TestCase.assertEquals(false, isAnagram.isAnagram1("rat", "car"));
		TestCase.assertEquals(false, isAnagram.isAnagram1("kcqx", "zlap"));
	}

}
