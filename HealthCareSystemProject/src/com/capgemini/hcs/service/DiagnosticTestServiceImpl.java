package com.capgemini.hcs.service;
import com.capgemini.hcs.dao.DiagnosticTestDAOImpl;
public class DiagnosticTestServiceImpl implements IDiagnosticTestService {
	
	
	private static DiagnosticTestDAOImpl diagnosticTestDAOImpl=new DiagnosticTestDAOImpl();;
	
	//Method for adding the test at a particular center
	@Override
	public String addTest(String id){
	    	String result=diagnosticTestDAOImpl.addTest(id);
	    	return result;
 }
	    
	//Method for removing a test from a particular center
	@Override
	    public boolean removeTest(String cid,String tid){
	    	boolean res=diagnosticTestDAOImpl.removeTest(cid,tid);
	    	return res;
	    	}
	    	
	      
}
