package com.nt.mockTest;

import static org.junit.Assert.assertNotNull;

import org.easymock.EasyMock;
import org.junit.Test;

import com.nt.mock.TempService;
import com.nt.mock.TempServiceImpl;
import com.nt.mock.TempratureStub;

public class TempratureMockTest {
	
	@Test
	public void invokeTempTest() {
		TempServiceImpl service=new TempServiceImpl();
		
		
		TempratureStub stub=EasyMock.createMock(TempratureStub.class);
		
		EasyMock.expect(stub.getTempFromSate(500038)).andReturn(42);
		EasyMock.expect(stub.getTempFromSate(500016)).andReturn(32);
        EasyMock.expect(stub.getTempFromSate(500098)).andReturn(37);
        //EasyMock.replay(stub);
        
        service.setStub(stub);
        //inject mock
        int temp=service.invokeTemp(500038);
        System.out.println(temp);
        assertNotNull(temp);

	}

}
