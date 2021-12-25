package com.wenwl.algorithm.leetcode.medium;

/**
 * @author wenwl
 * @see <a href="https://leetcode-cn.com/problems/rotate-image/">Q48-旋转图像</a>
 */
public class RotateMatrix {

	/**
	 * m4(0ms,21tc): 对矩阵进行转置（行变成列，以（斜左）对角线为轴翻转），再以y轴为轴翻转得到结果
	 * Tn = O(N^2)，Sn = O(1)
	 */
	public void rotate4(int[][] matrix){
		int n = matrix.length;
		// 转置，（左）斜对角线翻转
		for(int i = 0; i < n; ++i) {
			for(int j = i + 1; j < n; ++j) {
				swap(matrix, i, j, j, i);
			}
		}
		// y轴翻转
		for(int i = 0; i < n; ++i) {
			for(int j = 0; j < n / 2; ++j) {
				swap(matrix, i, j, i, n - j - 1);
			}
		}
	}

	/**
	 * m3(0ms,21tc): 先以（斜右）对角线为轴翻转，再以x轴为轴翻转得到结果
	 * Tn = O(N^2)，Sn = O(1)
	 */
	public void rotate3(int[][] matrix){
		int n = matrix.length;
		// （右）斜对角线翻转
		for (int i = 0; i < n - 1; ++i) {
			for (int j = 0; j < n - i; ++j) {
				swap(matrix, i, j, n - j - 1, n - i - 1);
			}
		}
		// x轴翻转
		for (int i = 0; i < n / 2; ++i) {
			for (int j = 0; j < n; ++j) {
				swap(matrix, i, j, n -i -1, j);
			}
		}
	}

	/**
	 * m1(0ms,21tc): 基于m1的方法，原地旋转，具体解析过程可参考官方。
	 * - 关键公式：newMatrix[j][n - i - 1] = matrix[i][j]，利用从重复带入公式，可发现"四项循环"
	 * - 确定枚举的位置，根据奇数个偶数得到规律
	 * Tn = O(N^2)，Sn = O(1)
	 */
	public void rotate2(int[][] matrix) {
		int n = matrix.length;
		for (int i = 0; i < n / 2 ; ++i) {
			for (int j = 0; j < (n + 1) / 2; ++j) {
				// 四项循环
				int temp = matrix[i][j];
				matrix[i][j] = matrix[n - j - 1][i];
				matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
				matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
				matrix[j][n - i - 1] = temp;
			}
		}
	}

	/**
	 * m1(0ms,21tc): 找规律，辅助数组实现。
	 * 第 i 行旋转后为 倒数第 i 列，原先每行第 x 个元素，恰好是倒数第 n 列的第 x 个元素.
	 * 即，对于矩阵中第 i 行的第 j 个元素，在旋转后，它出现在倒数第 i 列的第 j 个位置。
	 * 表达式为：matrix[i][j] -> matrix[j][n - i - 1] (n为矩阵长度）
	 * Tn = O(N^2)，Sn = O(N^2)
	 */
	public void rotate1(int[][] matrix) {
		int n = matrix.length;
		int[][] newMatrix = new int[n][n];
		// 临时存储旋转结果
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				newMatrix[j][n - i - 1] = matrix[i][j];
			}
		}
		// 复制旋转结果
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				matrix[i][j] = newMatrix[i][j];
			}
		}
	}

	private void swap(int[][] matrix, int i, int j, int x, int y) {
		int temp = matrix[i][j];
		matrix[i][j] = matrix[x][y];
		matrix[x][y] = temp;
	}

}
