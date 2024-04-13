package hw14Abstraction;

public abstract class NursingSchool extends RockefellerUniversity{

	// Abstract method
	public abstract void hygiene();

	// Non Abstract method
	public void caring() {
		System.out.println("This is from Nursing School Class");
	}

}
