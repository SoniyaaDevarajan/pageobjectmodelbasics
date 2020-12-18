package pages.CRM.Accounts;

import base.Page;

public class AccountsHomePage extends Page{
	
	public CreateAccountPage goToCreateAccount() {
		
		click("createaccountbtn_CSS");
		
		return new CreateAccountPage();
		
	}
	
	public void goToImportAccounts() {
		
	}

}
