package week5.day1;

import org.testng.annotations.Test;

public class LearnEnable {

	@Test(priority=1,enabled=false)
	public void createLead() {
		System.out.println("createLead");
	}
	
	@Test()
	public void editLead() {
		System.out.println("editLead");
	}
	
	@Test()
	public void duplicateLead() {
		System.out.println("duplicateLead");
	}
	
	@Test()
	public void deleteLead() {
		System.out.println("deleteLead");
	}
}
