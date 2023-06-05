package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();

		driver.manage().window().maximize();


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		//switch my control to alert
		
		// driver.switchTo().alert().accept();
		
		//simple alert
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		
		Thread.sleep(2000);
		//accpect the alert
		alert.accept();
		
		String text2 = driver.findElement(By.id("simple_result")).getText();
		System.out.println(text2);
		
		Thread.sleep(3000);
		//confrim alert
		//action -2
		
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		
		Alert alert2 = driver.switchTo().alert();
		
		Thread.sleep(3000);
		alert2.dismiss();
		
		//result
	
		String text3 = driver.findElement(By.id("result")).getText();
		System.out.println(text3);
		
		
		//sweet alert
		
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-closethick']")).click();
		
		
		
		
		//
		
		driver.close();
	}

}
