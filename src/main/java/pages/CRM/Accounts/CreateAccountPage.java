package pages.CRM.Accounts;

import base.Page;

public class CreateAccountPage extends Page{
	
	public void createAccount(String accountName) {
		
		type("accountname_CSS",accountName);
		
	}

}
