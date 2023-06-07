package week4.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.sukgu.Shadow;

public class ShadowDom {

	public static void main(String[] args) {
		 ChromeOptions o = new ChromeOptions();
			o.addArguments("--disable-notifications");
			ChromeDriver driver= new ChromeDriver(o);

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://login.salesforce.com/");


			driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");

			driver.findElement(By.id("password")).sendKeys("Leaf@1234");


			driver.findElement(By.id("Login")).click();
			//Learn More
			driver.findElement(By.xpath("//span[text()='Learn More']")).click();
			
			Set<String> windowHandles = driver.getWindowHandles();
			
			List<String> data= new ArrayList<String>(windowHandles);
			
			driver.switchTo().window(data.get(1));
			driver.findElement(By.xpath("//button[text()='Confirm']")).click();
			
			//shadow
			
			Shadow op=new Shadow(driver);
		//	driver.findElement(By.xpath("//span[text()='Learning']")).click();
			op.findElementByXPath("//span[text()='Learning']").click();
			

	}

}
