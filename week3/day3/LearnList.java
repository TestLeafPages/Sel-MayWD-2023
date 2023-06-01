package week3.day3;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		
		//syntax
		//java.util
		List<String> mentors=new ArrayList<String>();
		//m1-add
		mentors.add("Gokul");
		mentors.add("Ragu");
		mentors.add("Vinoth");
		mentors.add("Ranjini");
		mentors.add("Subraja");
		
		System.out.println(mentors);
		
		//m2-size
		int size = mentors.size();
		System.out.println(size);
		
		//m3-
		mentors.add(2, "Dilip");
		System.out.println(mentors);
		
		mentors.add("Dilip");
		System.out.println(mentors);
		
		int size2 = mentors.size();
		
		System.out.println(size2);
		
		
		System.out.println("---------------------");
		for (int i = 0; i <=size2-1; i++) {
			System.out.println(mentors.get(i));
		}
		
		//m4-remove
		String remove = mentors.remove(5);
		
		System.out.println("after remove"+mentors);
		
		
		List<String>data= new ArrayList<String>();
		
		//addall
		data.addAll(mentors);
		data.add("Aravind");
		data.add("Subraja");
		
		System.out.println(data);
		
		//m5-removeAll
		data.removeAll(mentors);
		System.out.println(data);
		
		//clear
		mentors.clear();
		
		System.out.println(mentors);
	

		//contains
		boolean contains = data.contains("Subraja");
		System.out.println(contains);
	}

}
