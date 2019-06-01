package javaTests;
/**
 * Loops Test
 * 
 * @author Sangam 
 */
public class LoopsTest
{

	public static void main(String []args)
	{
		// initialise instance variables
		// System.out.println("Argument passing "+ args[0]);
		//     System.out.println("Argument passing "+ args[1]);
		//    System.out.println("Argument passing length "+ args.length);
		//  j=String.valueOf(args[0]);
		int j = 20;
		//  j=Integer.parseInt(args[0]);
		System.out.println("Numbers from 1 through "+ j + " are: "); 

		//For Loop
		// Print the numbers from 1 to n where n is passed as an argument

		for(int i=1;i<=j;i++)
		{

			//  System.out.print(i +", ");
			System.out.println(i);


		}


		// While Loop
		int i = 1;//initialization
		System.out.println("multiples of 2:");
		while (2*i <= 100) {

			System.out.println(2*i);

			i=i+1;//increment

		}



		//Do-While Loop
		int k = 3;
		do {
			System.out.println(3*k);
			k++;
		} while (3*k<50);


	}


}
