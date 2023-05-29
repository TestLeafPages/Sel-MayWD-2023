package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebDriverMethod {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();

		driver.manage().window().maximize();


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//ctrl+2=l
		String title = driver.getTitle();
		
		System.out.println(title);

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		
		//partial attri based xapth-//tagname[contins(@attr,'attrvalues')]
		
		driver.findElement(By.xpath("//input[contains(@id,'assw')]")).sendKeys("crmsfa");
		
		//collection based xapth-(//tagname[@attr='attr value'])[index]
		//(//input[@class='inputLogin'])[2]
		
		
		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dilip");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kumar");
		
		//createLeadForm_lastName
		//createLeadForm_firstName
driver.findElement(By.name("submitButton")).click();

//ctrl+2-l
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(text);
	}

}
