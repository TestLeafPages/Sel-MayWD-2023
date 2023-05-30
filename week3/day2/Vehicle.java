package week3.day2;

public class Vehicle extends MyVehicle {

	public void applyBrake() {
		System.out.println("its coming from Vehicle");
	}
	
	public void soundHorn() {
		System.out.println("its coming from Vehicle");

	}
	
	public static void main(String[] args) {
		
		Bajaj b= new Bajaj();
		b.applyBrake();
		b.soundHorn();
		
		b.handGear();
		
		b.meeterBox();
		
		
		BMW dw=new BMW();
		dw.applyBrake();
		
		Audi a=new Audi();
		a.soundHorn();
	
	}
}
