package OOP_Concepts;

public class Inheritance_Demo {
	
	
	/*
	 * In OOP , one class can inherit fields and methods from another 
	 * An object that inherits from another is called a Subclass
	 * An Object that it inherits from is called the superclass.
	 * A Subclass inherits the superclass(Parent Class)
	 * */
	


	public static void main(String[] args) {
		int speed = 0;
		
		Inheritance_Cars  Cars = new Inheritance_Cars(speed);
		Cars.increaseSpeed();
		
		Inheritance_BMW Bmw = new Inheritance_BMW(speed);
		Bmw.increaseSpeed();

	}

}
