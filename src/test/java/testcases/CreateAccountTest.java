package testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Page;
import pages.ZohoAppPage;
import pages.CRM.Accounts.AccountsHomePage;
import pages.CRM.Accounts.CreateAccountPage;
import utilities.Utilities;

public class CreateAccountTest {

	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void createAccountTest(Hashtable<String, String> data) {

		ZohoAppPage app = new ZohoAppPage();
		app.goToCRM();
		AccountsHomePage account = Page.menu.goToAccounts();
		CreateAccountPage cap = account.goToCreateAccount();
		cap.createAccount(data.get("accountname"));
		
		Assert.fail("Create Account Test failed");

	}

}
