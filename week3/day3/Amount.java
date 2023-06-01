package week3.day3;

public class Amount extends Siva{

	public float ppf() {
		// TODO Auto-generated method stub
		return 8.5f;
	}

	
	public void smallroom() {
		System.out.println("its build");
	}
	
	
	
	public static void main(String[] args) {
		//Siva s=new Siva();
		Amount a=new Amount();
		System.out.println(a.Kyc());
		System.out.println(a.withdraw());	
		System.out.println(a.ppf());
		a.smallroom();
	}

}
