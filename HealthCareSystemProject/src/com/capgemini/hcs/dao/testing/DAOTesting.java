package com.capgemini.hcs.dao.testing;

import com.capgemini.hcs.bean.DiagnosticCenterBean;

import com.capgemini.hcs.bean.TestBean;
import com.capgemini.hcs.dao.DiagnosticTestDAOImpl;

public class DAOTesting {
	
	DiagnosticTestDAOImpl diagnosticTestDAOImpl=new DiagnosticTestDAOImpl();
	//Testing Method1
    public boolean validTestName(String testName) {
    	boolean flag=false;
    	if((testName.charAt(0)>=65 && testName.charAt(0)<=90)) {
    		flag=true;
    	}
		return flag;
    	
    }
    
    //Testing Method2
    public boolean validTestLength(String testNames) {
    	boolean flag=false;
    	if((testNames.length()>0 && testNames.length()<=20)) {
    		flag=true;
    	}
		return flag;
    	
    }
    public boolean validTestName1(String tname) {
    	boolean flag=false;
    	if(((tname.charAt(0)>=65 && tname.charAt(0)<=90)||(tname.charAt(0)>=97 && tname.charAt(0)<=122))) {
    		flag=true;
    	}
		return flag;
    	
    }
    public boolean validCenterId(String cid) {
    	boolean f=false;
    	for(DiagnosticCenterBean a:diagnosticTestDAOImpl.getCenters()){
    		if (a.getCenterId().equals(cid)){
    			f=true;
    			
    		}
    }
		return f ;
}
   
    
    public boolean validTestId(String cid,String tId) {
    	boolean f=false;
    	for(DiagnosticCenterBean a:diagnosticTestDAOImpl.getCenters()){
    		if (a.getCenterId().equals(cid)){
    			for(TestBean test:a.listOfTests){
    				if (test.testId.equals(tId)){
    					f=true;
    			
    		}
    				
    }
	break;	
  }

}return f;
    	
}}