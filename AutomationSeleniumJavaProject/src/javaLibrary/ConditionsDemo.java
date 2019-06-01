package javaLibrary;
/**
 * Conditional Statement
 * 
 * @author Sangam 
 */
public class ConditionsDemo {

	// Returns minimum value out of 2 numbers

	public int min(int number1, int number2){
		int minimum;
		if(number1 < number2)
			minimum = number1;
		else
			minimum = number2;
		System.out.println("The minimum of "+number1+ " and "+number2 + " is "+ minimum);
		return minimum;
	}

	// Returns maximum value out of 2 numbers

	public int max(int number1, int number2){
		int maximum;
		if(number1 > number2)
			maximum = number1;
		else
			maximum = number2;
		System.out.println("The maximum of "+number1+ " and "+number2 + " is "+ maximum);
		return maximum;
	}


	// Returns minimum value out of 3 numbers (overloading)

	public int min(int number1, int number2, int number3){
		int minimum;
		if((number1 < number2)  && (number1 < number3))
			minimum = number1;
		else if (number2 < number1 && number2 < number3)
			minimum = number2;
		else
			minimum = number3;
		System.out.println("The minimum of "+number1+ ", "+number2 + " and "+number3 + " is "+ minimum);
		return minimum;
	}

	// Returns maximum value out of 3 numbers

	public int max(int number1, int number2, int number3){
		int maximum;
		if((number1 > number2)  && (number1 > number3))
			maximum = number1;
		else if (number2 > number1 && number2 > number3)
			maximum = number2;
		else
			maximum = number3;
		System.out.println("The maximum of "+number1+ ", "+number2 + " and "+number3 + " is "+ maximum);
		return maximum;
	}
	
	//Home work: Write a function to find min & max of 3 double numbers (decimal part)



	//Maximum & Minimum of 2 numbers

	public static void maxMinOfNumber(int a, int b){

		if(a>b){
			System.out.println("The max number is "+ a);
			System.out.println("The min number is "+ b);
		}
		else if (a == b){
			System.out.println("Both numbers are equal");
		}

		else {
			System.out.println("The max number is "+ b);
			System.out.println("The min number is "+ a);
		}
		System.out.println("=================================\n");
	}



	public static void maxMinNumbers(long a, long b){

		if(a>b){
			System.out.println("The max number is "+ a);
			System.out.println("The min number is "+ b);
		}
		else{
			System.out.println("The max number is "+ b);
			System.out.println("The min number is "+ a);

		}

		System.out.println("=================================\n");

	}

	//Overloading
	public static void maxMinNumbers(double a, double b){

		if(a>b){
			System.out.println("The max number is "+ a);
			System.out.println("The min number is "+ b);
		}
		else if (a==b){
			System.out.println("Both "+ a + " and "+ b + " are equal!");
		}
		else{
			System.out.println("The max number is "+ b);
			System.out.println("The min number is "+ a);

		}

		System.out.println("=================================\n");

	}
	
	// Find  maximum of any given numbers

	public void greaterNumberInArray(int[] x){
		//int y[]={1, 4, 3, 9, 10}; y[0] = 1, y[1] = 4, y[2] = 3, y[3] = 9, y[4] = 10
		int max=Integer.MIN_VALUE; //-234,232
		for (int i = 0; i < x.length; i++) {
			if(x[i]>max)
			{
				max=x[i];
			}


		}
		System.out.println(max);
	}

	
	// Home work: write a function to find minimum of n given numbers in an array

	// SWITCH - CASE 

    
    // Method to print the name of the day by accepting number of the day
    public static void dayOfTheWeek(int day){
          
                      
           if(day==1)
                   System.out.println("Sunday");
            else if(day==2)
                  System.out.println("Monday");
            else if(day==3)
                  System.out.println("Tuesday");
            else if(day==4)
                  System.out.println("Wednesday");
            else if(day==5)
                  System.out.println("thursday");
            else if(day==6)
                  System.out.println("Friday");
            else if (day==7)
                  System.out.println("Saturday");
            else
                  System.out.println("Please enter numbers 1 through 7");
                  
 
        }
            
 
	//Function to display the name of the week if the number of the week is passed
	public void weekDays(int a){

		switch (a) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("MOnday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;

		default:
			System.out.println("PLease enter any number from 1 to 7 only!");
			break;
		}


	}

	//Write a program to display month number when month name is passed as a parameter using switch-case
	public String month (String monthName){

		String output = null;

		switch (monthName) {
		case "January":
			output ="January is the 1st month!";
			break;
		case "February":
			output ="February is the 2nd month!";
			break;
		case "March":
			output ="March is the 3rd month!";
			break;
		case "April":
			output ="April is the 4th month!";
			break;
		case "May":
			output ="May is the 5th month!";
			break;
		case "June":
			output ="June is the 6th month!";
			break;
		case "July":
			output ="July is the 7th month!";
			break;
		case "August":
			output ="August is the 8th month!";
			break;
		case "September":
			output ="September is the 9th month!";
			break;
		case "October":
			output ="October is the 10th month!";
			break;
		case "November":
			output ="November is the 11th month!";
			break;
		case "December":
			output ="December is the 12th month!";
			break;

		default:
			output = "Please enter correct month name with Initial Capital letter!";
			break;
		}
		return output;
	}

	// If within If 
	public void nestedIfs(int a, int b){

		if(a>b){
			System.out.println(" a is greater than b ");
			if(a>=b)
				System.out.println("a is greater than or equala to b");

		}
	}

	//For, While, Do-While  Loop Example
	public void displayNumbers(int maxNumberToDisplayFrom1){

		System.out.println("For loop: Numbers from 1 through maxNumber");
		for (int i =1; i<=maxNumberToDisplayFrom1 ; i++)
			System.out.println(i);
		
		System.out.println("---------------------------------------");

		System.out.println("While Loop:  Numbers from 100 (skip one number in between) till maxnumber");
		int j = 100;
		while (j<=maxNumberToDisplayFrom1) {
			System.out.println(j);	
			j = j+2;	
		}
		
		System.out.println("---------------------------------------");
		
		System.out.println("Do-While loop : print numbers from 500 backward");

		int k = 500; 
		do {
			System.out.println(k);
			k--;
		} while (k>=-500);

	}




}
