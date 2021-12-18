package com.wenwl.algorithm.test.easy;

import com.wenwl.algorithm.leetcode.easy.ReverseString;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ReverseStringTest {

	ReverseString reverseString = new ReverseString();

	char[] testCase1 = {'h','e','l','l','o'};
	char[] expected1 = {'o','l','l','e','h'};
	char[] testCase2 = {'H','a','n','n','a','h'};
	char[] expected2 = {'h','a','n','n','a','H'};

	@Test
	public void test() {
		reverseString.reverseString(testCase1);
		assertArrayEquals(expected1, testCase1);
		reverseString.reverseString(testCase2);
		assertArrayEquals(expected2, testCase2);
	}

}
