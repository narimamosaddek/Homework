package hw3JavaVariablesDeclared;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe narima = new AboutMe(); // constructor initialized
		narima.myName = "Narima Mosaddek"; // variable initialized
		narima.myPhoneNumber = 12345667;
		narima.myHeight = 5.456f;
		narima.myGender = 'F';
		narima.fullTimeStudent = true;
		narima.myAccountNumber = 9172851209l;
		narima.myPhoneBill = 115;
		narima.myHouseRent = 15730;
		narima.myCgpa = 4.980;
		narima.aboutMe(); // method initialized

		System.out.println("------------------");

		AboutMe alex = new AboutMe();
		alex.myName = "Alex Mathew";
		alex.myPhoneNumber = 928374698;
		alex.myHeight = 5.11f;
		alex.myGender = 'M';
		alex.fullTimeStudent = true;
		alex.myAccountNumber = 9375768373646l;
		alex.myPhoneBill = 112;
		alex.myHouseRent = 25000;
		alex.myCgpa = 3.90;
		alex.aboutMe();

	}

}
