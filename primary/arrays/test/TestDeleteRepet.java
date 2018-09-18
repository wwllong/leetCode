package primary.arrays.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import primary.arrays.DeleteRepet;

class TestDeleteRepet {

	@Test
	void test() {
		int[] arr = {0,0,1,1,1,2,2,3,3,4};
		int len = DeleteRepet.removeDuplicates(arr);
		int[] toArr = new int[len];
		System.arraycopy(arr, 0, toArr, 0, len);
		Assert.assertArrayEquals(new int[] {0,1,2,3,4},toArr);
	}

}
