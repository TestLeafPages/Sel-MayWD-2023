package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
//https://jqueryui.com/selectable/
		
		ChromeDriver driver= new ChromeDriver();

		driver.manage().window().maximize();


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/selectable/");
		
		driver.switchTo().frame(0);
		
		WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		WebElement item6 = driver.findElement(By.xpath("//li[text()='Item 6']"));
		
		
		
		Actions builder= new Actions(driver);
		//builder.clickAndHold(item2).clickAndHold(item4).clickAndHold(item6).perform();
		
		builder.keyDown(Keys.CONTROL).click(item2).click(item4).click(item6).keyUp(Keys.CONTROL).perform();
		}

}
