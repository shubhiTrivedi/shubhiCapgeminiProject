package com.capgemini.hcs.bean;
import java.util.ArrayList;
public class DiagnosticCenterBean {
	
	    static int cstart=1; 
	    private String centerId;
	    private String centerName;
	    
	    public String getCenterId() {
			return centerId;
		}
	    
		public String getCenterName() {
			return centerName;
		}

		public void setCenterName(String centerName) {
			this.centerName = centerName;
		}

		public  ArrayList<TestBean> listOfTests=new ArrayList<>(); //for storing the list of tests
		public DiagnosticCenterBean(String centerName)
	    {
	       listOfTests.add(new TestBean("Blood Group"));
	       listOfTests.add(new TestBean("Blood Sugar"));
	       listOfTests.add(new TestBean("Blood Pressure"));
	        this.centerName=centerName;
	        this.centerId=Integer.toString(cstart++);
	        
	    }

		
	}


