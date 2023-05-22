package week2.day1;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		
		int[] mark= {67,98,56,87,100,56,45,76};
	
		//length-property
		//ctrl+2 -
		 int length = mark.length;
		System.out.println("total number :"+length);
		
		//mark[5]
		System.out.println(mark[5]);
		
		//print last value
		
		System.out.println(mark[length-3]);
		
		System.out.println("-----------------");
		//sort
		Arrays.sort(mark);
		
		//ctrl+space
		//10 -0--9
		for (int i = 0; i <=length-1; i++) {
			
			System.out.println(mark[i]);
		}

		System.out.println(mark[3]);
		
		//System.out.println(mark[10]);
		
		System.out.println("---------------------");
		for (int i = mark.length-1; i >=0 ; i--) {
			
			System.out.println(mark[i]);
		}
	}

}
