package javaTests;

// Program to declare variables of different data types and assign values to them and print them to console

public class DataTypes {

	public static void main(String[] args) {

		//Variable Declarations
		byte byteVar = -128; //default = 0
		short shortVariable = -3300; //default = 0
		int integerVar = -2147483648; //default = 0
		long longVariable = 9000000000L; //Suffix with L for long //default = 0
		float floatVariable = 260000000f ; //Suffix with f for float //default = 0 
		double doubleVariable = 23323342347657656.868; //default = 0
		char chararacterVariable = 'b'; //default = null
		String stringVariable = "This is a #1 Java session!"; //default = null
		boolean flag = true; //default = false

		//Code Logic
		System.out.println("byte value = " + byteVar);
		System.out.println("short value = " + shortVariable);
		System.out.println("integer value = "+ integerVar);
		System.out.println("long value = "+ longVariable);
		System.out.println("float value = "+floatVariable);
		System.out.println("double value = "+doubleVariable);
		System.out.println("char value = "+ chararacterVariable);
		System.out.println("String value = "+ stringVariable);
		System.out.println("boolean value = "+ flag);


	}

}
