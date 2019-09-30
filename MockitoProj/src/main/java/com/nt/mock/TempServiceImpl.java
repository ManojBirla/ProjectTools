package com.nt.mock;

public class TempServiceImpl implements TempService{

	
	private TempratureStub stub;
	
	public void setStub(TempratureStub stub) {
		this.stub = stub;
	}


	public int invokeTemp(int zip) {
		int result=stub.getTempFromSate(zip);
		return  result;
	}//method
}//class
