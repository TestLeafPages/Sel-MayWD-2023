package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends BaseClass{
	
//	
//	@Given("Launch the browser")
//	public void launchBrowser() {
//		driver = new ChromeDriver();
//		System.out.println(driver);
//
//	}
//
//
//	@Given("Load the url")
//	public void loadUrl() {
//		driver.get("http://leaftaps.com/opentaps/control/main");
//	}
	
	
	@And("Enter the username as {string}")
	public void enterUsername(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);

	}

	@And("Enter the password as {string}")
	public void enterPassword(String pWord) {
		driver.findElement(By.id("password")).sendKeys(pWord);

	}

	@When("Click on Login Button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}

	@Then("HomePage should be displayed")
	public void verifyHomePage() {
		String title = driver.getTitle();
		if (title.contains("Leaftaps")) {
			System.out.println("Login Successfull");
		}else {
			System.out.println("Login not Successfull");
		}

	}

	@But("ErrorMessage should be displayed")
	public void verifyErrorMessage() {
		System.out.println("Error message is displayed");

	}

    






























}
