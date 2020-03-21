package com.capgemini.hcs.bean;

public class TestBean {
	 static int tstart=1;
	    private String testName;
	    public String testId="";
	    public TestBean(String testName) {
	    	this.testId=Integer.toString(tstart++);
	    	this.testName=testName;
	    }
		public String getTestName() {
			return testName;
		}
		public void setTestName(String testName) {
			this.testName = testName;
		}
		
		
	   
}
