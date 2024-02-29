package hw4Constructor;

public class Student {

	// some variables declared here-
	public String stName;
	public int stID;
	public char gender;
	public boolean isProgrammer;
	public float grade;

//Declared the Default constructor here-
	public Student() {
		System.out.println("This is all about Student");
	}

	// Declared parameterized constructor here-
	public Student(String stName, int stID, char gender, boolean isProgrammer, float grade) {
		this.stName = stName;
		this.stID = stID;
		this.gender = gender;
		this.isProgrammer = isProgrammer;
		this.grade = grade;
		System.out.println("Student Name :" + stName + ",Student ID :" + stID + ",Gender :" + gender
				+ ",Is Programmer :" + isProgrammer + ",Grade :" + grade);

	}

	
	
		
	
}
