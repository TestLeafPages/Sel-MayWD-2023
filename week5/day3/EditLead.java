package week5.day3;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EditLead extends BaseClass{

	@Test(dataProvider = "edit")
	public void runEditLead(String phone) throws InterruptedException {

		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phone);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("testleaf");
		driver.findElement(By.name("submitButton")).click();

	}
	
	// phone number, company Name
	
	@DataProvider(name="edit")
	public String[][] fetchData() throws IOException {
		
		
		String[][] data = new String[2][1];
		
		// first set
		data[0][0] = "99";
		
		
		
		// second set
		data[1][0] = "89";
		
		
		// third set
		data[2][0] = "78";
		
		
		return data;
		
		
		
	}
}
