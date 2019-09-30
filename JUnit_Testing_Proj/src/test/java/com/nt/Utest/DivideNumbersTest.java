package com.nt.Utest;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.ni.junit.DivideNumbers;

public class DivideNumbersTest {
    
	DivideNumbers num=null;
	
	@BeforeClass
	public void testObj() {
		num=new DivideNumbers();
	}
	
	
	@Test()
	public void checkExTestWithPositive() {
		int actual=num.checkExce(10,2);
		int expected=5;
		assertEquals(expected, actual);
	}
	
	@Test(expected = ArithmeticException.class)
	public void checkExTestWithNegetive() {
		int actual=num.checkExce(10,0);
		
		
	}
	
	
	public void afterCl() {
		num=null;
	}

}
