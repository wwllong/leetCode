package primary.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Wwl
 * 有效的数独
 * 判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。
 *  数字 1-9 在每一行只能出现一次。
 *  数字 1-9 在每一列只能出现一次。
 *  数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
 *  
 *  数独部分空格内已填入了数字，空白格用 '.' 表示。
 */
public class IsValidSudoku {
	/* 思路一：建立三个HashSet集合，记录3种情况
	 * 504eg:25ms
	 * */
	public boolean isValidSudoku(char[][] board) {
		Set<Character> hSet = new HashSet<>();
		Set<Character> rSet = new HashSet<>();
		Set<Character> blockSet = new HashSet<>();
		
		int len = board.length; //9
		
		for(int x=0; x<len; ++x) {
			hSet.clear();
			rSet.clear();
			for(int y=0; y<len; ++y) {
//				System.out.print(board[x][y]+",");
//				System.out.print(board[y][x]+",");
//				if(x%3==0 &&  y%3==0)
//					System.out.println(x+" "+y);
				if(board[x][y]!='.' && !hSet.add(board[x][y])) return false;//行-判断
				if(board[y][x]!='.' && !rSet.add(board[y][x])) return false;//竖-判断
				if(x%3==0 &&  y%3==0)
					if(!checkBlock(blockSet,board,x,y)) return false;//块-判断
			}
//			System.out.println();
		}
		
		return true;
	}

	private boolean checkBlock(Set<Character> blockSet, char[][] board, int x, int y) {
		blockSet.clear();
		for(int i=x; i<x+3; ++i) {
			for(int j=y; j<y+3; ++j) {
				if(board[i][j]!='.' && !blockSet.add(board[i][j]))
					return false;
			}
		}
		return true;
	}

}
