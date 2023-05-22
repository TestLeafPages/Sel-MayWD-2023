package week2.day1;

public class LearnInputArgs {

	
	public int add(int a,int b) {
		
		return a+b;	
	}
	
	public int sub(int a,int b) {
		return a-b;	
	}
	
	public void mul() {
		
	}
	
	public static void main(String[] args) {
		LearnInputArgs ia=new LearnInputArgs();
	System.out.println(ia.add(5, 5));	
	
		int output=ia.sub(10, 5);
		System.out.println(output);
	
		ia.mul();
	}
	
}
