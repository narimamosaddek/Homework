package hw5JavaMethods;

public class MyFamily {

//initializing some int type variables
	public int child1Age = 100;
	protected int child2Age = 200;
	int child3Age = 300;
	public int child4Age = 400;

	//Implemented a return type method below-
	public int myFamily() {
		int sum = child1Age + child2Age + child3Age + child4Age;
		System.out.println("The sum of my childrens age is:" + sum);
		return sum;
	}

//Created Main method & Instantiated the class, also called the method by the object below-
	public static void main(String[] args) {
		MyFamily details = new MyFamily();
		details.myFamily();

	}

}
