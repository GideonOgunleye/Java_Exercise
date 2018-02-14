package Static_Keyword;

public class StaticExampleClass {

	//Static variables are always associated with the class instead of the class instance
	//When a variable is set as Static, it is a class variable and not an object variable
	//Any common property shared by objects should be declared as static as we don't want it to change with every instance of that object

	
	private static String make;
	private static int instanceNum = 0;
	private static int staticInstanceNum = 0;
	
	
	public static void StaticExampleClass(String make){
		
		// make1;
		//getMake();
		StaticExampleClass.make = make;
		instanceNum++;
		staticInstanceNum++;
		
	}
	
	public static String getMake(){
		
		return make;
	}
	
	public int getInstanceNum (){
		
		return instanceNum;
		
	}
	
	public static int getSaticInstance(){
		
		return staticInstanceNum;
		
	}

}
