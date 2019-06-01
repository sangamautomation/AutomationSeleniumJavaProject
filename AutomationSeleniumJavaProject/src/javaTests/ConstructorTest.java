package javaTests;

import javaLibrary.ConstructorDemo;
/**
 * Constructor Test
 * 
 * @author Sangam 
 */
public class ConstructorTest {

	public static void main(String[] args) {

		//Default Constructor Call at the time of instantiation

		ConstructorDemo c = new ConstructorDemo();
		c.display();

		//Param Constructor Call

		ConstructorDemo c1 = new ConstructorDemo("Sangam", "E", "Yad", 35, 60000.58);
		c1.display();
		ConstructorDemo c2 = new ConstructorDemo("MD", "Sharfu", "Molla", 32, 120000.00);
		c2.display();

		// Setter Call

		c1.setMiddleName("Esh");
		c1.display();

		//Getter Call
		System.out.println("My changed middle name is : "+ c1.getMiddleName());

		int incomeOfMolla = (int) c2.getIncome();
		System.out.println("The old income of molla is "+incomeOfMolla);
		c2.setIncome(150000.0);
		System.out.println("The updated income of molla is "+ c2.getIncome());
		
	}

}
