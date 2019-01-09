/* Program name: LetInSent.java
   Purpose: This program displays the amount of occurences of a specific character in a string
   Author: Cameron Dufault
   Date of completion: April 14 2016 */
import java.io.*;

public class LetInSent
{
    public static void main (String[] args) throws IOException
    {
	BufferedReader kbi = new BufferedReader (new InputStreamReader (System.in));

	System.out.println ("LETTER FREQUENCY FINDER");
	System.out.println ("------------------------------");
	System.out.println ("");
	
	//Creating Strings
	String sentence;
	String character;

	//Getting the string and character to be found by the user
	System.out.print ("Please enter a sentence: ");
	sentence = kbi.readLine ();
	System.out.print ("Please enter the character you would like to find the frequency of: ");
	character = kbi.readLine ();
     
	//Converting the character entered and sentence to lower case
	String lowerSentence = sentence.toLowerCase();
	String lowerCharacter = character.toLowerCase ();

	//initializing variables
	int charAmount = 0;
	int noCharacter = 0;
	//this loop cointinually searches the loop for the character until it is no longer found
	while (noCharacter != -1)
	{
	    noCharacter = lowerSentence.indexOf (lowerCharacter, noCharacter); //searching for the occurance of the character at a certain position
	    //if a letter was found
	    if (noCharacter != -1)
	    {
		//incrementing variables
		noCharacter++;
		charAmount++;
	    }//end if
	}//end loop

	System.out.println ("The character you entered was found "+ charAmount +" times");
    }//main method
}// the LetInSent class









