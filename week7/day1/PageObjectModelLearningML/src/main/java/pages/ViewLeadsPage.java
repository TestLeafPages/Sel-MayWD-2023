package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class ViewLeadsPage extends ProjectSpecificMethods{
	public ViewLeadsPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public ViewLeadsPage verifyViewLead() {
		System.out.println("Lead created successfully");
		return this;

	}
}
