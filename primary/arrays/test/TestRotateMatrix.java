package primary.arrays.test;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

import primary.arrays.RotateMatrix;

class TestRotateMatrix {

	RotateMatrix rm = new RotateMatrix();
	int[][] matrix1= {{1,2,3},
				{4,5,6},
				{7,8,9}};

	int[][] check1 = { { 7, 4, 1 }, 
			{ 8, 5, 2 },
			{ 9, 6, 3 } };

	int[][] matrix2 = { 
			{ 5, 1, 9, 11 }, 
			{ 2, 4, 8, 10 }, 
			{ 13, 3, 6, 7 }, 
			{ 15, 14, 12, 16 } };

	int[][] check2 = { 
			{ 15, 13, 2, 5 }, 
			{ 14, 3, 4, 1 }, 
			{ 12, 6, 8, 9 }, 
			{ 16, 7, 10, 11 } };
	
	@Test
	public void testRotate() {
		Assert.assertArrayEquals(check1,rm.rotate(matrix1));
		Assert.assertArrayEquals(check2, rm.rotate(matrix2));
	}
	
	@Test
	public void testRotate2() {
		Assert.assertArrayEquals(check1,rm.rotate2(matrix1));
		Assert.assertArrayEquals(check2, rm.rotate2(matrix2));
	}
	
	@Test
	public void testRotate3() {
		Assert.assertArrayEquals(check1,rm.rotate3(check1));
		Assert.assertArrayEquals(check2, rm.rotate3(check2));
	}
}

