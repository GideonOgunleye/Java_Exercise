package Arrays;

//import org.apache.commons.lang.ArrayUtils;
//import java.util.*;
import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
/*		//Example 1
		int [] myIntArray = {10, 20};
		
		System.out.println("0 index: " + myIntArray[0]);
		System.out.println("1st index: " + myIntArray[1]);
		
		
		//Example 2
		myIntArray [0] = 30;
		myIntArray [1] = 40;
		
		System.out.println("0 index: " + myIntArray[0]);
		System.out.println("1st index: " + myIntArray[1]);*/
		
		//Example 3
		int [] myIntArray = {70,80,10,20,30,40,50,60};
		String [] myStringArray = {"Audi","BMW","Honda"};
		
	
		int len1 = myIntArray.length;
		int len2 = myStringArray.length;
		
		System.out.println("Int array length: " + len1);
		System.out.println("String array length: " + len2);
		
		Arrays.sort(myIntArray);
		
		for (int i = 0; i<len1; i++){
			
			System.out.println(myIntArray[i]);
		}
		
		
		
/*		for (int i = 0; i < len1; i++){
			System.out.println(myIntArray[i]);
		}*/

	}



}
