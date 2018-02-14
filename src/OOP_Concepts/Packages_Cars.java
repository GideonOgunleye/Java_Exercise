package OOP_Concepts;

public class Packages_Cars {
	
	// No Modifier - accessible in the same package
	int speed;
	// Only in class
	@SuppressWarnings("unused")
	private int privateSpeed;
	// Anywhere in Java World with importing the package and class
	public int publicSpeed;
	// In same package and in sub classes
	protected int protectedSpeed;
	int speedLimit = 100;
	
	
	public Packages_Cars (){
		
		this(0);
	}
	
	public Packages_Cars(int startSpeed){
		
		speed = startSpeed;
	}
	
	public void setPrivateSpeed(int pSpeed){
		
		this.privateSpeed = pSpeed;
	}
	
	public void increaseSpeed (){
		
		if (speed < 100){
			
			speed++;
		}
		System.out.println("Increasing Speed of Cars");
		
	}
	
	public void decreaseSpeed (){
		
		speed--;
		System.out.println("Decreasing Speed of Cars");
		
	}

}
