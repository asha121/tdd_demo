package com.tdd.practices;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

public class NumberCheckerTest {
	
	@Test
	public void testIsPrefectNumber () {
	//fail("Not yet implemented");
	}
	
	
	@Test
	public void testSmallestPerfectNumber () {
		NumberChecker numcheck = new NumberChecker();
		
		Assert.assertEquals(true, numcheck.isPerfectNumber(6));
		//fail("Not yet implemented");
	}
	@Test
	public void testInvalidPerfectNumber () {
		NumberChecker numcheck = new NumberChecker();
		Assert.assertNotEquals(true, numcheck.isPerfectNumber(5));
		//fail("Not yet implemented");
	}
	@Test
	public void testTwentyEight () {
		NumberChecker numcheck = new NumberChecker();
		Assert.assertEquals(true, numcheck.isPerfectNumber(28));
		//fail("Not yet implemented");
	}
	@Test
	public void testPerfectNumber() {
		NumberChecker numcheck = new NumberChecker();
		boolean pass=false;
		for (int i = 28; i < 10000; i++) {
			pass=numcheck.isPerfectNumber(i);
			//Assert.assertEquals(true, numcheck.isPerfectNumber(28));
		}
		Assert.assertEquals(true, pass);
		//fail("Not yet implemented");
	}
	
	//Lower limit
	//Higher limt
	// valid number
	// invalid number
	//

}
