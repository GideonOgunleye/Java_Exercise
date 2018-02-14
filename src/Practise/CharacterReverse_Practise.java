package Practise;

import java.util.Scanner;

public class CharacterReverse_Practise {
	
	/*
	 * Assume you have a string "it is a test string".
	 * Write a code to revere the characters of the string.
	 * 
	 * Reverse String Output -> "string test a is it"
	 * Reverse Characters Output -> "gnirts tset a si tl""
	 * 
	 * */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a string: ");
		String original = scan.nextLine();
		
		
		while (original.isEmpty() || original == null) {
			
			System.out.println("Please enter a valid string, empty and null strings are not accepted:");
			original = scan.nextLine();
			
		}
		scan.close();
		
		CharacterReverse_Practise output = new CharacterReverse_Practise();
		String reverseCharacters = output.reverseCharacters(original);
		System.out.println(reverseCharacters);

	}
	
	private String reverseCharacters(String originalString){
		String reverse = "";
		
		for (int i = originalString.length() - 1; i >= 0 ; i--){
			
			reverse = reverse + originalString.charAt(i);
		}
		
		return reverse;
		
	}

}
