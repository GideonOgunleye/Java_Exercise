package Practise;

public class StringReverse_Practise {
	
	/*
	 * Assume you have a string "This is a test string"
	 * You need to write a code to reverse the string
	 * The output should be "String test a is this"
	 * 
	 * The challenge will utilize knowledge of strings, if conditions, and for loops ans some built-in functions also.
	 * 
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "this is a test string";
		//String output = 
				
		//String output = reverse(input);
		//System.out.println(output);
		System.out.println(reverse(input));
		

	}
	
	private static String reverse(String input) {
		String reverse = "";
		
		if (input == null || input.isEmpty()) {
			System.out.println("Empty and null strings are not accepted");
		}
		
		if (input.length() <= 1) {
			reverse = input;
		} else {
			String[] originalArray = input.split("\\s+");
			
			for (String item : originalArray) { // this, is, a, test, string
				reverse = item + " " + reverse; // this + "", is + this, a + is this, test + a is this, string + test a is this
			}
		}
		//.trim();
		
		return reverse.trim();
	}

}
