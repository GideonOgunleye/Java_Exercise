package OOP_Concepts;

public class Inheritance_BMW extends Inheritance_Cars{

	public Inheritance_BMW (int startSpeed){
		
		super (startSpeed);
	}

	@Override
	public void increaseSpeed() {
		
		System.out.println("Increasing Speed Of BMW");
		//super.increaseSpeed();
	}
	
	public void displayNavigation(){
		
		System.out.println("BMW Specific Functionality");
	}
	
	
}
