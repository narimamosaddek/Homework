package hw10Abstraction;

/*
 * We can use "extends" and "Implements" keywords to inherit in the Abstract class
 * An abstract can inherit another abstract class or Regular class by "Extends" keyword
 * An abstract can't inherit another abstract class or Regular class by "Implements" keyword
 * An Abstract class can't inherit Interface by "Extends" keyword
 * An Abstract class can inherit more than One Interface by "Implements" keyword
 * More than one inheritance are possible in Abstract Class.
 */
public abstract class MedicalSchool extends NursingSchool implements LawSchool {

	// Abstract method
	public abstract void anatomyLab();

	// Non Abstract method/implemented method
	public void biochemistryLab() {
		System.out.println("This is from Medical School Class");

	}

	// We can create constructor in Abstract class
	public MedicalSchool() {
	}

}
