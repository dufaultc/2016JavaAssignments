//Programmer: Cameron Dufault
//Purpose: This program displays the length of a word, and then the user repeatedly
//         guesses letter in the word until they have guessed the entire word.
//Progam Name: WordGuess.java
//Date of Completion: April 28 2016

import java.io.*;
//The WordGuess class
public class WordGuess
{
    public static void main (String[] args) throws IOException
    {
	BufferedReader kbi = new BufferedReader (new InputStreamReader (System.in));

	//Setting the words which the user will guess
	String words[] = {"poster", "table", "juice", "computer", "binder"};

	//Initializing and creating variables
	int guessCounter = 0;
	int playAgain = 0;
	int stringGuessed = 3;
	String letterGuess;
	String displayString;
	String guessedLetters = "";
	
	//displaying title to the user
	System.out.println ("THE WORD GUESS GAME");
	System.out.println ("_________________________");
	System.out.println ("");
	

	//This loop repeatedly chooses a word for the reader to guess, and lets them repeatedly guess
	//letters until they have guessed the entire word and do not want to guess another word
	do
	{
	    int randNum = (int) (Math.random () * 5 + 1);
	    String secretWord = words [randNum - 1]; //setting the word for the user to guess

	    int wordLength = secretWord.length (); //determining the length of the word

	    String displayArray[] = new String [wordLength + 1]; //creating an array which will show the user and keep track of which guesses they have correct

	    //this loop displays the array showing the user what they need to guess
	    for (int x = 0 ; x < wordLength ; x++)
	    {
		displayArray [x] = "-";
		System.out.print (displayArray [x]);
	    }//end loop

	    //This loop repeatedly lets the user guess letters in the secret word until they guess the entire word
	    do
	    {
	       
		//setting the string of guessed letter empty 
		guessedLetters = "";

		//getting the guess from the user and making it lower case
		System.out.println ("");
		System.out.println ("Please guess a letter in the secret word: ");
		letterGuess = kbi.readLine ();
		String lowerLetterGuess = letterGuess.toLowerCase ();

		//determining the length of the guess
		int guessLength = letterGuess.length ();
		
		//if the length of the guessed word is one letter
		if (guessLength == 1)
		{
		    //finding the location of the guessed letter inside the word
		    int index = secretWord.indexOf (lowerLetterGuess);
		    
		    //increasing counter of guesses
		    guessCounter = guessCounter + 1;

		    //if the letter was in the word
		    if (index != -1)
		    {
			System.out.println ("");
			System.out.println ("You guessed a letter correctly!");
			
			//setting the corresponding space in the displayed string to the guess
			displayArray [index] = lowerLetterGuess;
		    }
		    else//if the letter was not in the word
		    {
			System.out.println ("The letter you guessed is not in the secret word");
		    }//end if

		    //displaying the updated string displayed to the user
		    for (int x = 0 ; x < wordLength ; x++)
		    {
			System.out.print (displayArray [x]);
			guessedLetters = guessedLetters.concat (displayArray [x]); //creating a string out of the strings inside the array keeping track of the guessed letters
		    }//end loop

		    stringGuessed = guessedLetters.compareTo (secretWord); //comparing the string of guessed letter to the secret word
		    if (stringGuessed == 0) //if the string of guessed letters and the secret word were equal
		    {
			//telling the user they  guessed the word and displaying the amount og guesses they took
			System.out.println ("");
			System.out.println ("You guessed the entire word!");
			System.out.println ("You took " + guessCounter + " turns to guess the entire word.");
			//asking the user if they would like to play again
			System.out.println ("If you would like to play again, enter a 1, if not, enter a 0: ");
			playAgain = Integer.parseInt (kbi.readLine ());
		    }//end if
		}
		else //if the user enters more than one letter
		{
		    System.out.println ("Please enter only one letter at a time");
		}//end iuf

	    }//end loop
	    while (stringGuessed != 0);//keep asking to guess more as long as the user does not guess the entire word
	   

	}//end loop
	while (playAgain == 1);//get a new secret word and play the game again if the user wants to
       
    }//main method
}//the word guess class






