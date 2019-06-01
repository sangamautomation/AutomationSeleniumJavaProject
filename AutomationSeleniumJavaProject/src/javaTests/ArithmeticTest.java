package javaTests;

import javaLibrary.ArithmeticLibrary;

// Create functions or methods for writing basic arithmetic operation (+-*/%)

public class ArithmeticTest {


	public static void main(String[] args) {

		//Instantiation / Default constructor / Param constructor

		ArithmeticLibrary al = new ArithmeticLibrary(); // Instantiation (using al, I can access all variables & methods of that class)

		ArithmeticLibrary obj = new ArithmeticLibrary(); //copy 1 
		//	ArithmeticLibrary obj2 = new ArithmeticLibrary(20,"Kathy","Female"); //copy 2


		
		//Calling void functions

		al.addition(10, 8); // Calling a function using instance of a class


		al.subtraction(20, 10);

		al.muiltiplication(4, 5);

		al.division(3, 2);  // 1
		al.division(0,4); //0
		//	al.division(8, 0); // undefined ( infinity )
		al.division(2.5, 1.5);
		al.division(3.0, 2.0);//1.5

		//Calling returnable functions

		//Addition
		System.out.println("\n ################# Addition ############## \n");

		int sum = obj.add(3, 6);
		System.out.println("The twice the sum = "+sum*2);


		obj.add(1, 3);
		obj.add(12121, 1212123);
		obj.add(0, 2312312);
		obj.add(34324234, 1312312);
		obj.add(-123123, 3423423);
		obj.add(-3233424, -34345345);

		//Difference
		System.out.println("\n ################# Subtraction ############## \n");

		obj.subtract(5, 6);
		obj.subtract(23232, 3434);
		obj.subtract(2232, 3434234);
		obj.subtract(0, 343);
		obj.subtract(-334, -343);

		obj.builtin(454353.454);


		//Product

		System.out.println("\n ################# Product ############## \n");

		int product = obj.product(8, 9);
		obj.product(1, 3);
		obj.product(3, 6);
		obj.product(343, 3434);
		obj.product(232, -3434);
		obj.product(-343, -3434);
		obj.product(0, 3434);


		//Division

		System.out.println("\n ################# Division ############## \n");

		obj.divide(4, 6);
		obj.divide(344234, 34);
		obj.divide(232, 12);
		obj.divide(121, - 43);
		obj.divide(0,23);
		//obj.divide(343, 0); // Run time exception


		//Overloading method
		obj.divide(16.3, 2.4);




		//Multiplication Table
		obj.multiTable(5);

		//Even Numbers
		obj.evenNumbers(100);


		 
		obj.multiTable(20, 10); // Non-Static method - Multiplication table of tables 

		int difference = ArithmeticLibrary.subtraction2(5, 9); // Static way of calling



		//------------------------------------------------

		//Static calling (by class name)


		int remainder =	ArithmeticLibrary.moduloOfNumbers(28,3);
		System.out.println("Remainder = "+remainder);

		// Static calling (by instance name)
		int r = obj.moduloOfNumbers(44454, -2323);
		System.out.println("Remainder = "+ r);


		//Minimum of two numbers
		int min = ArithmeticLibrary.min(-4743, -342); //Static way of calling
		System.out.println("Mininum number is = "+min);



		//Perimeter of a triangle

		ArithmeticLibrary.perimeterOfTriangle(2.3, 3.4, 4.5);
		ArithmeticLibrary.perimeterOfRectangle(5, 6);




		obj.numbersDisplay();

		String x = "A quick brown fox jumps over the lazy dog";
		obj.perimeterOfTriangle(5, 7, 11);
		obj.perimeterOfRectangle(9, 13);
		obj.subtraction (30, 50);
		obj.display(50);
		obj.numbersDisplay();


		// String Manipulations

		obj.numberOfCharactersInString("Java Programming!");
			obj.countLetters(x);



	try {
		obj.simpleInterest(1000.50, 4.8, 5.5);
	} catch (Exception e) {
		e.printStackTrace();
	}

	obj.swap(2, 4);

		 
	}

}
