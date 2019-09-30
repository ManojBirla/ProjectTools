package com.ni.junit;

public class DAO {
	
	public String getEmailByID(int id) {
		
		if(id>100) {
			return "jai@gmail.com";
		}
		
		return null;
		
	}

}
