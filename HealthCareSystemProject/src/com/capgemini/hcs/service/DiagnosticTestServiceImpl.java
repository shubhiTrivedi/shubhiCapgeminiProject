package com.capgemini.hcs.service;
import com.capgemini.hcs.dao.DiagnosticTestDAOImpl;
public class DiagnosticTestServiceImpl implements IDiagnosticTestService {
	
	
	private static DiagnosticTestDAOImpl dao=new DiagnosticTestDAOImpl();;
	
	//Method for adding the test at a particular center
	@Override
	public  String addTest(){
	    	String result=dao.addTest();
	    	return result;
 }
	    
	//Method for removing a test from a particular center
	@Override
	    public boolean removeTest(){
	    	boolean res=dao.removeTest();
	    	return res;
	    	}
	    	
	      
}
