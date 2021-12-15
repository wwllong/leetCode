package com.wenwl.algorithm.test.easy;

import com.wenwl.algorithm.leetcode.easy.ContainsDuplicate;
import org.junit.Test;

import junit.framework.TestCase;

public class ContainsDuplicateTest {

	int[] testCase1 = {1, 2, 3, 1};
	boolean expected1 = true;

	int[] testCase2 = {1, 2, 3, 4};
	boolean expected2 = false;

	int[] testCase3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
	boolean expected3 = true;

	int[] testCase4 = {170, -368, 148, 672, 397, -629, -788, 192, 170, 309, -615, -237};
	boolean expected4 = true;

	@Test
	public void testContainsDuplicate5() {
		TestCase.assertEquals(expected1, ContainsDuplicate.containsDuplicate5(testCase1));
		TestCase.assertEquals(expected2, ContainsDuplicate.containsDuplicate5(testCase2));
		TestCase.assertEquals(expected3, ContainsDuplicate.containsDuplicate5(testCase3));
		TestCase.assertEquals(expected4, ContainsDuplicate.containsDuplicate5(testCase4));
	}

	@Test
	public void testContainsDuplicate4() {
		TestCase.assertEquals(expected1, ContainsDuplicate.containsDuplicate4(testCase1));
		TestCase.assertEquals(expected2, ContainsDuplicate.containsDuplicate4(testCase2));
		TestCase.assertEquals(expected3, ContainsDuplicate.containsDuplicate4(testCase3));
	}


	@Test
	public void testContainsDuplicate3() {
		TestCase.assertEquals(expected1, ContainsDuplicate.containsDuplicate3(testCase1));
		TestCase.assertEquals(expected2, ContainsDuplicate.containsDuplicate3(testCase2));
		TestCase.assertEquals(expected3, ContainsDuplicate.containsDuplicate3(testCase3));
	}

	@Test
	public void testContainsDuplicate2() {
		TestCase.assertEquals(expected1, ContainsDuplicate.containsDuplicate2(testCase1));
		TestCase.assertEquals(expected2, ContainsDuplicate.containsDuplicate2(testCase2));
		TestCase.assertEquals(expected3, ContainsDuplicate.containsDuplicate2(testCase3));
	}

	@Test
	public void testContainsDuplicate1() {
		TestCase.assertEquals(expected1, ContainsDuplicate.containsDuplicate1(testCase1));
		TestCase.assertEquals(expected2, ContainsDuplicate.containsDuplicate1(testCase2));
		TestCase.assertEquals(expected3, ContainsDuplicate.containsDuplicate1(testCase3));
	}
	
//
//
//	@Test
//	public void testcContainsDuplicate3() {
//		TestCase.assertEquals(false, cd.containsDuplicate3(new int[] {1,2,3,4}));
//		TestCase.assertEquals(true, cd.containsDuplicate3(new int[] {1,2,3,1}));
//	}
//
//	@Test
//	public void testcContainsDuplicate4() {
//		TestCase.assertEquals(false, cd.containsDuplicate4(new int[] {1,2,3,4}));
//		TestCase.assertEquals(true, cd.containsDuplicate4(new int[] {1,2,3,1}));
//	}
//
//	@Test
//	public void testcContainsDuplicate5() {
//		TestCase.assertEquals(false, cd.containsDuplicate5(new int[] {1,2,3,4}));
//		TestCase.assertEquals(true, cd.containsDuplicate5(new int[] {1,2,3,1}));
//	}
}
