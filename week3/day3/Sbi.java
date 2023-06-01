package week3.day3;

public class Sbi implements Rbi{

	public int withdraw() {
		return 1000000;
		
		
	}

	public String Kyc() {
		return "aadhar card";
		
		
	}
	
	public int limitwithdraw() {
		return 500;
		
	}
	
	public static void main(String[] args) {
		
		//for interface we cannot create object for it
		//Rbi rbi= new Rbi();
		
		Sbi bank= new Sbi();
		System.out.println(bank.withdraw());
		System.out.println(bank.Kyc());
		System.out.println(bank.limitwithdraw());
	}

	public float ppf() {
		// TODO Auto-generated method stub
		return 8.5f;
	}


}
