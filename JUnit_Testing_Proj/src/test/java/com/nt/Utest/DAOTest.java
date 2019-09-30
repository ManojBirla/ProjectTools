package com.nt.Utest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ni.junit.DAO;

public class DAOTest{
	
	static DAO dao=null;
	@BeforeClass
	public static void getObjBeforeClass() {
		dao=new DAO();
	}
	@Test
	public void getEmailByIdValidTest() {
		String actual=dao.getEmailByID(1080);
		String expected="jai@gmail.com";
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void getEmailByIdInValidTest() {
		
		String actual=dao.getEmailByID(10);
	    assertNull(actual);
		
	}
	
	
	@AfterClass
	public static void getObjAfterClass() {
		dao=null;
	}
	
}
