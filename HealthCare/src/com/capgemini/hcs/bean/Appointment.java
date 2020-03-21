package com.capgemini.hcs.bean;

public class Appointment {
	private User user;
	private long appointmentId;
	private DiagnosticTestBean test;
	private boolean approved;
    private String centerId;
	
	
	// Constructor
	public Appointment(User user, long appointmentId, DiagnosticTestBean test, boolean approved,String centerId) {
		super();
		this.user = user;
		this.appointmentId = appointmentId;
		this.test = test;
		this.approved = approved;
		this.centerId=centerId;
	}
	//No ArgumentConstructor
	public Appointment() {
	super();
    }
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public long getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(long appointmentId) {
		this.appointmentId = appointmentId;
	}

	public DiagnosticTestBean getTest() {
		return test;
	}

	public void setTest(DiagnosticTestBean test) {
		this.test = test;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	public String getCenterId() {
		return centerId;
	}
	public void setCenterId(String centerId) {
		this.centerId = centerId;
	}
	@Override
	public String toString() {
		return "Appointment [user=" + user + ", appointmentId=" + appointmentId + ", test=" + test + ", approved="
				+ approved + "]";
	}

}
