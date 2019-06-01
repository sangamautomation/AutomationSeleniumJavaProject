package javaTests;
/**
 * String Test
 * 
 * @author Sangam 
 */
public class StringManipulationsTest {

	public static void StringConcatenation(String fn, String mn, String ln, int age){
		
		System.out.println(fn + " "+ mn + " "+ ln + "'s age is "+ age +" years!");
		//FirstName MiddleName LastName's age is 23 years!
	}


	public static void main(String[] args) {
		System.out.println("------String Manipulations--------------------------");

		//Cancatenate
		StringConcatenation("Molla", "Shah", "MD", 30);

		//Trim
		String x  = "        John Doe Robertson "; //Delimiter = <space>


		//Length of the string
		 int lenghOfString = x.length();


		System.out.println("The lengh of the string " + x + " = " + lenghOfString); // + Concatenation Operator
		System.out.println("The trimmed string_" + x.trim()+"_");
	  
		//Substring
		x = "Java Tutorial";
		x.substring(5);
		
		System.out.println("The Substring starting from index 5="+ x.substring(5));
		System.out.println("The Substring starting from index 5 & ending at 7="+ x.substring(5, 8));
		
		//Character at position
		System.out.println("The Character at the index 6 = "+ x.charAt(6));
		
		//Index of a character
		x.indexOf('a'); //1

	 	System.out.println("The index of o ="+ x.indexOf('o')); //8
		System.out.println("The index of R : "+ x.indexOf('R')); //-1
		System.out.println("The index of a after 5th position is "+ x.indexOf('a', 5)); //11
		
		System.out.println("The index of Java = "+ x.indexOf("Java")); //0
		System.out.println("The index of Tut = "+ x.indexOf("Tut"));//5
		System.out.println("The index of Java "+x.indexOf("Java", 1)); //-1
		System.out.println("The index of al "+x.indexOf("al", 9)); //11

		//Split
		x = "QA,Java,Automation,Course";
		
		String[] partOfString = x.split(","); //delimiter

		System.out.println("The 1st part = "+ partOfString[0]);
		System.out.println("The 2nd part = "+ partOfString[1]);
		System.out.println("The 3rd part = "+ partOfString[2]);
		System.out.println("The 4th part = "+ partOfString[3]);
		//System.out.println("The 5th part = "+ partOfString[4]); //ArrayIndexOutOfBoundsException because index 4 does not exist

		
		//Cases (upper & lower)

		System.out.println("The name in lower case = " + x.toLowerCase());
		System.out.println("The name in upper case = " + x.toUpperCase());
		
		//Replacement
		
		String replacedString = x.replaceAll(",", " "); //Replace , with space
		System.out.println("The replaced output string = "+replacedString);
		x = replacedString;
		System.out.println("The replaced string is  = " + x.replaceAll(" ", "_"));
		
		x = "1 Classes 2 Objects 3 Encapsulation 4 Polymorphism 5 Inheritence 6 Abstraction";
		System.out.println("The string replacing all numbers with hiphen = "+x.replaceAll("[0-9]+", "-"));


		StringConcatenation("Shah", "Rukh", "Khan", 55);



		String firstName = "John";
		String lastName = "Doe";

		//	firstName = "Russel";

		String celebrity = "Shah Rukh Khan";
		String lastNameOfCeleb = celebrity.substring(10);

		System.out.println("Full name is "+ firstName +" "+lastName);

		System.out.println("Last name of "+celebrity+ " is "+ lastNameOfCeleb); 

		int lengthOfName = celebrity.length();
		System.out.println("The lengh of "+celebrity+" = "+lengthOfName);

		int index = celebrity.indexOf('h');
		System.out.println("The position of h in "+celebrity + " = "+index);
		
		
		//Homework:  Create a function to declare two strings and compare them and print whether they are same or not
		//Homework:  Create a function to declare two strings and compare them and print whether they are same or not by disregarding the case
		 String y = "automation", z = "Automation";
		 y.equals(z);
		 y.equalsIgnoreCase(z);

		
		
	}

}
