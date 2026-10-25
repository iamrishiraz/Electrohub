package com.rishi.electrohub.exceptions;

public class BadApiRequestException extends RuntimeException{

	public BadApiRequestException() {
		super();
	}
	
	public BadApiRequestException(String message) {
		super(message);
	}
}
