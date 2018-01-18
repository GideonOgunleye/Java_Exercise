package Practise;

public class Methods_Practise1 {
	
	/*Question:
	 * Write a program to display student grades using a void method
	 * if score is between 90 - 100, Grade A
	 * If score is between 80 - 89, Grade B
	 * if score is between 70 - 79, Grade C
	 * if score is between 60 - 69, Grade D
	 * if score is less than 60, Grade F
	 * */
	 
	 
	 public static void main (String [] args){
		 
		 String studentName = "Gideon";
		 int score = 90;
		 
		 displayGrades (studentName, score);
		 
	 }
	 
	 public static void displayGrades(String studentName, int score){
		 
		 String grade;
		 
		 if (score >= 90 && score <= 100){
			 
			 grade = "A";
			 
		 }else if(score >= 80 && score <= 89){
			 
			 grade = "B";
			 
		 }else if (score >= 70 && score <= 79){
			 
			 grade = "C";
			 
		 }else if (score >= 60 && score <= 69){
			 
			 grade = "D";
			 
		 }else if (score < 60){
			 
			 grade = "F";
			 
		 }else {
			 
			 grade = "Error Calculating grades......Please check score!!!";
		 }
		 
		 System.out.println ("The grade for " + studentName + " is: " + grade);
		 
	 }
	

}
