package com.wenwl.algorithm.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wenwl
 * @see <a href="https://leetcode-cn.com/problems/valid-sudoku/">Q36-有效的数独</a>
 */
public class IsValidSudoku {

	/**
	 * m2(1ms,507tc): 在m1的思路上，将hashSet改成数组。
	 * rows[i][index], 每行 i 数字 index + 1 的出现次数
	 * columns[j][index], 每列 j 数字 index + 1 的出现次数
	 * subBoxes[i/3][i/j][index], 每个[i/3]行[i/j]列个小九宫格，数字 index + 1 的出现次数
	 */
	public boolean isValidSudoku2(char[][] board) {
		int[][] rows = new int[9][9];
		int[][] columns = new int[9][9];
		int[][][] subBoxes = new int[3][3][9];
		for (int i = 0; i < 9; ++i) {
			for (int j = 0; j < 9; ++j) {
				char c = board[i][j];
				if (c != '.') {
					int index = c - '0' - 1;
					rows[i][index]++;
					columns[j][index]++;
					subBoxes[i/3][j/3][index]++;
					if (rows[i][index] > 1 || columns[j][index] > 1 || subBoxes[i / 3][j / 3][index] > 1) {
						return false;
					}
				}
			}
		}
		return true;
	}

	/**
	 * m1(2ms,507tc): 暴力遍历，建立三个HashSet集合，记录3种情况
	 */
	public boolean isValidSudoku1(char[][] board) {

		Set<Character> rowSet = new HashSet<>(9);
		Set<Character> columnSet = new HashSet<>(9);
		Set<Character> blockSet = new HashSet<>(9);
		
		for(int x = 0, len = board.length; x < len; ++x) {
			rowSet.clear();
			columnSet.clear();
			for(int y = 0; y < len; ++y) {
				if(board[x][y] != '.' && !rowSet.add(board[x][y])) {
					return false;
				}
				if(board[y][x] != '.' && !columnSet.add(board[y][x])) {
					return false;
				}
				if(x % 3 == 0 &&  y % 3 == 0){
					if(!checkBlock(blockSet, board, x, y)) {
						return false;
					}
				}
			}
		}
		
		return true;
	}

	private boolean checkBlock(Set<Character> blockSet, char[][] board, int x, int y) {
		blockSet.clear();
		for(int i = x; i < x + 3; ++i) {
			for(int j = y; j < y + 3; ++j) {
				if(board[i][j] != '.' && !blockSet.add(board[i][j]))
					return false;
			}
		}
		return true;
	}

}
