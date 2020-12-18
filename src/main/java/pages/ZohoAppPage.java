package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Page;
import pages.CRM.CRMHomePage;

public class ZohoAppPage extends Page{

	public void goToChat() {
		
		click("chatlink_CSS");

	}

	public CRMHomePage goToCRM() {
		
		click("CRMlink_CSS");
		
		return new CRMHomePage();

	}

}
