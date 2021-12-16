package com.wenwl.algorithm.test.easy;

import com.wenwl.algorithm.leetcode.easy.IsAnagram;
import junit.framework.TestCase;
import org.junit.Test;

public class IsAnagramTest {

	private String s1 = "anagram", t1 = "nagaram";
	private boolean expected1 = true;
	private String s2 = "rat", t2 = "car";
	private boolean expected2 = false;
	private String s3 = "kcqx", t3 = "kcqx";
	private boolean expected3 = true;


	@Test
	public void test1() {
		TestCase.assertEquals(expected1, IsAnagram.isAnagram1(s1, t1));
		TestCase.assertEquals(expected2, IsAnagram.isAnagram1(s2, t2));
		TestCase.assertEquals(expected3, IsAnagram.isAnagram1(s3, t3));
	}

}
