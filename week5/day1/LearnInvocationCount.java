package week5.day1;

import org.testng.annotations.Test;

public class LearnInvocationCount {


	@Test(invocationCount=5,threadPoolSize=2)
	public void editLead() {
		System.out.println("editLead");
		
	}
}
