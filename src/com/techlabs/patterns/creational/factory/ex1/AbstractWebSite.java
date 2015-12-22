package com.techlabs.patterns.creational.factory.ex1;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractWebSite {
	protected List<AbstractPage> list;
	
	public AbstractWebSite(){
		list = new ArrayList<AbstractPage>();
		createSitePages();
	}

	protected abstract void createSitePages();
	
	public List<AbstractPage> getPages(){
		return list;
	}
}
