package rough;


import base.Page;
import pages.HomePage;
import pages.LoginPage;
import pages.ZohoAppPage;
import pages.CRM.Accounts.AccountsHomePage;
import pages.CRM.Accounts.CreateAccountPage;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		HomePage home = new HomePage();
		LoginPage login = home.goToLogin();
		
		ZohoAppPage app = login.doLogin("soniyaa0501@yahoo.com", "S0niy@@0501");		
		app.goToCRM();
		
		AccountsHomePage account = Page.menu.goToAccounts();		
		CreateAccountPage cap = account.goToCreateAccount();		
		
		cap.createAccount("Soniyaa");
		
		
		
		
		
		

	}

}
