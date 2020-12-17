package primary.string.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import primary.string.WordPattern;

public class WordPatternTest {
	
	private WordPattern wordPattern = null;
	
	@Before
	public void init() {
		wordPattern = new WordPattern();
	}
	
	@Test
	public void test() {
		assertEquals(true, wordPattern.wordPattern("abba", "dog cat cat dog"));
		assertEquals(false,wordPattern.wordPattern("abba", "dog cat cat fish"));
		assertEquals(false,wordPattern.wordPattern("aaaa", "dog cat cat dog"));
		assertEquals(false,wordPattern.wordPattern("abba", "dog dog dog dog"));
	}

}
