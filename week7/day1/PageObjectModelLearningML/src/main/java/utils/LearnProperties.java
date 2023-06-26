package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnProperties {
	public static void main(String[] args) throws IOException {
		//setup the path of the properties file
		FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
		//Create object for Properties class
		Properties prop = new Properties();
		//load this fis into prop
		prop.load(fis);
		
		//read value from property file
		String usernameValue = prop.getProperty("username");
		System.out.println(usernameValue);
		
		String passValue = prop.getProperty("password");
		System.out.println(passValue);
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys(usernameValue);
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
	}

}
