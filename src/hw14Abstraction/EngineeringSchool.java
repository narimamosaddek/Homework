package hw14Abstraction;

public abstract class EngineeringSchool extends NYUniversity{

	//Abstract method
	public abstract void mechanicalLab();
	
	//Non abstract method
	public void computerLab() {
		System.out.println("This is method implemented from Emgineering School");
	}
	

}
