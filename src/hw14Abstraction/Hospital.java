package hw14Abstraction;

public interface Hospital {

	// Declared method below
	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();

	// Default method implemented below (This default is not access modifier)
	public default void morgue() {
	}

	// Static method implemented below
	public static void pharmacy() {

	}

}
