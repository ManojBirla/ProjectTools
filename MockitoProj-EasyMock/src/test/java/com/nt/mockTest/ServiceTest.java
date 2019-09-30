package com.nt.mockTest;

import static org.junit.Assert.assertNotNull;
import org.easymock.EasyMock;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;import com.nt.mock.EmpDAO;
import com.nt.mock.EmpServiceImp;

public class ServiceTest {
	private static EmpServiceImp service;
	
	@BeforeClass
	public static void beforeClass() {
		EmpDAO dao=EasyMock.createMock(EmpDAO.class);
		
		EasyMock.expect(dao.getEmailById(101)).andReturn("john@gmail.com");
		EasyMock.expect(dao.getEmailById(102)).andReturn("scott@gmail.com");
		EasyMock.expect(dao.getEmailById(103)).andReturn("smith");
		EasyMock.expect(dao.getEmailById(0)).andReturn(null);
		EasyMock.replay(dao);
		
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
	public void test_getNameByIdService() {
      	//invoke method 
        String res=service.getNameByIdService(103);
        System.out.println(res);
        assertNotNull(res);

	}
	
	@Test
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
