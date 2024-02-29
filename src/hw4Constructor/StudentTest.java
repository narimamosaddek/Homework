package hw4Constructor;

public class StudentTest {

	public static void main(String[] args) {
		// Default Constructor initialized here
		Student student = new Student();

		// Parameterized Constructor initialized here
		Student student1 = new Student("Narima", 100, 'F', true, 4.9f);
		Student student2 = new Student("Geogre", 200, 'M', true, 5.00f);
		Student student3 = new Student("Noah", 300, 'M', true, 4.0f);
		Student student4 = new Student("Jasmin", 400, 'F', false, 4.56f);
		Student student5 = new Student("John", 500, 'M', false, 3.78f);

	}

}
