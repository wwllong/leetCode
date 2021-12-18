package com.wenwl.algorithm.test.easy;

import static org.junit.Assert.*;

import com.wenwl.algorithm.leetcode.easy.WordPattern;
import org.junit.Before;
import org.junit.Test;


public class WordPatternTest {
	
	private WordPattern wordPattern;

	private String pattern1 = "abba";
	private String pattern2 = "aaaa";
	private String s1 = "dog cat cat dog";
	private String s2 = "dog cat cat fish";
	private String s3 = "dog cat cat dog";
	private String s4 = "dog dog dog dog";

	@Before
	public void init() {
		wordPattern = new WordPattern();
	}

	@Test
	public void test2() {
		assertTrue(wordPattern.wordPattern2(pattern1, s1));
		assertFalse(wordPattern.wordPattern2(pattern1, s2));
		assertFalse(wordPattern.wordPattern2(pattern2, s3));
		assertFalse(wordPattern.wordPattern2(pattern1, s4));
	}
	
	@Test
	public void test1() {
		assertTrue(wordPattern.wordPattern1(pattern1, s1));
		assertFalse(wordPattern.wordPattern1(pattern1, s2));
		assertFalse(wordPattern.wordPattern1(pattern2, s3));
		assertFalse(wordPattern.wordPattern1(pattern1, s4));
	}

}
