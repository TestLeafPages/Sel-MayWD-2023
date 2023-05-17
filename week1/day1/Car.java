package week1.day1;

public class Car {

	// Accessmodifier Returntype Methodname(input agrs)
	
	//noOfWheel-ctrl+space-change into public 
	
	public void noOfWheel() {
		System.out.println("noOfwheel : 4");

	}
	public void color() {
		System.out.println("Red");
	}
	
	public int modelNo() {
		return 234;	
	}
	public String brandName() {
		return "BMW";
		
	}
	
	public static void main(String[] args) {
		//step 1
		//className object = new className();
		Car c=new Car();
		
		//step 2
		//obj name.method();
		c.noOfWheel();
		c.color();
		//m1--if method datatype
		System.out.println(c.brandName());
		//m2--
		//to assign inlocal variable
		//ctrl+2 ,localvaiable
		int modelNo = c.modelNo();
		System.out.println(modelNo);
	}
}
