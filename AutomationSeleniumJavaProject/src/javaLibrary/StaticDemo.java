package javaLibrary;
/**
 * Static Demo
 * 
 * @author Sangam 
 */
public class StaticDemo {
	public static void myStaticMethod(){
		System.out.println("myStaticMethod");

	}
	
	public String justANonStaticMethod(String x, String y) {
		
		System.out.println("just a non static method "+x + y);
	
		return x+y; //the return statement must be the last one

	}
	
}
