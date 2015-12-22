package com.techlabs.patterns.creational.factory.ex1;

public abstract class AbstractPage {
	private String description;
	
	public AbstractPage(String description){
		this.description = description;
	}
	
	public String getDescription(){
		return description;
	}
	
	public abstract void load();
}
