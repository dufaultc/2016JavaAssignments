//Programmer: Cameron Dufault
//Purpose: This program allows the user to enter 5 words and will 
//         output the number of words beginning with b entered and what they are.
//Progam Name: FirstLetter.java
//Date of Completion: April 28 2016

import java.io.*;

public class FirstLetter
{
    public static void main (String[] args) throws IOException
    {
	System.out.println ("THE B WORD FINDER");
	System.out.println ("--------------------");
	System.out.println ("");
    
	BufferedReader kbi = new BufferedReader (new InputStreamReader (System.in));

	//creating arrays
	String wordsEntered[] = new String [5];
	String bWordsEntered[] = new String [5];
	
	//creating and itizializing variable
	boolean bLetter;
	int bCount = 0;
	String b = "b";
      
	//This loop repeatedly asks the user to enter a word, and then determines if the word starts with a b and adds to the count
	for (int x = 0 ; x <= wordsEntered.length - 1 ; x++)
	{
	    //asking the user to enter a word, and checking if the first letter of the word is B or b
	    System.out.print ("Please enter word number " + (x + 1) + ": ");
	    wordsEntered [x] = kbi.readLine ();
	    String firstLetter = wordsEntered [x].substring(0,1);
	    bLetter = firstLetter.equalsIgnoreCase (b);
	    //if the words starts with a b
	    if (bLetter == true )
	    {
		//add the word to the bwords array and increase the count
		bWordsEntered [bCount] = wordsEntered [x];
		bCount = bCount + 1;
		
	    }//end if
	}//end loop

	//outputting all the words which began with B or b
	System.out.println ("You entered " + bCount + "'B' words, and they were: ");
	for (int x = 0 ; x <= bCount-1 ; x++)
	{
	    System.out.println (bWordsEntered [x]);
	}//end loop

    }//main method
}// the FIrstLetter class












