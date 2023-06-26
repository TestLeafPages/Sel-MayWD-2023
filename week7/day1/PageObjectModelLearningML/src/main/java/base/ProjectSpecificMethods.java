package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;



public class ProjectSpecificMethods {

	public   ChromeDriver driver;
	public String excelFileName;
	public static Properties prop;

	@BeforeMethod
	public void preCondition() throws IOException {

		//setup the path of the properties file
		FileInputStream fis = new FileInputStream("src/main/resources/config_fr.properties");
		//Create object for Properties class
		prop = new Properties();
		//load this fis into prop
		prop.load(fis);


		driver  = new ChromeDriver();
		System.out.println(driver);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterMethod
	public void postCondition() {
		driver.quit();
	}


}
