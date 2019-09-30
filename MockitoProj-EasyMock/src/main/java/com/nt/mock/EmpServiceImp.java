package com.nt.mock;

public class EmpServiceImp{

	
	private EmpDAO dao;
    public void setDao(EmpDAO dao) {
		this.dao = dao;
	}
	
	public String getEmailByIdService(int id) {
		String result=null;
		result=dao.getEmailById(id);
		
		return result;
	}
	
	public String getNameByIdService(int id) {
		String name=null;
		name=dao.getEmailById(id);
		
		return name;
	}
	
}//class
