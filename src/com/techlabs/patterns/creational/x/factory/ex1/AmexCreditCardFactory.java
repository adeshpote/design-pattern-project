package com.techlabs.patterns.creational.x.factory.ex1;

class AmexCreditCardFactory extends AbstractCreditCardFactory {

	@Override
	public AbstractCreditCard getCreditCard(CardType type) {
		if(type.equals(CardType.GOLD)){
			return new AmexGoldCreditCard();
		}else if(type.equals(CardType.PLATINUM)){
			return new AmexPlatinumCreditCard();
		}else return null;
	}

	@Override
	public IValidator getValidator(CardType type) {
		if(type.equals(CardType.GOLD)){
			return new AmexGoldValidator();
		}else if(type.equals(CardType.PLATINUM)){
			return new AmexPlatinumValidator();
		}else return null;
	}

}
