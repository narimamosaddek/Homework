package hw14Abstraction;

public class RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool{

	//Non abstract method / method implemented
	public void maths() {
		System.out.println("This is method of Rockfeller University");
	}

	@Override
	public void aeronauticalInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mechanicalLab() {
		// TODO Auto-generated method stub
		
	}
	
}
