package primary.test_arrays;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import primary.arrays.MoveZeroes;

class TestMoveZeroes {

	MoveZeroes mz = new MoveZeroes();
	int[] arr1 = {0,1,0,3,12};
	int[] arr2 = {0,1};
	int[] arr3 = {0,0,0,1,0,2};
	
	@Test
	void test1() {
		Assert.assertArrayEquals(new int[] {1,3,12,0,0}, mz.moveZeroes1(arr1));
		Assert.assertArrayEquals(new int[] {1,0}, mz.moveZeroes1(arr2));
		Assert.assertArrayEquals(new int[] {1,2,0,0,0,0}, mz.moveZeroes1(arr3));
	}
	
	@Test
	void test2() {
		Assert.assertArrayEquals(new int[] {1,3,12,0,0}, mz.moveZeroes2(arr1));
		Assert.assertArrayEquals(new int[] {1,0}, mz.moveZeroes2(arr2));
		Assert.assertArrayEquals(new int[] {1,2,0,0,0,0}, mz.moveZeroes2(arr3));
	}

}
