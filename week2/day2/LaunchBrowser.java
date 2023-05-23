package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchBrowser {

	public static void main(String[] args) {
		
		//step-1 how to launch the browser
		ChromeDriver driver= new ChromeDriver();
		
		//to max screen
		
		driver.manage().window().maximize();
		
		//need add wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//step-2 load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.close();
	}

}
