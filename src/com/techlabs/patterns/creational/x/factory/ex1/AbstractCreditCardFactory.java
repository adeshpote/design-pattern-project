package com.techlabs.patterns.creational.x.factory.ex1;

public abstract class AbstractCreditCardFactory {
	private CardType type;
	
	public static AbstractCreditCardFactory getCreditCardFactory(int creditScore){
		int minValue = 1000;
		if(creditScore > minValue){
			return new AmexCreditCardFactory();
		}else if(creditScore < minValue){
			return new VisaCreditCardFactory();
		}else return null;
		
	}
	
	public abstract AbstractCreditCard getCreditCard(CardType type);
	
	public abstract IValidator getValidator(CardType type);

	public CardType getType() {
		return type;
	}
}
