package com.exeptions;

@SuppressWarnings("serial")
public class InvalidChoiceException extends Exception {

	public InvalidChoiceException(String msg) {
		super(msg);
	}
}
