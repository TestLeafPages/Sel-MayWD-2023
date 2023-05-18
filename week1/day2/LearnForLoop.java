package week1.day2;

import java.util.Iterator;

public class LearnForLoop {

	public static void main(String[] args) {

		int n=10;
		//for-ctrl+space
		//i=0--from which number start 
		//i<10--condition 
		//i++ --increment
		for (int i = 0; i <n; i++) {
			if(i==2) {
				System.out.println("i reached "+i);
				//continue;
				break;
			}
			System.out.println(i);
		}
		System.out.println("-----------------------------");
		
		/*
		 * for (int i = n; i >=0; i--) { 
		 * if(i==6) {
		 * 
		 * System.out.println("i reached 6");
		 *  break; 
		 *  } 
		 *  System.out.println(i); 
		 *  }
		 */
	}

}
