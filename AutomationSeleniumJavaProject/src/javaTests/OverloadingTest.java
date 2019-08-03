package javaTests;
import javaLibrary.PolymorphismDemo;

/**
 * Polymorphism Test :: Overloading means redefining same function (name) by changing its signature (no of arguments/ type of args/  list of args / return type )
 * 
 * @author Sangam 
 */
public class OverloadingTest {

	public static void main(String[] args) {

		//Instantiation

		PolymorphismDemo poly = new PolymorphismDemo();
		poly.add(1, 2);
		new PolymorphismDemo().add(1, 2, 3);
		PolymorphismDemo.add(1.2, 2);	
		PolymorphismDemo.add(2121, 33423.343);

		System.out.println("The name is "+ new PolymorphismDemo().add("John", "Adams"));
		
	}

}
