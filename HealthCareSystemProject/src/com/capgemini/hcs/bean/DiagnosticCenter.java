package com.capgemini.hcs.bean;
import java.util.ArrayList;


public class DiagnosticCenter {
	
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
		//public ArrayList<Appointment> appointmentList=new ArrayList<>();//for displaying appointment list
	    
	    
	    public DiagnosticCenter(String centerName)
	    {
	       listOfTests.add(new TestBean("Blood Group"));
	       listOfTests.add(new TestBean("Blood Sugar"));
	       listOfTests.add(new TestBean("Blood Pressure"));
	        
	       //appointmentList.add(new Appointment(new User("User A"),1,new TestBean("Test Id 0"),LocalDateTime.of(2020,03,12,10,00,00),true));
	       //appointmentList.add(new Appointment(new User("User B"),2,new TestBean("Test Id 2"),LocalDateTime.of(2020,04,23,10,30,00),true));
	        
	        this.centerName=centerName;
	        this.centerId=Integer.toString(cstart++);
	        
	    }

		
	}


