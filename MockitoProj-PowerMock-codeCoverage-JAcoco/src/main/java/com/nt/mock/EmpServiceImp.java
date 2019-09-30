package com.nt.mock;

/**
 * class for empolyee service implement
 * @author manoj
 *
 */
public class EmpServiceImp{

	/**
	 * empdao inject
	 */
	private EmpDAO dao;
	/**
	 * set dao method
	 * @param dao
	 */
    public void setDao(EmpDAO dao) {
		this.dao = dao;
	}
    
	/**
	 * getemailBYIDService
	 * @param id
	 * @return
	 */
	public String getEmailByIdService(int id) {
		
		
		return dao.getEmailById(id);
	}
	
	/**
	 * get name by id service
	 * @param id
	 * @return
	 */
	public String getNameByIdService(int id) {
		
		
		return dao.getEmailById(id);
	}
	
	/**
	 * is active
	 * @param id
	 * @return
	 */
	private boolean isActive(int id) {
		if(id>100) {
		  return true;
		}
		else{
			return false;
		}
	}
	
}//class
