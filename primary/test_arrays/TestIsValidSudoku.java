package primary.test_arrays;

import org.junit.Test;

import junit.framework.TestCase;
import primary.arrays.IsValidSudoku;

public class TestIsValidSudoku {
	
	IsValidSudoku ivs = new IsValidSudoku();
	char[][] board1 = {
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
	public void test1() {
		TestCase.assertEquals(false, ivs.isValidSudoku(board1));
//		System.out.println(ivs.isValidSudoku(board1));
	}
}
