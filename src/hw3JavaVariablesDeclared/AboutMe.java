package hw3JavaVariablesDeclared;

public class AboutMe {
    //
	// String, int, float, char,long,byte,short,double and boolean type variables to
	// define myself
	public String myName; // variable declared
	public int myPhoneNumber;
	public float myHeight;
	public char myGender;
	public boolean fullTimeStudent;
	public long myAccountNumber;
	public byte myPhoneBill;
	public short myHouseRent;
	public double myCgpa;

//Declare a Default Constructor
	public AboutMe() {
		System.out.println(":-----This is all about Myself-----:");
	}

//Implement a void type of method
	public void aboutMe() {
		System.out.println("My Name: " + myName + "\nMy Phone Number: " + myPhoneNumber + "\nMy Height: " + myHeight
				+ "\nMy Gender: " + myGender + "\nI am a full time Student: " + fullTimeStudent + "\nMy Account Number:"
				+ myAccountNumber + "\nMy Phone Bill: " + myPhoneBill + "\nMy House Rent: " + myHouseRent
				+ "\nMy Cgpa: " + myCgpa);

	}

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe(); // Instantiate AboutMe/default constructor initialized here
		aboutMe.aboutMe(); // method initialized
	}

}
