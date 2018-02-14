package Static_Keyword;

public class StaticExampleClass_2 {
	//Static method cannot use the non-static variable or method directly
	//This and Super cannot be used in static context
	
	public int addNum = 0;
	public static int addNumStatic = 0;
	
	public static void main(String[] args) {
		
		StaticExampleClass_2  s1 = new StaticExampleClass_2();
		int output = s1.sum(20);
		int staticOutput = sumStatic(10);
		
		System.out.println("The Non Static Output is: " + output);
		System.out.println("The Static Output is: " + staticOutput);
		

	}
	
	public int sum(int num){
		
		return num + addNum;
	}
	
	public static int sumStatic(int num){
		
		return num + addNumStatic;
		
	}

}
