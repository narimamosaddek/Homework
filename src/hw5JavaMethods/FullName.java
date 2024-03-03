package hw5JavaMethods;

public class FullName {

	public String FullName(String fName, String lName) {
		System.out.println("Family Member: " + fName + " " + lName);
		return "fullName";
	}

	public static void main(String[] args) {
		FullName details1 = new FullName();
		details1.FullName("Narima", "Mosaddek");
		details1.FullName("ABC", "XYZ");
		details1.FullName("Tushty", "Rahman");
		details1.FullName("Mizanur", "Rahman");

	}

}
