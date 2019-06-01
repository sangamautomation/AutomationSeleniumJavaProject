package javaTests;

import javaLibrary.ConditionsDemo;
/**
 * Conditional Statements Test
 * 
 * @author Sangam 
 */
public class ConditionsTest {

	public static void main(String[] args) {
		// Logic based programs
		ConditionsDemo con= new ConditionsDemo();

		con.min(2, 5);
		con.min(0, -54);
			
		con.max(8, -3);
		int minimum = con.min(2, 3, 4);
		
		con.min(-123, 0, 1829);
		
		int myNumber = minimum + 2; // we utilize the returned value of a function
		System.out.println("My special number = "+ myNumber);

		con.max(23, 34, 44);
		
		//con.max(1.2, 2.3, 3.4); // this throws compile-time error - to rectify this error, either you pass int or create function that would accept double

		ConditionsDemo.maxMinOfNumber(34, 2323);
		ConditionsDemo.maxMinNumbers(134.343, 134.343);
		ConditionsDemo.maxMinNumbers(121212121L, 34343434L);
		ConditionsDemo.maxMinOfNumber(1, 1);
		
		int x[] = {2,3,4,5,6,7,9, 10, 0, -343, 334};
		con.greaterNumberInArray(x);
		
		con.dayOfTheWeek(2); //multiple If's

		con.weekDays(4);//Switch-case
		
		String monthInfo = con.month("August");
		System.out.println(monthInfo);

		con.displayNumbers(150); // Loops (for, while, do-while)
/*
		ConditionsDemo cond= new ConditionsDemo();
		int number1=5, number2=10, number3 = 15;

		cond.min(number1, number2);


		new ConditionsDemo().max(50, 457);//non-static calling

		cond.min(number1, number2, number3);

		new ConditionsDemo().max(15,20,50);
		cond.max(number1, number2, number3);

		int numbers[]={1, 4, 3, 9, 10};
		con.greaterNumberInArray(numbers);
*/	}

}
