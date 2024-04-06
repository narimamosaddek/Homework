package hw11UseOfSuperInChildClass;

//Here Child class/Sub class is Daughter and Parent class/Base class/Super class is Father
public class Daughter extends Father {

	// Declared variables
	public String birthMonth;
	public int age;

	// Declare default constructor
	public Daughter() {

		super();// Default constructor called by Super method
		// all uses by super keyword below
		super.father(); // Void method
		super.fatherInfo("Mir", 50, 'M', false);// parameterized method
		super.name = "Mir";
		super.age = 50;
		super.sex = 'M';
		super.usCitizen = false;
		// FamilyName variable called by Super keyword
		super.familyName = "Mosaddek";
		System.out.println("This is Default Constructor of Daughter Class");

	}

	// parameterized constructor
	public Daughter(String birthMonth, int age) {
		super("Mir", 50, 'M', false);
		super.father();
		super.fatherInfo("Mir", 50, 'M', false);
		super.name = "Mir";
		super.age = 50;
		super.sex = 'M';
		super.usCitizen = false;
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Birth Month: " + birthMonth + ",Age:" + age);
	}

	// Void type method or No return method or Non parameterized method
	public void daughter() {
		// We can't use Super method inside the child class method
		super.father();
		super.fatherInfo("Mir", 50, 'M', false);
		super.name = "Mir";
		super.age = 50;
		super.sex = 'M';
		super.usCitizen = false;
		// FamilyName variable called by Super keyword
		super.familyName = "Mosaddek";
		System.out.println("This is a Void type method from Daughter Class");
	}

	// Parameterized method
	public void daughterInfo(String birthMonth, int age) {
		super.father();
		super.fatherInfo("Mir", 50, 'M', false);
		super.name = "Mir";
		super.age = 50;
		super.sex = 'M';
		super.usCitizen = false;
		System.out.println("Birth Month: " + birthMonth + ",Age:" + age);
	}

}
