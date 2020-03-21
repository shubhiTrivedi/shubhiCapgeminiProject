package com.capgemini.hcs.exception;

//User defined exception Class
public class InvalidCenterIdException extends Exception {
	public InvalidCenterIdException() {
		
		System.out.println("Center Id is not legal...Enter a valid Center Id");
	}
}