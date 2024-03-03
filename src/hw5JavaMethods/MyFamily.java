package hw5JavaMethods;

public class MyFamily {

	public int child1Age = 100;
	public int child2Age = 200;
	protected int child3Age = 300;
	int child4Age = 400;

	public int MyFamily() {
		int sum = child1Age + child2Age + child3Age + child4Age;
		return sum;
	}

	public static void main(String[] args) {

		MyFamily details = new MyFamily();
		int sum = details.MyFamily();
		System.out.println("The sum of my childrens age is: " + sum);
	}

}
