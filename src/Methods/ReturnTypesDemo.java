package Methods;

public class ReturnTypesDemo {
	
	/*NOTE: If a method doesnt have a return type then we use void(Which means it does not return anything)
	  However, if there is a use case where the method wants the scenario to return a data type, it is initiated before the method name.*/

	public static void main(String[] args){
		
		String grade;
		String studentName;
		
		studentName = "Gideon";
		grade = findgrades(99);
		displaygrades(studentName, grade);
		
		studentName = "John";
		grade = findgrades(300);
		displaygrades(studentName, grade);
		
		studentName = "Willy";
		grade = findgrades(20);
		displaygrades(studentName, grade);
		
		studentName = "kenny";
		grade = findgrades(-1);
		displaygrades(studentName, grade);
	}
	
	
	public static String findgrades(int score){
		String grade;
		
		if (score >= 90 && score <=100){
			
			grade = "A";
			
		}else if(score >= 80 && score <=90){
			
			grade = "B";
			
		}else if(score >= 70 && score <=80){
			
			grade = "C";
			
		}else if (score > 100 || score <0){
			
			grade = "Grade Error....Please Check Score";
			
		}else {
			
			grade = "D";
		}
		
		return grade;
		
	}
	
	public static void displaygrades(String studentName, String grade){
		
		System.out.println("********************************************************************");
		System.out.println("Grade for "+ studentName + " is: " + grade);
		System.out.println("********************************************************************");
		
	}

}
