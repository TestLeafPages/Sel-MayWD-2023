package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadStepDefinition extends BaseClass{
	
	
    @When("Click on CRMSFA link")
	public void clickCRMSFALink() {
    	System.out.println(driver);
       driver.findElement(By.linkText("CRM/SFA")).click();

	}
    
    @And("Click on Leads link")
	public void clickLeadsLink() {
    	driver.findElement(By.linkText("Leads")).click();

	}
    
    @And("Click on CreateLead link")
	public void clickCreateLeadLink() {
    	driver.findElement(By.linkText("Create Lead")).click();

	}
    
    @Given("Enter Companyname as (.*)$")
	public void enterCompanyName(String cName) {
    	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);

	}
    
    @And("Enter Firstname as (.*)$")
	public void enterFirstName(String fName) {
    	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);

	}
    
    @And("Enter Lastname as (.*)$")
	public void enterLastName(String lName) {

    	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	}
    
    @When("Click on Submit Button")
	public void clickSubmitButton() {

    	driver.findElement(By.name("submitButton")).click();
	}
    
    @Then("ViewLeads page should be displayed as (.*)$")
	public void verifyViewLeadsPage(String cName) {
    	String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
    	if (text.contains(cName)) {
    		System.out.println("Lead created successfully");
    	}
    	else {
    		System.out.println("Lead is not created");
    	}

	}































}
