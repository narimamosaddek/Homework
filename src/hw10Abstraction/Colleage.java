package hw10Abstraction;

public interface Colleage {

	// Declared method below
	public void commonRoom();

	public void laboratory();

	public void languageClub();

	// Default method implemented below (This default is not access modifier)
	public default void dorm() {
	}

	// Static method implemented below
	public static void studyRoom() {
	}

}
