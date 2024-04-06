package hw10Abstraction;

/*
 * Two keywords "Extends" and "Implements" are used for the inheritance in a regular class
 * A regular class can inherit another regular class or Abstract class by "Extends" keyword
 * A regular class can't inherit another regular class or Abstract class by "Implements" keyword
 * A regular class can inherit more than One Interfaces by "Implements" Keyword
 * A regular class can't inherit Interfaces by "Extends" Keyword
 * More than one inheritances are possible by a regular class
 */

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {

	// We can't create Abstract method in side the regular Class
	// public void chemistry();

	// method implemented
	public void biology() {
		System.out.println("This is method of Columbia University");
	}

	// Default constructor
	public void ColumbiaUniversity() {

	}

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub

	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub

	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub

	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub

	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub

	}

}
