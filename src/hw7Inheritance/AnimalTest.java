package hw7Inheritance;

public class AnimalTest {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.animalInfo();
		
		System.out.println("\n------------------------------------");
		
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo(); // Mammal extends Animal
		
		System.out.println("\n------------------------------------");
		
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo(); //Reptile extends Animal
		
		System.out.println("\n------------------------------------");
		
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo(); // Birds extends Animal
		
		System.out.println("\n------------------------------------");
		
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo(); // Dog extends Mammal, Mammal extends Animal

		
		System.out.println("\n------------------------------------");
		
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo(); // Snake extends Reptile, Reptile extends Animal
		
		System.out.println("\n------------------------------------");
		
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo(); // Robin extends Birds, Birds extends Animal
		
		
		System.out.println("\n------------------------------------");
		
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();
		// BullDog extends Dog, Dog extends Mammal, Dog extends Mammal, Mammal extends Animal
		
		System.out.println("\n------------------------------------");
		
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();
		// Here Cobra extends Snake, Snake extends Reptile, Reptile extends Animal 
		// Multilevel Inheritance 
		
		//Mammal extends animal, Reptile extends Animal, Birds extends Animal, this is Hierarchical inheritance 
	}

}
