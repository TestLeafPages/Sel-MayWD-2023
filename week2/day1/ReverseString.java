package week2.day1;

public class ReverseString {

	public static void main(String[] args) {
		String data= "Testleaf";
		//faeltseT
		char[] charArray = data.toCharArray();
		for (int i = charArray.length-1; i >=0; i--) {
			System.out.print(charArray[i]);
		}
		
	}

}
