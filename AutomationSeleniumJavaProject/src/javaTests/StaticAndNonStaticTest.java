package javaTests;

import javaLibrary.NonStaticDemo;
import javaLibrary.StaticDemo;
/**
 * Static & Non-Static Test
 * 
 * @author Sangam 
 */
public class StaticAndNonStaticTest {


	public static void main(String[] args) {

		//Instantiation / Object creating

		StaticDemo sc = new StaticDemo();
		StaticDemo sc2 = new StaticDemo();

		NonStaticDemo nsc = new NonStaticDemo();
		
		
		//STATIC
		
		// Static method can be accessed in a static way (using class name)-OK

		StaticDemo.myStaticMethod(); // *Ideal way - OK
		
		// Static method can be accessed in a non-static way (using instance name)-OK

		sc.myStaticMethod(); //*Possible but a non-ideal way - OK
		String x = sc2.justANonStaticMethod("non", "static");
		
		System.out.println("This is a "+ x +" function!");
		
		//NON-STATIC
		
		// Non-static method can be accessed in non-static way - OK

		nsc.myNonStaticMethod(); //*Ideal way - OK

		// Non-static method cannot be accessed in a static way - Not OK

		//NonStaticClass.myNonStaticMethod(); //Not allowed















	}

}
