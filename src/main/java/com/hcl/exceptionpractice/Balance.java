package com.hcl.exceptionpractice;

import java.util.Scanner;

public class Balance {
	private Double total
	this.total = 0;
			


public void deposit(double amount) {
	this.total += amount;
}

public void withdraw(double amount) throws InsufficientException {
	if(this.total < amount) {
		throw new InsufficientException("Insufficient Amount");
	}
	this.total -= amount;
}
	

public void withdraw(String[] args) {
	Scanner w = new scanner (System.in);
	double b = new Balance();
	System.out.println("Enter amount to withdrawal");
	double w = w.nextDouble();
	try {
		if (total < w) {
			throw InsufficientException
			} else {
				System.out.println(w)
				}
		
	} catch(InsufficientException e) {
		System.out.println("Insufficient Amount: " + e); }
	}

}
