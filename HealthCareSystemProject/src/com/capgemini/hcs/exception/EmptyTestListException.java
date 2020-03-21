package com.capgemini.hcs.exception;
//User defined exception class
public class EmptyTestListException extends Exception {
	public EmptyTestListException() {
		
		System.out.println("Test list is empty for the selected center id.There is no test present at this center.");
	}
}
