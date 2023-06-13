package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{

	
	@DataProvider(name="getData")
	public String[][] fetchdata(){
		
		String[][] data= new String[3][4];
		
		data[0][0]="TestLeaf";//companyname
		data[0][1]="Dilip";//fristname
		data[0][2]="kumar";//lastname
		data[0][3]="9878645609";//phone
		
		
		data[1][0]="TestLeaf";//companyname
		data[1][1]="Ragu";//fristname
		data[1][2]="G";//lastname
		data[1][3]="897435656";//phone
		
		
		data[2][0]="TestLeaf";//companyname
		data[2][1]="Ranjini";//fristname
		data[2][2]="R";//lastname
		data[2][3]="786570876";//phone
		
		return data;
	}
	@Test(dataProvider="getData")
	public  void runCreateLead(String comname,String fName,String lName,String ph) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(comname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(ph);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		

}
	
}
