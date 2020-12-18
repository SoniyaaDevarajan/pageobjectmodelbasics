package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.CRM.Accounts.AccountsHomePage;

public class TopMenu {
	
	WebDriver driver;
	
	public TopMenu(WebDriver driver) {
		
		this.driver=driver;
	}

	public void goToHome() {

	}

	public void goToLeads() {

	}

	public void goToContacts() {

	}

	public AccountsHomePage goToAccounts() {
		
		Page.click("accountstab_CSS");
		
		return new AccountsHomePage();

	}

	public void signOut() {
		
		
	}


}
