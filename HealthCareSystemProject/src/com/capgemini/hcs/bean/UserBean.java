package com.capgemini.hcs.bean;

public class UserBean {
		private String username;
	
		public String getUserName() {
			return username;
		}
		public void setUserName(String username) {
			this.username = username;
		}
		public UserBean(String username){
		this.username=username;
		
	}

}
