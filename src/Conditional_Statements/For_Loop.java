package Conditional_Statements;

public class For_Loop {

	public static void main(String[] args) {
		
		int [] numbers = {10,20,30,40,50};
		
//		int A = numbers.length;
		
		/*for (int i = 0 ; i < A; i++){
			
			System.out.println("Value of i is: "+ numbers[i]+ " at position " + i);
		}*/
		
		
		/*Advanced For Loop*/
		for (int number : numbers){
			
			System.out.println("Value of i is: "+ number);
		}

	}

}
