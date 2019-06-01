package javaLibrary;
/**
 * Polymorphism Demo (Method Overloading)
 * 
 * @author Sangam 
 */
public class PolymorphismDemo {
	
	public int add(int a, int b)
	{
		System.out.println("called two arguments");
		int c=a+b;
		System.out.println("value is " +c);
		return c;
	}
	
	public void add(int a, int b, int c) //changed number of params
	{
		System.out.println("called three arguments");
		int d=a+b+c;
		System.out.println("value is " +d);
		
	}
	public static int add(double a, int b) // change the type of params
	{
		System.out.println("called two arguments");
		double c=a+b;
		System.out.println("value is " +c);
		return (int) c; //type-cast
		
	}
	
	public static int add(int a, double b) // change the type of params
	{
		System.out.println("called two arguments");
		double c=a+b;
		System.out.println("value is " +c);
		return (int) c; //type-cast
		
	}
	
	public String add(String x, String y){ // type change- overload
		return x+" "+y;
		}

}
