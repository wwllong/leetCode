package primary.string.test;


import org.junit.Test;

import junit.framework.TestCase;
import primary.string.ReverseNumb;

public class TestReverseNumb {
	ReverseNumb rn = new ReverseNumb() ;
	int t1 = 123;
	int c1 = 321;
	
	int t2 = -123;
	int c2 = -321;
	
	int t3 = -120;
	int c3 = -21;
	
	
	@Test
	public void testReverse() {
		TestCase.assertEquals(c1, rn.reverse(t1));
		TestCase.assertEquals(c2, rn.reverse(t2));
		TestCase.assertEquals(c3, rn.reverse(t3));
		TestCase.assertEquals(0, rn.reverse(1534236469));//�����ݻ��÷���һ����
	}
	
	@Test
	public void testReverse2() {
		TestCase.assertEquals(c1, rn.reverse2(t1));
		TestCase.assertEquals(c2, rn.reverse2(t2));
		TestCase.assertEquals(c3, rn.reverse2(t3));
		TestCase.assertEquals(0, rn.reverse2(0));
	}
	
	@Test
	public void testReverse3() {
		TestCase.assertEquals(c1, rn.reverse3(t1));
		TestCase.assertEquals(c2, rn.reverse3(t2));
		TestCase.assertEquals(c3, rn.reverse3(t3));
		TestCase.assertEquals(0, rn.reverse2(0));
	}
	
	

}
