package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class RunCreateLead extends ProjectSpecificMethods{
	
     @Test
     public void runCreateLead() throws InterruptedException {
    	 
    	 LoginPage lp = new LoginPage(driver);
    	 lp.enterUsername()
    	 .enterPassword()
    	 .clickLoginButton()
    	 .verifyHomePage()
    	 .clickCRMSFALink()
    	 .clickLeadsLink()
    	 .clickCreateLeadLink()
    	 .enterCompanyName()
    	 .enterFirstName()
    	 .enterLastName()
    	 .clickSubmitButton()
    	 .verifyViewLead();
		

	}
}
