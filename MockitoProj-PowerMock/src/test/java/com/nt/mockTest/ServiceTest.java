package com.nt.mockTest;

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
	private static EmpServiceImp service;
	
	@BeforeClass
	public static void beforeClass() {
		EmpDAO dao=PowerMockito.mock(EmpDAO.class);
		PowerMockito.when(dao.getEmailById(101)).thenReturn("john");
		PowerMockito.when(dao.getEmailById(102)).thenReturn("john@gmail.com");
		
		//create service class object
		service=new EmpServiceImp();
		
		//inject dao obj to service
		service.setDao(dao);
	}
	@Test
	public void test_getEmailByIdService() {
      	//invoke method 
        String res=service.getEmailByIdService(102);
        System.out.println(res);
        assertNotNull(res);

	}
	
	@Test
	public void test_isActive() throws Exception{
		boolean status=Whitebox.invokeMethod(service,"isActive",101);
		assertTrue(status);
		
	}
	
	@Test
	public void test_getNameByIdService() {
      	//invoke method 
        String res=service.getEmailByIdService(101);
        System.out.println(res);
        assertNotNull(res);

	}
	
	@Ignore
	public void test_getNameByIdService_ByZero() {
      	//invoke method 
        String res=service.getNameByIdService(0);
        System.out.println(res);
        assertNotNull(res);

	}
	
	@AfterClass
	public static void afterClass() {
		service=null;
	}

}
