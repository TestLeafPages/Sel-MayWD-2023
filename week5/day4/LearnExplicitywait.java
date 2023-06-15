package week5.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitywait {

	public static void main(String[] args) {
EdgeDriver driver  = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/waits.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		
		WebElement w = driver.findElement(By.xpath("//span[text()='I am here']"));
		//syntax
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(2));
		WebElement until = wait.until(ExpectedConditions.visibilityOf(w));
		
		String text = until.getText();
		
		System.out.println(text);
		
	}

}
