package week5.day4;

public class LearnStatic {

	int empid;
	static String empName;
	static String comName;
	
	public void setvalue(int id,String name,String cName) {
		
		empid=id;
		empName=name;
		comName=cName;
	}
	
	
	public void printValue() {
		System.out.println(empid+" "+empName+" "+comName);
	}
	
	
	
	public static void add() {
		System.out.println("i am coming from static method");
	}
		
	
	static {
		System.out.println("its coming static keyword");
	}
	
	
	public static void main(String[] args) {
		
		
		/*
		 * add();
		 * 
		 * LearnStatic st=new LearnStatic(); st.setvalue(101, "Vinoth", "Testleaf");
		 * st.printValue();
		 * 
		 * System.out.println("-------------------------------------"); LearnStatic
		 * st1=new LearnStatic(); st1.setvalue(102, "Dilip", "Tcs"); st1.printValue();
		 * st.printValue();
		 * 
		 * System.out.println("-------------------------------------"); LearnStatic
		 * st2=new LearnStatic(); st2.setvalue(103, "Ragu", "TestLeaf");
		 * st1.printValue();
		 * 
		 */
	}

}
