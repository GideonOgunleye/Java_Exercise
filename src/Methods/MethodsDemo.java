package Methods;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*NOTE: A method in Java is a block of statements that has a name 
		  and can be executed by calling (also called invoking) 
		  it from some other place in your program
		  
		  - Variable can be declared outside a method,
		  but the action on the variable can only be done in a method.
		  
		  -Every Class needs a main method. as without it a class cannot run on its own.
		  
		  -Methods should not be inside of each other.*/
		
		
		//Finding Methods Sample
		
		findGrades("John", 90);
		findGrades("Tom", 80);
	}
	
	public static void findGrades(String studentName, int score) {
		String grade;
		if (score >= 90 && score <= 100) {
			grade = "A";
		} else if (score >= 80 && score < 90) {
			grade = "B";
		} else if (score >= 70 && score < 80) {
			grade = "C";
		} else {
			grade = "D";
		}
		System.out.println("Grade of " + studentName + " is: " + grade);
	}
	

}
