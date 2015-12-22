package com.techlabs.patterns.creational.factory.ex1.test;

import com.techlabs.patterns.creational.factory.ex1.AbstractPage;
import com.techlabs.patterns.creational.factory.ex1.SiteType;
import com.techlabs.patterns.creational.factory.ex1.AbstractWebSite;
import com.techlabs.patterns.creational.factory.ex1.WebSiteFactory;

public class TestWebSite {

	public static void main(String[] args) {
		AbstractWebSite mySite = WebSiteFactory.makeWebSite(SiteType.BLOG);
		System.out.println("===In the BLOGGING SITE===");
		print(mySite);
		
		AbstractWebSite shopSite = WebSiteFactory.makeWebSite(SiteType.SHOP);
		System.out.println("\n===In the SHOPPING SITE===");
		print(shopSite);
	}

	private static void print(AbstractWebSite site) {
		for(AbstractPage page:site.getPages()){
			page.load();
		}
	}

}
