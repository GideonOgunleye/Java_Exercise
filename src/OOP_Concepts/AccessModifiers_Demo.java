package OOP_Concepts;

public class AccessModifiers_Demo {
	
	/*
	 * Access Modifiers Limit the scope of variables and methods within a class
	 * Types of Access Modifiers Include:
	 * 
	 * 	-Private (Only Accessible in class)
	 * 	-Public (Available anywhere outside the package with the importing of the package and class)
	 * 	-Protected (Should be available anywhere with any class within the same package and also available to any subclass even if its outside of the package)
	 * 	-No access Modifier (Only Available in the same package)
	 * 
	 * */
	
	public static void main(String[] args){
		
		Packages_Cars  Cars = new Packages_Cars();
		Cars.increaseSpeed();
		Cars.speed = 10;
		Cars.setPrivateSpeed(10);
		Cars.publicSpeed = 100;
		Cars.protectedSpeed = 100;
		Cars.decreaseSpeed();
		
	}

}
