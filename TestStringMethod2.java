// Kathy Zeng
// 12/10/20
// TestStringMethod2.java
// This shows the String methods charAt and length
// It takes in a String from the user and prints each word on a new line

import java.util.Scanner;

public class TestStringMethod2
{
	private String userInput;  // words user inputs that will be printed

	public TestStringMethod2()
	{
		userInput = new String("");
	}

	public static void main(String[] args)
	{
		TestStringMethod2 tsm= new TestStringMethod2();
		tsm.testIt();
	}

	public void testIt()
	{
		getInput();
		printChars();
	}

	// gets the user input
    public void getInput()
    {
        System.out.println("\n\n\n");
        Scanner kb = new Scanner(System.in);
        System.out.println("This program will read what you type in and print " +
        "each character on a new line");
        System.out.print("Please input a sentence --> ");
        userInput = kb.nextLine();
    }

    // this takes the field variable and prints each character on a new line
    public void printChars()
    {
       char letter = '5';
       for (int i = 0; i < userInput.length(); i++)
       {
           letter = userInput.charAt(i);
           if (letter == ' ' || letter == '\t')
			  System.out.println();
		   else
              System.out.print(letter);
           
	   }
       System.out.println("\n\n\n");
    }
      // Use substring, compareTo
      // char + integer
      // and return type required in method (compare to orginal string cast (int to character)
      // convert substring to int)
      public static char charAt(String str, int index)
      {
            String substr = new String(" ");
            substr = str.substring(index, index + 1);
            int asciiValue = 0;
            asciiValue = substr.compareTo( (char)(31) + " " ) + 31;
            return (char) asciiValue;
	     
	  }
   }
