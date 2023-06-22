package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class VerifyLogin extends ProjectSpecificMethods{
	
	@Test
	public void runLogin() throws InterruptedException {
		System.out.println(driver);
       LoginPage lp = new LoginPage(driver);
       lp.enterUsername().enterPassword().clickLoginButton().verifyHomePage().clickCRMSFALink();
       
	}

}
