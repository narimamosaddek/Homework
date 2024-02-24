package hw2JavaVariablesInitialized;

public class AboutMe {

	public String myCountry; // variable Declared
//now initializing String, int, float, char, and boolean type variables to define myself
	public String myName = "Narima";
	public int myAge = 100;
	public float myHeight = 5.4233f;
	public char myGender = 'F';
	public boolean fullTimeStudent = true;

//Declare a Default Constructor
	public AboutMe() {
		System.out.println(":-----This is all about Myself-----:");
	}

//Implement a void type of method
	public void aboutMe() {
		System.out.println("My Name: " + myName + "\nMy Age: " + myAge + "\nMy Height: " + myHeight + "\nMy Gender: "
				+ myGender + "\nI am a full time Student: " + fullTimeStudent);

	}

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe(); // Instantiate AboutMe/default constructor initialized here
		aboutMe.aboutMe(); // method initialized
	}

}
