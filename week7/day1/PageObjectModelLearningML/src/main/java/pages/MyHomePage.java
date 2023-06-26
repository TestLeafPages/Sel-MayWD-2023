package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{
	
	public MyHomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	public MyLeadsPage clickLeadsLink() {
		String leadsValue = prop.getProperty("MyHomePage_Leads_LinkText");
		driver.findElement(By.linkText(leadsValue)).click();
		return new MyLeadsPage(driver);

	}

}
