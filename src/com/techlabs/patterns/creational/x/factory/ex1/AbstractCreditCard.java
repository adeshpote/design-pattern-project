package com.techlabs.patterns.creational.x.factory.ex1;

public abstract class AbstractCreditCard {
	protected int cardLength;
	protected int cvvNumber;
	
	public void setCardLength(int cardLength) {
		this.cardLength = cardLength;
	}
	
	public void setCvvNumber(int cvvNumber) {
		this.cvvNumber = cvvNumber;
	}
	
	
}
