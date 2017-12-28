package Strings;

import java.util.Arrays;

public class StringsMethodsPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Message = "The Turkey Is In The Oven";
		
		char [] CharArray = Message.toCharArray();
		int A = CharArray.length;
		
		
		for (int i = 0; i<A ; i++) {
			
			System.out.println("Index " + i + " is: "+ CharArray[i]);
		}

	}

}
