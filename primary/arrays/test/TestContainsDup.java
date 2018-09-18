package primary.arrays.test;

import org.junit.Test;

import junit.framework.TestCase;
import primary.arrays.ContainsDuplicate;

public class TestContainsDup {

	ContainsDuplicate cd = new ContainsDuplicate();
	@Test
	public void testcContainsDuplicate1() {
		TestCase.assertEquals(false, cd.containsDuplicate1(new int[] {1,2,3,4}));
		TestCase.assertEquals(true, cd.containsDuplicate1(new int[] {1,2,3,1}));
	}
	
	@Test
	public void testcContainsDuplicate2() {
		TestCase.assertEquals(false, cd.containsDuplicate2(new int[] {1,2,3,4}));
		TestCase.assertEquals(true, cd.containsDuplicate2(new int[] {1,2,3,1}));
	}
	
	@Test
	public void testcContainsDuplicate3() {
		TestCase.assertEquals(false, cd.containsDuplicate3(new int[] {1,2,3,4}));
		TestCase.assertEquals(true, cd.containsDuplicate3(new int[] {1,2,3,1}));
	}

	@Test
	public void testcContainsDuplicate4() {
		TestCase.assertEquals(false, cd.containsDuplicate4(new int[] {1,2,3,4}));
		TestCase.assertEquals(true, cd.containsDuplicate4(new int[] {1,2,3,1}));
	}
	
	@Test
	public void testcContainsDuplicate5() {
		TestCase.assertEquals(false, cd.containsDuplicate5(new int[] {1,2,3,4}));
		TestCase.assertEquals(true, cd.containsDuplicate5(new int[] {1,2,3,1}));
	}
}
