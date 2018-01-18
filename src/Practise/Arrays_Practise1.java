package Practise;

import java.util.Arrays;

public class Arrays_Practise1 {
	
	public static void main (String [] args){
		
		
		/*Question 1: 
		 * For numbers 10,30,20,50,40
		 * For Strings Black, Red, Blue, Yellow, Green
		 * Print 2nd and 4th Arrays
		 * */
		
		int [] myIntarray = {10,30,20,50,40};
		String [] myStringarray = {"Black","Red","Blue","Yellow","Green"};
		
		System.out.println("The second value in the Numbers Array is: " + myIntarray[2]);
		System.out.println("The Fourth value in the Numbers Array is: " + myIntarray[4]);
		System.out.println("========================================================");
		System.out.println("The second value in the Strings Array is: " + myStringarray[2]);
		System.out.println("The Fourth value in the Strings Array is: " + myStringarray[4]);
		System.out.println(" ");
		
		

		
		
		
		/*Question 2
		 * For numbers 10,30,20,50,40
		 * For Strings Black, Red, Blue, Yellow, Green
		 * sort and print all arrays in descending order
		 * */
		
		int A = myIntarray.length;
		int B = myStringarray.length;
		
		Arrays.sort(myIntarray);
		for (int i = 0 ; i<A ; i++){
			
			System.out.println(myIntarray[i]);
			System.out.println("========================================================");
			System.out.println(" ");
			
		}
		
		Arrays.sort(myStringarray);
		for (int i =0; i < B ; i++) {
			
			System.out.println(myStringarray[i]);
			System.out.println("========================================================");
			System.out.println(" ");
		}
		
		

		
	}

}
