package hw13Polymorphism;

//when several methods stay with the same name in same class but with different parameters or signature that's called method overloading

public class Sister {

	// void type non parameterized method (1) is implemented
	public void sister () {
		System.out.println("This is void type method from Sister");
	}
	
	// void type parameterized method (2) implemented
	public void sister (int age1, int age2) {
		int total1=age1+age2;
		System.out.println("Total Age of Sister :" + total1);	
	}

	// return type parameterized method (3) implemented
	public int sister(int age1, int age2, int age3) {
		int total2= age1+age2+age3;
		System.out.println("Total Age of Sister : " + total2);
		return total2;	
	}
		
	// void type parameterized method (4) implemented
	public void sister (int age5, String age4, int age6) {
		int total4=age5+Integer.parseInt(age4)+age6;
		System.out.println("Total Age of Sister : " + total4);
	}
	
	// Static type Method (5) implemented
	public static void sister(int age1, int age2, int age3, int age5, int age6) {
		int total5=age1+age2+age3+age5+age6;
		System.out.println("Total Age of Sister : " +total5);
	}
	
	// Void type parameterized method (6) which is final type and implemented
	public final void sister (int age1, int age2, int age3, int age4) {
		int total6=age1+age2+age3+age4;
		System.out.println("Total Age of Sister: " + total6);
	}
	
	// return type parameterized method (7) implemented
		public int sister(float age7, String age4, int age1) {
			int total7 = (int)age7 + Integer.parseInt(age4) + age1;
			System.out.println("Total Age of Sister: " + total7);
			return total7;
		}
	
}
