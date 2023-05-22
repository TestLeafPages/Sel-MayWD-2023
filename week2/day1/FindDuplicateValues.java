package week2.day1;

public class FindDuplicateValues {

	public static void main(String[] args) {
		int[] num= {1,4,2,6,4,2,7,8,10,45,34,7,98,97,67,54,98};
//2,4,7,98
		//num[0]=1-num[1]=4
		for (int i = 0; i < num.length; i++) {
			
			//num[0+1]-num[1]=4--num[2]=2
			for (int j = i+1; j < num.length; j++) {
				 {
					 if(num[i]==num[j]) {
						 System.out.println(num[i]);
				 }
					
				}
			}
		}
		
	}

}
