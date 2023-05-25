package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		
		//to max screen
		
		driver.manage().window().maximize();
		
		//need add wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//step-2 load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//--attri based xpath -//tagname[@attr='attr value']
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		
		//partial attri based xapth-//tagname[contins(@attr,'attrvalues')]
		
		driver.findElement(By.xpath("//input[contains(@id,'assw')]")).sendKeys("crmsfa");
		
		//collection based xapth-(//tagname[@attr='attr value'])[index]
		//(//input[@class='inputLogin'])[2]
		
		
		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		

		String title1 = driver.getTitle();
		
		System.out.println(title1);
		
		
		//partial text based xpath-//tagnam[contains(text(),'value')]
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		

		String title = driver.getTitle();
		
		System.out.println(title);
		
//		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
//		System.out.println(text);
		
		driver.close();
	}

}
