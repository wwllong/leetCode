package com.wenwl.algorithm.test.medium;


import com.wenwl.algorithm.leetcode.medium.RotateMatrix;
import org.junit.Assert;
import org.junit.Test;

public class RotateMatrixTest {

	RotateMatrix rotateMatrix = new RotateMatrix();

	int[][] matrix1= {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
	};

	int[][] expected1 = { { 7, 4, 1 },
			{ 8, 5, 2 },
			{ 9, 6, 3 } };

	int[][] matrix2 = {
			{ 5, 1, 9, 11 },
			{ 2, 4, 8, 10 }, 
			{ 13, 3, 6, 7 }, 
			{ 15, 14, 12, 16 }
	};

	int[][] expected2 = {
			{ 15, 13, 2, 5 }, 
			{ 14, 3, 4, 1 }, 
			{ 12, 6, 8, 9 }, 
			{ 16, 7, 10, 11 }
	};

	@Test
	public void testRotate4() {
		rotateMatrix.rotate4(matrix1);
		Assert.assertArrayEquals(expected1, matrix1);
		rotateMatrix.rotate4(matrix2);
		Assert.assertArrayEquals(expected2, matrix2);
	}

	@Test
	public void testRotate3() {
		rotateMatrix.rotate3(matrix1);
		Assert.assertArrayEquals(expected1, matrix1);
		rotateMatrix.rotate3(matrix2);
		Assert.assertArrayEquals(expected2, matrix2);
	}

	@Test
	public void testRotate2() {
		rotateMatrix.rotate2(matrix1);
		Assert.assertArrayEquals(expected1, matrix1);
		rotateMatrix.rotate2(matrix2);
		Assert.assertArrayEquals(expected2, matrix2);
	}

	@Test
	public void testRotate1() {
		rotateMatrix.rotate1(matrix1);
		Assert.assertArrayEquals(expected1, matrix1);
		rotateMatrix.rotate1(matrix2);
		Assert.assertArrayEquals(expected2, matrix2);
	}

}

