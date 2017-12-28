package Methods;

public class ReturnTypesDemoPractise {
	
	public static void main (String [] args){
		
		String studentName;
		String grade;
		
		studentName = "Gideom";
		grade = findgrade (-200);
		displaygrade (studentName, grade);
		
	}
	
	public static String findgrade(int score){
		String grade;
		
		if (score >=90 && score <= 100){
			
			grade = "A";
			
		}else if (score >= 80 && score <= 90){
			
			grade = "B";
			
		}else if (score >=70 && score <=80){
			
			grade = "C";
			
		}else if (score > 100 || score <0){
			
			grade = "Error!!!";
			
		}else {
			
			grade = "D";
			
		}
		
		
		return grade;
	}
	
	public static void displaygrade(String studentName, String grade){
		
		System.out.println("**************************************************************");
		System.out.println("Grade for " + studentName + " is " + grade);
		System.out.println("**************************************************************");
		
	}

}
