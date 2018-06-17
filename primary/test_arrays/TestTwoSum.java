package primary.test_arrays;

import static org.junit.Assert.*;

import org.junit.Test;

import primary.arrays.TwoSum;

public class TestTwoSum {

	int[] arr = new int[] {2,7,11,15};
	TwoSum ts = new TwoSum();
	
	@Test
	public void test1() {
		assertArrayEquals(new int[] {0,1}, ts.twoSum1(arr, 9));
	}

	@Test
	public void test2() {
		assertArrayEquals(new int[] {0,1}, ts.twoSum2(arr, 9));
	}
	
	@Test
	public void test3() {
		assertArrayEquals(new int[] {0,1}, ts.twoSum3(arr, 9));
	}
}
