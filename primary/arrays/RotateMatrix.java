package primary.arrays;

import java.util.Arrays;

/**
 * @author Wwl
 * 给定一个 n × n 的二维矩阵表示一个图像。
 * 将图像顺时针旋转 90 度。
 * 说明：
 * 你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
 * 例，给定 matrix = [
 *  [1,2,3],
 *  [4,5,6],
 *  [7,8,9]
 *  ],原地旋转输入矩阵，使其变为:[
 *  [7,4,1],
 *  [8,5,2],
 *  [9,6,3]
 *  ]
 *  
 *  分析：操作数组，90度旋转问题
 */
public class RotateMatrix {
	
	/*对于当前位置，计算旋转后的新位置，计算下一个新的位置，直到新位置为起始位置
	* 2ms
	*/
	public int[][] rotate(int[][] matrix) {
		int l = matrix.length;
		for (int i = 0; i<l/2 ; ++i) { //控制循环的次数
			for (int j = i; j < l - 1 - i; ++j) {//每次循环换四个值
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[l - 1 - j][i]; //当前位置旋转后的值
                matrix[l - 1 - j][i] = matrix[l - 1 - i][l - 1 - j]; //下一个旋转位置的值
                matrix[l - 1 - i][l - 1 - j] = matrix[j][l - 1 - i];
                matrix[j][l - 1 - i] = tmp;
			}
		}
		return matrix;
	}
	
	/* 先以对角线为轴翻转，再以x轴为中线上下翻转得到结果
	 * 3ms
	 * */
	public int[][] rotate2(int[][] matrix){
		int l = matrix.length;
		for (int i = 0; i < l-1; ++i) {
			for (int j = 0; j < l-i; ++j) {
				swap(matrix,i,j,l-1-j,l-1-i);
			}
		}
		for (int i = 0; i < l/2; ++i) {
			for (int j = 0; j < l; ++j) {
				swap(matrix,i,j,l-1-i,j);
			}
		}
		return matrix;
	}

	private void swap(int[][] matrix, int i, int j, int k, int l) {
		int temp = matrix[i][j];
		matrix[i][j] = matrix[k][l];
		matrix[k][l] = temp;
	}
	
	/* 转置矩阵，每行数字翻转得到结果
	 * 2ms
	 * */
	public int[][] rotate3(int[][] matrix){
		int l = matrix.length;
		for(int i=0; i<l; ++i) {
			for(int j=i+1; j<l; ++j) {
				swap(matrix,i,j,j,i);
			}
		}
		reverse(matrix);
		return matrix;
	}

	public void reverse(int[][] matrix) {
		for(int j=0; j<matrix.length/2; ++j) {
			for(int x=0; x<matrix.length; ++x) {
				swap(matrix,x,j,x,matrix.length-1-j);
			}
		}
	}
}
