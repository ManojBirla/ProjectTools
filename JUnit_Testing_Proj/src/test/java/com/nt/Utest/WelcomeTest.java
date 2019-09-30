package com.nt.Utest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ni.junit.Welcome;

public class WelcomeTest {
	
	@Test
	public void getMessageTest() {
		Welcome wl=new Welcome();
		String actual=wl.getMessage();
		String expected="Welcome To java";
		assertEquals(expected, actual);
		
	}

}
