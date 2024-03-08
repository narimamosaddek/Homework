package hw5JavaMethods;

public class FullName {

	// Implemented a String return type parameterized method below-
	public String fullName(String fName, String lName) {
		System.out.println("Family Member: " + fName + " " + lName);
		return null;
	}

	// Created Main method & Instantiated the class below-
	public static void main(String[] args) {
		FullName details = new FullName();

		// I can call the method multiple times
		details.fullName("Narima", "Mosaddek");
		details.fullName("ABC", "XYZ");
		details.fullName("Tushty", "Rahman");
		details.fullName("Mizanur", "Rahman");

	}

}
