package hw13Polymorphism;

/*
 * When several methods stay with the same name, same parameters with different syntax or logic that is called Method overriding
 * child class can override the method of parent class
 */

    public class Niece extends Sister {

	// void type non parameterized method (1) is implemented
	@Override
	public void sister() {
		System.out.println("This is void type method from Niece");
		System.out.println("Method name is same from the parent, but syntax or logic is changed in the method body");
	}
	
	// void type parameterized method (2) implemented
	@Override
	public void sister (int age1, int age2) {
		int total1=age1+age2+1000;
		System.out.println("Total Age from Niece :" + total1);	
	}
	
	// return type parameterized method (3) implemented
	@Override
	public int sister(int age1, int age2, int age3) {
		int total2= age1/2+age2*2+age3+100;
		System.out.println("Total Age from Niece : " + total2);
		return total2;	
	}
	
	// void type parameterized method (4) implemented
	@Override
	public void sister (int age5, String age4, int age6) {
		int total4=age5+Integer.parseInt(age4)+age6/2;
		System.out.println("Total Age from Niece : " + total4);
	}
	
	// return type parameterized method (5) implemented
	@Override
	public int sister(float age7, String age4, int age1) {
		int total7 = (int)age7 + Integer.parseInt(age4) + age1+100;
		System.out.println("Total Age from Niece: " + total7);
		return total7;
	}
	
	// Return type parameterized method which is final and implemented
	// Final type method cannot be Overriden
    // Final keyword doesn't allow any change in method, variable, class
	
	/*
	 * @override
	 * public void sister (int age1, int age2, int age3, int age4) {
		int total6=age1+age2+age3+age4;
		System.out.println("Total Age of Sister: " + total6);
	}
	 */

	// Static method can't override or implemented
	// This below method - sister can't override or implemented
	// because static is a local member method of a class
	// So, static method can't be override, if we remove @override it will be considered as the static method of this Niece class
	/*
	 * public static void sister(int age1, int age2, int age3, int age5, int age6) {
		int total5=age1+age2+age3+age5+age6;
		System.out.println("Total Age of Sister : " +total5);
	}
	 */
	
	
	
	
	
	
}
