package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAxesXpath {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();

		driver.manage().window().maximize();


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.xpath("//div[@id='username_container']//input")).sendKeys("hari.radhakrishnan@qeagle.com");
		
		driver.findElement(By.xpath("//input[@id='password']/ancestor::div[@id='theloginform']")).sendKeys("Leaf@1234");
		
		driver.findElement(By.xpath("//input[@id='Login']")).click();

	}

}
