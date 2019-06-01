package javaTests;

import java.util.Iterator;

/**
 * Array Test
 * 
 * @author Sangam 
 */
public class ArrayTest
{
	public static void main(String[] args)
	{

		//Integer array of 1-Dimension
		// Array initialization
		int b = 7;

		//Integer array is a variable that holds set of integers
		//Declare and initialize array
		int[] c = {10, 20, 30, 40, 50};

		int[] x1 = new int[5];
		x1[0] = 2;
		x1[2] = 0;
		x1[3]= 25;
		x1[4] = 44;



		for(int i=0;i<=c.length-1;i++)
			System.out.println(c[i]);

		System.out.println("------------------------------");

		for(int i=0;i<=x1.length-1;i++)
			System.out.println(x1[i]);

		System.out.println("------------------------------");

		for (int i : x1 )
			System.out.println(i);


		System.out.println("------------------------------");


		double[] d = {1.2, 3.4, 5.6};
		char[] c1 = {'a','b', '1','$','a'};
		short s1[] = {1,23,45};
		long[] l1 = {3343L, 232L};
		float[] f1 = {232f, 3435f};
		byte[] b2 = {23, 34};



		System.out.println("------------------------------");


		String name1 = "John";

		String[] namez = new String [5];


		namez[0] = "abc";
		namez [1] = "def";
		namez [3]= "xyz";


		for(String j: namez)
			System.out.println(j);

		for (int i = 0; i < namez.length; i++) {
			System.out.println(namez[i]);

		}








		// Sum of all values in integer array

		int sum=0;
		int a[] = {5,10,2,1,5};



		for(int counter=0;counter<a.length;counter++)
		{
			sum=sum+a[counter];

		}

		System.out.println("The sum of total numbers is " +sum);



		// WAP to calculate the sum of all values in an int array 

		int sum1 = 0;
		int ss1[] = {2,9,10,12};
		for (int i : ss1) {
			sum1 = sum1 +i;
		}

		System.out.println("Final sum = "+ sum1);

		// WAP to calculate the sum of all values in an int array except last value

		int sum2 = 0;
		int ss2[] = {2,9,10,12};


		for (int i = 0; i < ss2.length-1; i++) {
			sum2 = sum2 + ss2[i];
		}

		System.out.println("Final sum = "+ sum2);



		// Product of all values in int array

		int[] xxx = {1,2,3,4,5,6};
		int product = 1;

		for (int i = 0; i<=xxx.length-1; i++) {
			product = product * xxx[i];
		}
		System.out.println("The product of all numbers = "+product);




		// String Array of 2 -Diminsions




		//String names[][]=new String[2][2];
		String[] [] names={{"Madhu","Siri"},{"Sangam","Ya"}};

		names[0][0]="Madhu";
		names[0][1]="Siri";
		names[1][0]="Sangam";
		names[1][1]="Ya";

		System.out.println("Lenght of this 2D array = "+ names.length);


		for(int i=0;i<names.length;i++) //row
		{
			for(int j=0;j<names.length;j++) //column
			{	
				System.out.print(names[i][j]);
				System.out.print(" ");
			}
			System.out.println();		  

		}



		// More examples of arrays

		String name[]={"abc","def","zyz"};
		System.out.println("the length of array is " +name.length); //3
		System.out.println("the value in second array is " +name[1]);//def

		// WAP to print value from a mxn-dimensional integer array by segregating each value in a line with a comma and take new line after each row
		//10x10 matrix
		int x[][] =new int[3][3];
		x[0][0] = 2;
		x[0][1] = 3;
		x[0][2] = 5;
		//x[0][3] = 6;
		x[1][0] = 2;
		x[1][1] = 8;
		x[1][2] = 9;

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				System.out.print(x[i][j]);
				System.out.print(",");
			}
			System.out.println();
		}




		int z[][] = {{1,2},{3,4}};

		for (int i = 0; i < z.length; i++) {
			for (int k = 0; k < z.length; k++) {
				System.out.print(z[i][k]);
				System.out.print(" ");

			}
			System.out.println();
		}

		System.out.println("exit loop");


		//Homework: WAP to print multiplication table for n using 2-d array and using 2 for loops

	}

}

