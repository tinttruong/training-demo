package com.hcl.exceptionpractice;

import java.util.Scanner;

public class InsufficientException extends Exception {
	
	String msg;
	
	public InsufficientException(String msg
	this.msg = msg;
}
	public String toString() {
		return msg;
	}
	
	
	

}
