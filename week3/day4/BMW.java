package week3.day4;

public class BMW extends Car{

	public void power() {
		System.out.println("its BMW");
	}
	
	public void applyBrake() {
		super.applyBrake();
		
	}
	
	public static void main(String[] args) {
		
		BMW b=new BMW();
		b.applyBrake();
	}
	
}
