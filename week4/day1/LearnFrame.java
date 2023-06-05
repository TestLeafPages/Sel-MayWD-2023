package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();

		driver.manage().window().maximize();


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();

		//parent frame 
		//defaultcontent
		
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		//nested frame
		
		//first frame 
		driver.switchTo().frame(2);
		
		//2nd frame
		driver.switchTo().frame("frame2");
		
		driver.findElement(By.id("Click")).click();
		
		//
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//i[contains(@class,'pi pi-server')]")).click();
		
	}

}
