package com.capgemini.hcs.exception;
//User defined exception class
public class TestNameException extends Exception {
		public TestNameException() {
			
			System.out.println("Test name should not be null and must start with capital letter, So enter the name correctly.");
		}
	}


