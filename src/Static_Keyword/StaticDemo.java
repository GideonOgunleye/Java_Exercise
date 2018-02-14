package Static_Keyword;

public class StaticDemo {

	public static void main(String [] argss){
		
/*		StaticExampleClass s1 = new StaticExampleClass("Honda");
		System.out.println("Make of car is: " + s1.getMake());
		System.out.println("This instance no: "+ s1.getInstanceNum());//This uses class instance
		
		StaticExampleClass s2 = new StaticExampleClass("Toyota");
		System.out.println("Make of car is: " + s2.getMake());
		//System.out.println("This instance no: "+ StaticExampleClass.getInstanceNum());//This uses name of the class
		System.out.println("This instance no: "+ s2.getInstanceNum());*/
		
		//StaticExampleClass s3 = new StaticExampleClass("Toyota");
		StaticExampleClass.StaticExampleClass("Honda");
		StaticExampleClass.getMake();
		System.out.println("This instance no: "+ StaticExampleClass.getSaticInstance());
		
		
		StaticExampleClass.StaticExampleClass("Toyota");
		StaticExampleClass.getMake();
		System.out.println("This instance no: "+ StaticExampleClass.getSaticInstance());
				
	}

}
