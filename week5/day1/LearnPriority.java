package week5.day1;

import org.testng.annotations.Test;

public class LearnPriority {

	@Test(priority=1)
	public void createLead() {
		System.out.println("createLead");
	}
	
	@Test(priority=-2)
	public void editLead() {
		System.out.println("editLead");
	}
	
	@Test(priority=3)
	public void duplicateLead() {
		System.out.println("duplicateLead");
	}
	
	@Test()
	public void deleteLead() {
		System.out.println("deleteLead");
	}
}
