package hw6JavaWrapperAndCasting;

public class FullName {

	// Implemented a String return type parameterized method below-
	public String fullName(int fName, int lName) {
		System.out.println("Family Member: " + fName + " " + lName);
		return null;
	}
	//int return type parameterized method
	public int salary (String januarySalary, double februarySalary) {
		System.out.println("Average Salary: " + (Integer.parseInt(januarySalary )+ (int)februarySalary)/2);
		return 0;
		
	}

	// Created Main method & Instantiated the class below-
	public static void main(String[] args) {
		FullName details = new FullName();

	// I can call the method multiple times
		details.salary("10", 20.59);
		details.salary("20", 31.50);
		
		
		

	}

}
