package com.nt.mockTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

import com.nt.mock.EmpDAO;
import com.nt.mock.EmpServiceImp;

import jdk.nashorn.internal.ir.annotations.Ignore;

@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames = "com.nt.mock")
public class ServiceTest {
	
	/**
	 * 
	 * employee service onj injected
	 */
	private static EmpServiceImp service;
	
	/**
	 * common logics executes
	 */
	@BeforeClass
	public static void beforeClass() {
		EmpDAO dao=PowerMockito.mock(EmpDAO.class);
		PowerMockito.when(dao.getEmailById(101)).thenReturn("john");
		PowerMockito.when(dao.getEmailById(102)).thenReturn("john@gmail.com");
		PowerMockito.when(dao.getNameById(103)).thenReturn("geeks");		
		//create service class object
		service=new EmpServiceImp();
		//inject dao obj to service
		service.setDao(dao);
	}
	/**
	 * test for emailby id
	 */
	@Test
	public void testgetEmailByIdService() {
      	//invoke method 
       assertNotNull(service.getEmailByIdService(102));

	}
	/**
	 * test is active private method
	 * @throws Exception
	 */
	@Test
	public void testisActive() throws Exception{
		boolean status=Whitebox.invokeMethod(service,"isActive",101);
		assertTrue(status);
		
	}
	/**
	 * private method false
	 * @throws Exception
	 */
	@Test
	public void testisActivefalse() throws Exception{
		boolean status=Whitebox.invokeMethod(service,"isActive",19);
		assertFalse(false);
		
	}
	
	/**
	 * this is the test method namr by id service
	 */
	@Test
	public void testgetNameByIdService() {
        assertNotNull(service.getNameByIdService(101));

	}
	/**
	 * test get name by id service by zero
	 */
	@Ignore
	public void testgetNameByIdServiceByZero() {
      	//invoke method 

        assertNotNull(service.getNameByIdService(103));

	}
	
	/**
	 * all common logics will be nullify
	 */
	@AfterClass
	public static void afterClass() {
		service=null;
	}

}
