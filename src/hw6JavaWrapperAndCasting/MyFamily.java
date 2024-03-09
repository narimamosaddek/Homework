package hw6JavaWrapperAndCasting;

public class MyFamily {

//initializing  int,float,double type variables below-
	public float child1Age = 10.5f;
	protected int child2Age = 200;
	double child3Age = 30.25;
	public int child4Age = 400;

//Implemented a return type method below-
	public int myFamily() {
		int sum = (int) (child1Age + child2Age + child3Age + child4Age); //
		System.out.println("The sum of my childrens age is:" + sum);
		return sum;
	}

//Created Main method & Instantiated the class, also called the method by the object below-
	public static void main(String[] args) {
		MyFamily details = new MyFamily();
		details.myFamily();

	}

}
