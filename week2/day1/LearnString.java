package week2.day1;

public class LearnString {

	public static void main(String[] args) {
		
		//method 1
		String name="TestLeaf";
		String name1="TestLeaf";

		//method 2
		String data=new String("Testleaf");
		String data2=new String("TestLeaf");
		
		//m1-length-method
		int length = name.length();
		
		System.out.println("method find length: "+length);
		
		
		//m2-equals
		//equals-string value & == --compare memory address
		
		if(name.equals(data)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		if(data==data2){
			System.out.println("== +true");
		}else {
			System.out.println("== +false");
		}
		
		
		//m3-equalsIgnoreCase
		if(name.equalsIgnoreCase(data)){
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		//m4-contains
		boolean contains = name.contains("A");
		System.out.println(contains);
		
		//m5-tochararray
		
		String name3="Testleaf";
		char[] charArray = name3.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
		
		//m6-charAt(index)
		//index is start from'0'
		char charAt = name3.charAt(6);
		System.out.println(charAt);
		
		//m7-toUpperCase
		String upperCase = name3.toUpperCase();
		
		System.out.println(upperCase);
		
		//m8-toLowerCase
		String lowerCase = name3.toLowerCase();
		System.out.println(lowerCase);
		
		//m9-split
		
		String ch="test leaf in chennai";
		String[] split = ch.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i]);
		}
	}

}
