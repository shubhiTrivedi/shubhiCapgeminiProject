package com.capgemini.hcs.controller.testing;

public class ControllerTesting {
	
	
	
	public boolean validChoice(int v) {
		
    	boolean flag=false;
    	if(v==1 ||v==2) {
    		flag=true;
    	}
		return flag;
    	
    }
	
	public boolean validChoice1(int val) {
    	boolean flag=false;
    	if(val==1 ||val==2 ||val==3||val==4) {
    		flag=true;
    	}
		return flag;
    	
    }

}
