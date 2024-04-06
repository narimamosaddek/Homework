package hw10Abstraction;

/*
 * only one keyword "Extends" we can use to inherit interface 
 * An Interface can inherit more than one Interface (separated by comma) by extends keyword
 * An Interface can't inherit a regular class or an abstract class by extends keyword
 * 
 */

public interface University extends Colleage, Hospital {

	// Declared method below
	public void classSize();

	public void playGround();

	public void teacher();

	// We can't create Default constructor inside Interface
	// public University () {}

	// Default method implemented below (This default is not access modifier)
	public default void gymnasium() {
	}

	// Static method implemented below
	public static void library() {
	}

}
