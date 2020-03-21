package com.capgemini.hcs.bean;

import java.time.LocalDateTime;

public class Appointment {
	User user;
	private int appId;
	private TestBean test;
	LocalDateTime dateTime;
	boolean approved;
	
	public TestBean getTest() {
		return test;
	}
	public void setTestName(TestBean test) {
		this.test = test;
	}
	public boolean isApproved() {
		return approved;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public LocalDateTime getDate() {
		return dateTime;
	}
	public void setDate(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public void setTest(TestBean test) {
		this.test = test;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	public int getAppId() {
		return appId;
	}
	public void setAppId(int appId) {
		this.appId = appId;
	}
	
	public Appointment(User user, int appId,TestBean test, LocalDateTime dateTime,boolean approved ){
		this.user=user;
		this.test=test;
		this.approved=approved;
		this.dateTime=dateTime;	
		this.appId=appId;
	}
}	
	
	