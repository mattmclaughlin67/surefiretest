package sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class sampleTest {

	@Test
	public void testFail() {
		assertNotNull(3);
	}
	
	@Test
	public void testPass() {
		int x = 2;
		assertEquals(2, x);
	}
	
	@Test
	public void testError() {
		int[] x = {1, 2, 3};
		assertEquals(3, x[2]);
	}

}
