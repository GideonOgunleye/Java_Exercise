package Conditional_Statements;

public class While_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		
		while (i <= 20){
			
//			System.out.println(i);
			System.out.println("The Value of i is: " + i);
			i++;
			
			if (i == 12){
				
				System.out.println("Skipped : " + i);
//				continue;
			}
			


		}
		
		System.out.println("Outside loop");
		
		
		// Do While Loop
		
/*		do {
			
			
			i++;
			System.out.println(i);
			
		}while (i < 15);*/
		
	}
	

	

}
