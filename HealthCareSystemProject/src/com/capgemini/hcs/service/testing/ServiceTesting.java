package com.capgemini.hcs.service.testing;

import com.capgemini.hcs.bean.DiagnosticCenter;
import com.capgemini.hcs.bean.TestBean;
import com.capgemini.hcs.dao.DiagnosticTestDAOImpl;

public class ServiceTesting {
	
	DiagnosticTestDAOImpl dao1=new DiagnosticTestDAOImpl();
	
	public boolean validateCenterId(String cid) {
    	boolean f=false;
    	for(DiagnosticCenter a:dao1.centers){
    		if (a.getCenterId().equals(cid)){
    			f=true;
    			
    		}
    }
		return f ;
}
   
    
    public boolean validateTestId(String cid,String tId) {
    	boolean f=false;
    	for(DiagnosticCenter a:dao1.centers){
    		if (a.getCenterId().equals(cid)){
    			for(TestBean test:a.listOfTests){
    				if (test.testId.equals(tId)){
    					f=true;
    			
    		}
    				
    }
	break;	
  }}return f;
    	}

}
