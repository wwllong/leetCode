package primary.arrays.test;

import org.junit.Assert;
import org.junit.Test;

import primary.arrays.PlusOne;

public class TestPlusOne {
	PlusOne po = new PlusOne();
	int[] arr1 = {1,2,3};
	int[] arr2 = {4,3,2,1};
	int[] arr3 = {0};
	int[] arr4 = {9};
	int[] arr5 = {9,9};
	int[] arr6 = {1,0,9};
	int[] arr7 = {1,1,9};
	@Test
	public void test1(){
		Assert.assertArrayEquals(new int[] {1,2,4}, po.plusOne(arr1));
		Assert.assertArrayEquals(new int[] {4,3,2,2}, po.plusOne(arr2));
		Assert.assertArrayEquals(new int[] {1}, po.plusOne(arr3));
		Assert.assertArrayEquals(new int[] {1,0}, po.plusOne(arr4));
		Assert.assertArrayEquals(new int[] {1,0,0}, po.plusOne(arr5));
		Assert.assertArrayEquals(new int[] {1,1,0}, po.plusOne(arr6));
		Assert.assertArrayEquals(new int[] {1,2,0}, po.plusOne(arr7));
	}
	
}
