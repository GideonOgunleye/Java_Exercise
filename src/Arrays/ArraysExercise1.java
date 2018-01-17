package Arrays;

import java.util.Arrays;

public class ArraysExercise1 {
	
	public static void main (String[] args){
		
		int [] myIntArray = {40, 60, 80, 10, 20, 30};
		String [] myStringArray = {"Black","Yellow","Blue","Red","Orange"};
		
		System.out.println("3rd Index of my Int Array is: "+ myIntArray[3]);
		System.out.println("4th Index of my String Array Is: " + myStringArray[4]);
		
		
		int A = myIntArray.length;
		int B = myStringArray.length;
		
		Arrays.sort(myIntArray);
		for (int i = 0; i<A ; i++){
			
			System.out.println(myIntArray[i]);
			
		}
		
		Arrays.sort(myStringArray);
		for (int i = 0; i<B; i++){
			
			System.out.println(myStringArray[i]);
			
		}
		
	}


}
