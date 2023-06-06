package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();

		driver.manage().window().maximize();


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/window.xhtml");
		
		String parent = driver.getTitle();
		System.out.println(parent);
		
		//one refference id
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		
		driver.findElement(By.xpath("//span[text()='Open']")).click();	
		
		//it will have more than one id
		Set<String> childwindow = driver.getWindowHandles();
		System.out.println(childwindow);
		
		//size 
		int windowsize = childwindow.size();
		System.out.println(windowsize);
		
		//to get particular window handel,convert set into list
		
		List<String> windows= new ArrayList<String>(childwindow);
		
		//syntax
		driver.switchTo().window(windows.get(1));
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//div[contains(@class,'ui-chkbox-box ui-widget')]")).click();
		
		
		driver.close();
		
		//switch to parent
		driver.switchTo().window(windows.get(0));
		
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		
		 Set<String> childwindow1 = driver.getWindowHandles();
		 System.out.println(childwindow1);
		 
		 int size = childwindow1.size();
		 System.out.println(size);
		 
		 List<String> windows1= new ArrayList<String>(childwindow1);
		 
		 driver.switchTo().window(windows1.get(1));
		 
		 driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		//driver.quit();
	}

}
