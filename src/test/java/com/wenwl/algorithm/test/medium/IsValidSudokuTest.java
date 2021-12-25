package com.wenwl.algorithm.test.medium;

import com.wenwl.algorithm.leetcode.medium.IsValidSudoku;
import org.junit.Test;

import junit.framework.TestCase;

public class IsValidSudokuTest {
	
	IsValidSudoku isValidSudoku = new IsValidSudoku();

	private char[][] board1 = {
			{'5','3','.','.','7','.','.','.','.'},
			{'6','.','.','1','9','5','.','.','.'},
			{'.','9','8','.','.','.','.','6','.'},
			{'8','.','.','.','6','.','.','.','3'},
			{'4','.','.','8','.','3','.','.','1'},
			{'7','.','.','.','2','.','.','.','6'},
			{'.','6','.','.','.','.','2','8','.'},
			{'.','.','.','4','1','9','.','.','5'},
			{'.','.','.','.','8','.','.','7','9'}
	};

	private char[][] board2 = {
			{'8','3','.','.','7','.','.','.','.'},
			{'6','.','.','1','9','5','.','.','.'},
			{'.','9','8','.','.','.','.','6','.'},
			{'8','.','.','.','6','.','.','.','3'},
			{'4','.','.','8','.','3','.','.','1'},
			{'7','.','.','.','2','.','.','.','6'},
			{'.','6','.','.','.','.','2','8','.'},
			{'.','.','.','4','1','9','.','.','5'},
			{'.','.','.','.','8','.','.','7','9'}
	};

	@Test
	public void test2() {
		TestCase.assertEquals(true, isValidSudoku.isValidSudoku2(board1));
		TestCase.assertEquals(false, isValidSudoku.isValidSudoku2(board2));
	}
	
	@Test
	public void test1() {
		TestCase.assertEquals(true, isValidSudoku.isValidSudoku1(board1));
		TestCase.assertEquals(false, isValidSudoku.isValidSudoku1(board2));
	}
}
