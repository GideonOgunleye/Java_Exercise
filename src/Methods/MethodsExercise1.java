package Methods;

public class MethodsExercise1 {


	public static void main(String [] args){
		
		findgrades("Gideon", 99);
		findgrades("John", 300);
		findgrades("Jemma", 20);
		findgrades("Willy", -1);
		
	}
	
	public static void findgrades(String studentName, int score){
		
		String grades;
			
		if (score >= 90 && score <=100){
			
			grades = "A";
			
		}else if (score >= 80 && score <=90){
			
			grades = "B";
			
		}else if (score >= 70 && score <=80){
			
			grades = "C";
			
		}else if (score > 100 || score < 0){
			
			grades= "Impossible Grade!!!....Check your marking";
			
		}else {
			
			grades = "D";
			
		}
		
		System.out.println("Grade of " + studentName + " is: " + grades);
		
	}

}
