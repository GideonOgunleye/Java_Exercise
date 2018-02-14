package Conditional_Statements;

public class Switch_Statements {
	
	/*Switch statements can be used to test a range of values/variables */
	public static void main(String[] args) {
		
		int numDays = numOfDays(2018,"April");
		System.out.println("Number od Days is: " + numDays);
		
		
	}
	
	static int numOfDays(int year, String month){
		
		int numDays = 0;
		
		switch (month){
		case "Jan":
			numDays = 31;
			break;
		case "Feb":
			if (year % 400 == 0){
				
				numDays = 29;
				
			}else {
				
				numDays = 28;
				
			}
			break;
		case "March":
			numDays = 31;
			break;
		default:/*default is like the else statement in a switch*/
			
			System.out.println("Invalid Month");
			
		}
		
		return numDays;
		
	}

}
