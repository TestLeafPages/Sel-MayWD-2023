package week3.day4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUnqChar {

	public static void main(String[] args) {
		
		String name="Testleaf";
		
		char[] ch = name.toCharArray();
		
		Set<Character> unq= new HashSet<>();
		Set<Character> dup= new HashSet<>();
		
//		for (int i = 0; i < ch.length; i++) {
//			
//		}
		String output="";
		
		for (Character i : ch) {
			if(!unq.add(i)) {
				output=output+i;
			//	dup.add(i);
			}
		}

		System.out.println(output);
		System.out.println(unq);
		//System.out.println(dup);
	}

}
