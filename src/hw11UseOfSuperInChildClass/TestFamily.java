package hw11UseOfSuperInChildClass;

    public class TestFamily {

	public static void main(String[] args) {

		// Default constructor initialized here
		Father father = new Father();

		System.out.println("----------------------");

		// Parameterized Constructor initialized here
		Father father2 = new Father("Mir", 50, 'F', false);

		System.out.println("--------------------------");

		// Void type method initialized here
		father2.father();

		System.out.println("----------------------------");

		// parameterized method initialized
		father2.fatherInfo("John", 100, 'F', true);

		System.out.println("-----Default constructor Intialised from the class Daughter-----");

		// Default constructor initialized here
		Daughter daughter = new Daughter();

		System.out.println("-----Parameterised constructor initialized from the class daughter---");

		// Parameterized Constructor initialized here
		Daughter daughter2 = new Daughter("January", 50);

		System.out.println("-----Void type method initialized from the class Daughter");

		// Void type method initialized here
		daughter2.daughter();

		System.out.println("-----Prametereized type method initialized from the class Daughter");

		// parameterized method initialized
		daughter2.daughterInfo("December", 31);

	}

}
