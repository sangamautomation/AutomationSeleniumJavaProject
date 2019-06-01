package javaLibrary;
/**
 * Inheritance - Overriding - Child class methods take precedence over parent class methods
 * 
 * @author Sangam 
 */

public class OverridingChildClassDemo extends OverridingParentClassDemo {

	int p,q;

	public void showThis(){
		p=4;
		q=6;
		System.out.println("Child class - "+" p = "+p +", q = "+q +" !");
	}


	// Overriding 
	public void add(){

		System.out.println("Child class - Overriding : Child method overrides parent method");
	}

	//Overriding 
	public int  add(int a, int b){


		System.out.println("Overriding : Child class - The sum = "+(x+y));
		return x+y;

	}


	public void mul(){
		System.out.println("Child class - mul");


	}


	public void div(){
		System.out.println("Child class - div");


	}




}
