package pages;

import base.Page;

public class LoginPage extends Page{
	
	public ZohoAppPage doLogin(String username, String password) {
		
		type("email_CSS",username);		
		click("nextbtn_CSS");
		type("password_CSS",password);
		click("signinbtn_CSS");
		
		return new ZohoAppPage();
		
	}

}
