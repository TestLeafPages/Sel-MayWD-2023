package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
ChromeDriver driver= new ChromeDriver();
		
		//to max screen
		
		driver.manage().window().maximize();
		
		//need add wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//step-2 load the url
		driver.get("https://www.facebook.com/");

		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Dilip");
	}

}
