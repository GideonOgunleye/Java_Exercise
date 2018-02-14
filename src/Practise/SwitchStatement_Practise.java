package Practise;

public class SwitchStatement_Practise {
	
	/*Question: Write switch statement to display number of days for a given month
	 * 
	 * */
	
	public static void main (String [] args){
		
		int numDays = numOfDays("FEB", 2011);
		
		System.out.println("Number of Days is : " + numDays);
		
	}
	
	public static int numOfDays (String Month, int Year){
		
		int numDays = 0;
		
		
		switch (Month){
			
			case "JAN":
		
			numDays = 30;
			break;
			
			case "FEB":
			
			if (Year % 400 == 0){
				
				numDays = 28;
			}else {
				
				numDays = 31;
			}
			break;
			
			case "MAR":
			
				numDays = 30;
				
			break;
			default:
			
			System.out.println("Invalid Input");
		
		}
		
		return numDays;
		
	}

}
