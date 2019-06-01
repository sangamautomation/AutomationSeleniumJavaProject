package javaTests;
import javaLibrary.PolymorphismDemo;

/**
 * Polymorphism Test :: Overloading means redefining same function (name) by changing its signature (no of arguments/ type of args/  list of args / return type )
 * 
 * @author Sangam 
 */
public class OverloadingTest {
	
	//The below two functions are overloaded functions	

	public static void show(){
		System.out.println("Show this!");
	}
	
	public static void show2(){
		System.out.println("Show this!");
	}

	public static void show (String name){
		System.out.println("Show "+name+ "!");
	}

	public static void addNumbers(int a, int b){
		System.out.println(a+b);
	}
	
	public static void addNumbers(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public static int addNumbers(int a, int b, int c, int d) {
		return a+b+c+d;
		
	}
	private static double addNumbers (int a, double b) {
		return a+b;
		
	}
	 	

	private static String addNumbers(String x, String y){
		return x+" "+y;
	}

	public static void main(String[] args) {
		
		//Instantiation
		
		PolymorphismDemo poly = new PolymorphismDemo();
		poly.add(1, 2);
		new PolymorphismDemo().add(1, 2, 3);
		PolymorphismDemo.add(1.2, 2);	
		PolymorphismDemo.add(2121, 33423.343);
		 
		System.out.println("The name is "+ new PolymorphismDemo().add("John", "Adams"));

		show();	
		show("John");

		addNumbers(2,3);
		addNumbers(2, 3, 4);
		/*addNumbers(2,3,4);
int sum = addNumbers(1,2,3,4);
double sumOfNumbers = addNumbers(2, 3.4);*/
		String concatenatedString = addNumbers("john", "doe");
		System.out.println("concatenated string = "+"Welcome "+concatenatedString+"!");

	}

}
