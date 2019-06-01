package javaTests;
/**
 * Exception Handling Test
 * 
 * @author Sangam 
 */
public class ExceptionHandlingTest {

	public static void divide(int x, int y)
	{
		System.out.println("The quotient = " + (x/y)); // + means concatenation of two different data types / when there is a string involved 
	}

	public static void main(String[] args) {


		try {
			divide(6, 2);	

		} catch (Exception e) {

			e.printStackTrace();
			throw e; //abort
		}



		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		try
		{
			System.out.println("Try block:");
			divide(4, 0);

		}
		catch(Exception e)
		{
			System.out.println("Catch block:");

			e.printStackTrace(); // Not throwing
			System.out.println(e.toString());
			throw e; //throwing

		}

		finally{ //this will be executed at any cost
			System.out.println("Finally block:");

		}

		System.out.println("After finally block...");




		// Multiple try - catch

		try {
		
		}catch (ArrayIndexOutOfBoundsException e1) {

		}catch (Exception e2) {

		}


	}


}
