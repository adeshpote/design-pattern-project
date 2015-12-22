package com.techlabs.patterns.creational.factory.ex1;

class ItemSearch extends AbstractPage{

	public ItemSearch(String description) {
		super(description);
	}

	@Override
	public void load() {
		System.out.println(getDescription()+" is Loading");
	}

}
