package primary.test_arrays;

import org.junit.Test;

import junit.framework.TestCase;
import primary.arrays.SingleNumber;

public class TestSingleNumber {

	SingleNumber sn = new SingleNumber();
	int[] arr_1 = new int[] {2,2,1};
	int[] arr_2 = new int[] {4,1,2,1,2};
	
	@Test
	public void testSingleNumber1() {
		TestCase.assertEquals(1, sn.singleNumber1(arr_1));
		TestCase.assertEquals(4, sn.singleNumber1(arr_2));
	}
	
	@Test
	public void testSingleNumber2() {
		TestCase.assertEquals(1, sn.singleNumber2(arr_1));
		TestCase.assertEquals(4, sn.singleNumber2(arr_2));
	}
	
	@Test
	public void testSingleNumber3() {
		TestCase.assertEquals(1, sn.singleNumber3(arr_1));
		TestCase.assertEquals(4, sn.singleNumber3(arr_2));
	}
	
	@Test
	public void testSingleNumber4() {
		TestCase.assertEquals(1, sn.singleNumber4(arr_1));
		TestCase.assertEquals(4, sn.singleNumber4(arr_2));
		TestCase.assertEquals(0, sn.singleNumber4(new int[] {1,0,1}));
	}

}
