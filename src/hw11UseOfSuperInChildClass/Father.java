package hw11UseOfSuperInChildClass;

public class Father {

// Declare 5 variables below
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

//Default Constructor
	public Father() {
		System.out.println("This is Deafult Constructor of Father Class");
	}

// parameterized constructor

	public Father(String name, int age, char sex, boolean usCitizen) {
		// super(); //Super method used in Child class
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Name: " + name + ", Age: " + age + ", Sex: " + sex + ", Us Citizen :" + usCitizen);
	}

// Void type method or No return method or Non parameterized method

	public void father() {
		System.out.println("This is a Void type method from Father Class");
	}

// Parameterized method

	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		System.out.println("Name: " + name + ", Age: " + age + ", Sex: " + sex + ", Us Citizen :" + usCitizen);
	}

}
