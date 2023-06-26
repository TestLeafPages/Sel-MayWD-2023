package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods{
	
	public MyLeadsPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public CreateLeadPage clickCreateLeadLink() {
		String createLeadLinText = prop.getProperty("MyLeadsPage_CreateLead_LinkText");
		driver.findElement(By.xpath(createLeadLinText)).click();
		return new CreateLeadPage(driver);

	}

}
