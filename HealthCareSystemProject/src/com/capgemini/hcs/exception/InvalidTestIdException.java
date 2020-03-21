package com.capgemini.hcs.exception;
//User defined exception class
public class InvalidTestIdException extends Exception {
	public InvalidTestIdException() {
		
		System.out.println("Test Id is Invalid, Enter a valid Test Id");
	}
}