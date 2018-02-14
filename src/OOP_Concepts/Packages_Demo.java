package OOP_Concepts;

public class Packages_Demo {

	/*
	 * Packages Help Us In The Grouping of related types
	 * 
	 * */
	
	public static void main(String[] args) {
		int speed = 0;
		
		Packages_Cars  Cars = new Packages_Cars(speed);
		Cars.increaseSpeed();
		
		Packages_BMW Bmw = new Packages_BMW(speed);
		Bmw.increaseSpeed();

	}
}
