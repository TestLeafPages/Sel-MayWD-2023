package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
	}

	public LoginPage enterUsername() throws InterruptedException {
		System.out.println(driver);
		//Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
//		LoginPage lp= new LoginPage();
//		return lp;
		return this;
	}

	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;

	}
	public WelcomePage clickLoginButton() {

		driver.findElement(By.className("decorativeSubmit")).click();
//		WelcomePage wp = new WelcomePage();
//		return wp;
		
		return new WelcomePage(driver);
		
	}

}
