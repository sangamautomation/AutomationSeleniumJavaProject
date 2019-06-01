package javaTests;

import javaLibrary.OverridingChildClassDemo;
import javaLibrary.OverridingParentClassDemo;

public class OverridingTest {

	public static void main(String[] args) {

		//Instantiation
		OverridingChildClassDemo obj = new OverridingChildClassDemo(); // Access all methods (child & parent) *Inheritance & overriding
		OverridingParentClassDemo obj2 = new OverridingChildClassDemo(); //Access only parent class (Selenium ex)
		//OverridingChildClassDemo obj3 =  new OverridingParentClassDemo(); //Illegal as child cannot hold parent
		OverridingParentClassDemo obj4 = new OverridingParentClassDemo(); // Access only parent class methods

		//This is an example of Inheritence & Overriding
		obj.showThis();//child class method
		obj.add(); //child class overrides parent method //Overriding
		obj.sub();//Inheritence : Parent class
		obj.mul(); //Child class method
		obj.div(); //Child class method
		obj.add(1, 2); //Overriding : child class method

		obj2.setup();
		obj2.add(); //Overriding

		// Not an example of Inheritence & Overriding
		obj4.sub();
		obj4.add(); // using obj4 which is parent class instance, will only access parent class methods, and there is no overriding here
		obj4.add(99, 88); // using obj4 which is parent class instance, will only access parent class methods, and there is no overriding here


		/*
		 WebDriver driver1 = new ChromeDriver();
         WebDriver driver2 = new FirefoxDriver();

         get(){
         }

		 */
	}

}
