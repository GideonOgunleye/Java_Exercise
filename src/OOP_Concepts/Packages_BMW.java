package OOP_Concepts;

public class Packages_BMW extends Packages_Cars{
	
	public Packages_BMW (int startSpeed){
		
		super (startSpeed);
	}

	@Override
	public void increaseSpeed() {
		
		protectedSpeed++;
		System.out.println("Increasing Speed Of BMW");
		//super.increaseSpeed();
	}
	
	public void displayNavigation(){
		
		System.out.println("BMW Specific Functionality");
	}

}
