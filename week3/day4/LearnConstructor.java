package week3.day4;

public class LearnConstructor {
//instace variable
	int x;
	String name;
	
	//default
	LearnConstructor(){
		System.out.println("I am Default Constructor");
		x=20;
		name="testleaf";
	}
	
	//parameterized construuctor
	//local variable
	LearnConstructor(int x,String name){
		this();
		
		this.x=x;
		this.name=name;
		System.out.println("I am Parameterized constructors"+x+" "+name);
		/*
		 * x=age; name=value;
		 */
		
	}
	
	LearnConstructor(String data){
		this(20,"Dilip");
		
		System.out.println("2nd para:"+data);
	}
	
	
	
	public static void main(String[] args) {
		//LearnConstructor lc= new LearnConstructor();
		LearnConstructor lc1= new LearnConstructor("TestLeaf");
	//	LearnConstructor lc2= new LearnConstructor(27,"Ragu");
		
		
		

		
	}
	
	
	
	
}
