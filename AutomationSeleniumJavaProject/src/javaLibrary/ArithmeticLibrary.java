
package javaLibrary;

public class ArithmeticLibrary {
	
	
	
	
	int  age = 11 ; 
	String name = "John";
	String gender = "Male";

	//Default Constructor (Automatically executed as an when the class in instantiated)

	public ArithmeticLibrary(){
		
		this.age = 30;
		this.name = "Jacob";
		this.gender = "Male";
		
		System.out.println("This is a default constructor!");
		System.out.println("Age = "+ this.age);
		System.out.println("Name = "+ this.name);
		System.out.println("Gender = "+ this.gender);
		
		
		System.out.println(" ----------------------------------------------------------------- \n ");
	}
	
	// Parameterized Constructor (this is used to pass any sets of values)
	
	public ArithmeticLibrary(int age, String name, String gender){
	    this.age = age;
	    this.name = name;
	    this.gender = gender;

		System.out.println("This is a Parameterized constructor!");
		System.out.println("Age = "+ this.age);
		System.out.println("Name = "+ this.name);
		System.out.println("Gender = "+this.gender);

	}



	// Addition

	public static void addition (int a, int b) {

		int c = a + b;

		System.out.println(" The sum of two numbers = "+c );

	}


	// Subtraction

	public void subtraction (int c, int d) {

		int a = c-d;

		System.out.println(" The difference of two numbers = " + a);

	}


	// Multiplication


	public void muiltiplication (int e, int f) {  // signature

		int g = e * f;                            // definition

		System.out.println("The product of two numbers = "+ g);

	}



	//Division


	public void division (int a, int b) {

		int quotient = a / b;

		System.out.println(" The quotient when a is divided by b = "+ quotient);

	}

	public void division (double a, double b) {

		double result = a / b;

		System.out.println(" The quotient when a is divided by b = "+ result);

	}
	
	
	// User-defined functions

	// Addition

	public int add(int a, int b){

		int c = a + b; 
		System.out.println("The sum of "+ a + " and "+b + " = "+c);
		return c;

	}




	// Difference

	public int subtract(int a, int b){

		int c = a - b; 
		c = Math.abs(c); //Built-in function
		System.out.println("The absolute difference of "+ a + " and "+b + " = "+c);
		return c;

	}
	
	//Built-in functions
	
	public void builtin(double x){
		double y = Math.sqrt(x);
		double z = Math.pow(2, 5);
		double p = Math.max(232.2, 492.7);
		System.out.println("The square root = "+ y);
		System.out.println(" 2 raised to the power of 5 "+ z);
		System.out.println("Max = "+ p);
	}

	// Product

	public int product ( int a, int b){
		int c = a*b;
		System.out.println("The product of "+a + " and "+ b + " = "+ c);
		return c;
	}


	// Division

	public int divide ( int a, int b){
		int c = a/b;
		System.out.println("The integral part of quotient when "+a + " is divided by "+ b + " = "+ c);
		return c; // Return statement is mandatory and should be the last statement in the function
		
	}


	
	// Polymorphism (Overloading)
	public double divide(double m, double n)
	{
		double quotient;
		quotient=m/n;
		System.out.println("The exact result of dividing "+ m +" and "+ n +" is "+ quotient);
		return quotient;
	}

	// Function to accept individual part of a name and age and print a sentense
	
	//Static function

	public static int moduloOfNumbers (int a, int b){
		System.out.println("Remainder of two numbers when they are divided in that order = "+a%b);

		return a%b;
	}

	// Multiplication Table

	
  /* 7 * 1 = 7
     7 * 2 = 14
     ........     
     7 * 10 = 70*/
     
	public void multiTable(int n)
	{
		System.out.println(" \n ############### MULTIPLICATION TABLE ##############");

		/*FOR syntax:
		 * for (int i = 0; i < array.length; i++) {
			
			
		}*/
		
		
		for(int i=1;i<=20;i=i+1)
		{
			System.out.println(n + " * " + i+" = " +(n*i));  // 8 * 2 = 16 
		}
	}
	
	
	// Write a function to display even numbers till specified limit
	public void evenNumbers(int maxEvenNumber) {
		System.out.println("Even Numbers :: ");
		for(int i = 2; i<= maxEvenNumber ; i=i+2) {
			System.out.print(i + ", ");

		}
	}
	
	// HomeWork :: Write a function to display odd numbers till a specified limit
	

	//Multiple multiplication tables
	public void multiTable(int maxNumberForTable, int tableLines)
	{
		System.out.println(" /n ****************Multiplication Table of Tables ****************** /n");
		for(int i=1;i<=maxNumberForTable;i++)
		{
			for (int j=1;j<=tableLines;j++)
			{ 
				System.out.print(i*j+", ");
			}
			System.out.println();    
		}

	}

	// Conditional Statements (if-else if - else)
	
	//WAP for displaying difference of two numbers absolutely using if-else condition
	public static int subtraction2(int x, int y)
	{
		int diff;
		if (x>y)
			diff=x-y;
		else // y>x
			diff=y-x; 


		System.out.println("the difference of two numbers is "  +diff);
		return diff;


	}

	public static int min(int x, int y){

		if(x<y)
			return x;
		else
			return y;

	}

	//WAP to calculate the perimeter of a triangle give the sizes of all sides

	public static double perimeterOfTriangle(double a, double b, double c)
	{
		double perimeter=a+b+c;
		System.out.println("the value of the perimeter of Triangle is:" +perimeter);
		return perimeter;

	}
	
	
	// WAP to calculate perimeter of rectangle
	public static int perimeterOfRectangle(int l, int w)
	{
		int perimeter= 2*(l+w);
		System.out.println("the value of the perimeter of rectangle is:" +perimeter);
		return perimeter;

	}
	
	//HomeWork: WAP to calculate the circumference of a circle
	
//Conditional statement if-elseIf-else (print 'DingDong' if a number is divisible by 3 & 5, print 'Ding' if a number is divided by 3 only, print 'Dong' if a number is divded by 5 only, print the number itself if it's not divisible by 3 & 5 
//	Repeatedly check from 1 till max number 
	
	public static void display(int maxnum){
		for (int i=1; i<=maxnum; i++){
			if(i%3==0 && i%5==0)
				System.out.println("DingDong");
			else if(i%3==0)
				System.out.println("Ding");
			else if(i%5==0)
				System.out.println("Dong");

			else System.out.println("The number "+i+" is not divisible by 3 & 5!");
		}
	}

	public void numbersDisplay()
	{      
		int n,times=100;

		System.out.print("Displaying numbers 1 through 100: \n");
		for(n=1;n<=times;n++)
		{

			System.out.print(n+",");

		}  
		System.out.println("\n -------------------------------------------------------- \n ");
	}
	
	// String manipulations
	
	public void numberOfCharactersInString(String name) {
		int numberOfChars = name.length();
		
		System.out.println("The length of the string: "+ name + " = "+numberOfChars );
	}
	

	/*	Write a java program which will count the number 
		of vowels, consonants, digits, tabs and blank spaces from 
		a string */

	public static void countLetters(String x){
		int vowels = 0;
		int nonVowels = 0;

		System.out.println("Length of sentence is "+ x.length());

		x=x.toLowerCase();
		for(int i=0; i<x.length(); i++){
			char ch = x.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
				vowels= vowels +1;
			else 
				nonVowels++;
		}


		System.out.println("vowels = "+vowels);
		System.out.println("Non-Vovels (Consonants + Spl chars) = "+nonVowels);



	}

	public double simpleInterest(double principal, double rate, double time)
	{
		// Initialize instance variables
		// int p=1000,r=8,t=2;
		double value;     
		value=(principal*rate*time)/100;
		System.out.println("The rate of interest is " +value);
		return value;
	}

	// Swapping
	public void swap(int a, int b)
	{
		int x, y, t;
		x=a;
		y=b;
		System.out.println("Original values of a and b are " +x+ " and " +y);

		t=y;
		y=x;
		x=t;
		System.out.println("values of a and b after swapping are " +x+" and " +y);
	}

	
	public static void main (String args[]) {
		addition(1, 2);
	}
	
}

