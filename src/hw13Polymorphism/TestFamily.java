package hw13Polymorphism;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("------Sister-------");
		Sister sister=new Sister(); 
		sister.sister(); // void type method -01 initialized
		sister.sister(25, 25);  // void type parameterized method -02 initialized
		sister.sister(25, 25, 10); // return type parameterized method -03 initialized
		sister.sister(25, "25", 10); // void type parameterized method -04 initialized
		Sister.sister(25, 25, 10, 5, 10); // void type parameterized method -05 initialized
		sister.sister( 25, 25, 10, 5); // void type parameterized method -06 initialized
		sister.sister(5.248f, "25", 25); // return type parameterized method -07 initialized
		
		
		System.out.println("\n-----------Niece-----------");
		
		Niece niece = new Niece(); 
		niece.sister(); // void type method -01 initialized
		niece.sister(25, 25); // void type parameterized method -02 initialized
		niece.sister(25, 25, 10); // return type parameterized method -03 initialized
		niece.sister(25, "25",10); //void type parameterized method -04 initialized
		niece.sister(5.248f,"25", 25); // return type parameterized method -05 initialized
		
					
	}
	
	
		
}
