package week3.day2;

public class LearnMethodOverLoading {

	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void add(int c,float d) {
		System.out.println(c+d);
	}
	
	public int sub(float d,int e) {
		return (int) (d-e);
	}
	
	public float sub(int d,float e) {
		return d-e;
		
	}
	
	public static void main(String[] args) {
		
		LearnMethodOverLoading lmo=new LearnMethodOverLoading();
		
		lmo.add(5, 6.6f);
		
		lmo.add(6, 9);
		
		int sub = lmo.sub(23.45f, 12);
		System.out.println(sub);
		
	System.out.println(lmo.sub(78, 34.87f));	
	}
	
	
}
