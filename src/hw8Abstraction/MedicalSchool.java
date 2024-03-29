package hw8Abstraction;


public abstract class MedicalSchool {

	//Abstract method
	public abstract void anatomyLab ();
		
	//Non Abstract method/implemented method
  public void biochemistryLab() {
  System.out.println("This is from Medical School Class");
	
  }
	//We can create constructor in Abstract class
  public MedicalSchool () {
  }
	  
}
