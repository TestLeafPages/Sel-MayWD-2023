package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();

		driver.manage().window().maximize();


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/drag.xhtml");
		
		WebElement target = driver.findElement(By.id("form:drop_content"));
		WebElement source = driver.findElement(By.id("form:drag_content"));
		
		Actions builder= new Actions(driver);
		
		builder.dragAndDrop(source, target).perform();

	}

}
