package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethods {
	
	public   ChromeDriver driver;
	
	@BeforeMethod
	public void preCondition() {
		driver  = new ChromeDriver();
		System.out.println(driver);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterMethod
	public void postCondition() {
		//driver.quit();
	}
}
