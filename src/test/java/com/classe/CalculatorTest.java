package com.classe;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase  {
	
	Calculator cal;
	@Before
	public void setUp() throws Exception {
		cal = new Calculator();
	}

	@Test
	public void testSum() {
		Assert.assertEquals(4, cal.sum(2, 2));
	}
	
	@Test
	public void testMinus() {
		Assert.assertEquals(0, cal.minus(2, 2));
	}
	
	@Test
	public void testDivide() {
		Assert.assertEquals(2, cal.divide(6, 3));
	}

	@Test
	public void testMultiply(){
		Assert.assertEquals(12, cal.multiply(3,4));
	}

	
	

}
