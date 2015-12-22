package com.techlabs.patterns.structural.decorator.ex11;

public abstract class AbstractSandwichDecorator implements ISandwich{
	protected ISandwich customSandwich;
	
	public AbstractSandwichDecorator(ISandwich sandwich){
		this.customSandwich = sandwich;
	}
}
