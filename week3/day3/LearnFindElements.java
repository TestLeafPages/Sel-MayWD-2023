package week3.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFindElements {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();

		driver.manage().window().maximize();


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/link.xhtml;jsessionid=node01of4nizn4f6j5alqft3kugkpy283466.node0");
		
		//return-List<webelement>
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int linksize = links.size();
		System.out.println(linksize);
		
		for (int i = 0; i < linksize; i++) {
			//WebElement ele = links.get(i);
			//System.out.println(ele);
			String text = links.get(i).getText();
		System.out.println(text);
			
		}
	}

}
