package week5.day1;

import org.testng.annotations.Test;

public class LearnDependsOnMethod {


	@Test()
	public void createLead() {
		System.out.println("createLead");
	}
	
	@Test()
	public void editLead() {
		System.out.println("editLead");
	}
	
	@Test(dependsOnMethods="createLead")
	public void duplicateLead() {
		System.out.println("duplicateLead");
	}
	
	@Test()
	public void deleteLead() {
		System.out.println("deleteLead");
	}
}
