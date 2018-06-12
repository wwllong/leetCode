package primary.test_arrays;

import static org.junit.Assert.*;

import org.junit.*;

import static primary.arrays.Rotate.*;

public class TestRotate {

	@Test
	public void testRotate() {
		assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7 }, rotate4(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 0));
		assertArrayEquals(new int[] { 7, 1, 2, 3, 4, 5, 6 }, rotate4(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 1));
		assertArrayEquals(new int[] { 6, 7, 1, 2, 3, 4, 5 }, rotate4(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 2));
		assertArrayEquals(new int[] { 5, 6, 7, 1, 2, 3, 4 }, rotate4(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 3));
		assertArrayEquals(new int[] { 4, 5, 6, 7, 1, 2, 3 }, rotate4(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 4));
		assertArrayEquals(new int[] { 3, 4, 5, 6, 7, 1, 2 }, rotate4(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 5));
		assertArrayEquals(new int[] { 2, 3, 4, 5, 6, 7, 1 }, rotate4(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 6));
		assertArrayEquals(new int[] { 2, 3, 4, 5, 6, 7, 1 }, rotate4(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 6));
		
		assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6 }, rotate4(new int[] { 1, 2, 3, 4, 5, 6 }, 0));
		assertArrayEquals(new int[] { 6, 1, 2, 3, 4, 5 }, rotate4(new int[] { 1, 2, 3, 4, 5, 6 }, 1));
		assertArrayEquals(new int[] { 5, 6, 1, 2, 3, 4 }, rotate4(new int[] { 1, 2, 3, 4, 5, 6 }, 2));
		assertArrayEquals(new int[] { 4, 5, 6, 1, 2, 3 }, rotate4(new int[] { 1, 2, 3, 4, 5, 6 }, 3));
		assertArrayEquals(new int[] { 3, 4, 5, 6, 1, 2 }, rotate4(new int[] { 1, 2, 3, 4, 5, 6 }, 4));
		assertArrayEquals(new int[] { 2, 3, 4, 5, 6, 1 }, rotate4(new int[] { 1, 2, 3, 4, 5, 6 }, 5));
	}
	
}
