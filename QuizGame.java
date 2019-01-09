/* Program name: QuizGame.java
   Purpose: This program is a quiz where the user answers 5 questions, and the questions are no the same every time.
   Author: Cameron Dufault
   Date of completion: March 31 2016 */

import java.io.*;
//The QuizGame class
public class QuizGame
{
    public static void main (String[] args) throws IOException
    {
	BufferedReader kbi = new BufferedReader (new InputStreamReader (System.in));

	//setting up variables
	int correctCount;
	int answer;

	//initializing variables
	correctCount = 0;
	answer = 0;

	//diplaying the title to the user and asking if they would like to begin the game
	System.out.println ("Welcome to the Sports Quiz");
	System.out.println ("Answer the questions correctly to win!");
	System.out.print ("Enter 1 to begin the game: ");
	int beginGame = Integer.parseInt (kbi.readLine ());
	System.out.println ("");

	//if the user enters 1, the game begins
	if (beginGame == 1)
	{
	    //running all the methods for the questions
	    correctCount = level1 (answer, correctCount);
	    correctCount = level2 (answer, correctCount);
	    correctCount = level3 (answer, correctCount);
	    correctCount = level4 (answer, correctCount);
	    correctCount = level5 (answer, correctCount);

	    //outputting the results of the game
	    System.out.println ("");
	    System.out.println ("You have completed the game");
	    System.out.println ("You got " + correctCount + " out of 5 questions correct.");

	} //end if
    } //main method

    //level 1 method
    public static int level1 (int answer, int correctCount) throws IOException
    {
	BufferedReader kbi = new BufferedReader (new InputStreamReader (System.in));
	int randNum1 = (int) (Math.random () * 2 + 1); //generating random number which determines what question to ask

	//if the random number is 1
	if (randNum1 == 1)
	{
	    //displaying question and possible answers
	    System.out.println ("QUESTION #1");
	    System.out.println ("Which hockey team has won the most stanley cups?");
	    System.out.println ("1. Montreal Canadiens");
	    System.out.println ("2. Florida Panthers");
	    System.out.println ("3. Chicago Blackhawks");
	    System.out.println ("4. Wallaceburg Lakers");
	    System.out.println ("Please enter a 1,2,3,or 4 here: ");
	    answer = Integer.parseInt (kbi.readLine ());

	    //if the user  answers correctly
	    if (answer == 1)
	    {
		System.out.println ("");
		System.out.println ("You answered Correctly!");
		correctCount = correctCount + 1; //adding to the count of the amount of correct answers
	    }
	    else
	    {
		System.out.println ("You answered incorrectly");
	    } //end if

	} // end if
	//if the random number is 2
	if (randNum1 == 2)
	{
	    //displaying question and possible answers
	    System.out.println ("QUESTION #1");
	    System.out.println ("Which NBA team in located in Indiana?");
	    System.out.println ("1. Bulls");
	    System.out.println ("2. Pacers");
	    System.out.println ("3. Tigers");
	    System.out.println ("4. Magic");
	    System.out.println ("Please enter a 1,2,3,or 4 here: ");
	    answer = Integer.parseInt (kbi.readLine ());

	    //if the user  answers correctly
	    if (answer == 2)
	    {
		System.out.println ("");
		System.out.println ("You answered Correctly!");
		correctCount = correctCount + 1; //adding to the count of the amount of correct answers
	    }
	    else
	    {
		System.out.println ("You answered incorrectly");
	    } //end if
	}// end if

	return correctCount;

    } // level1 method

    //level 2 method
    public static int level2 (int answer, int correctCount) throws IOException
    {
	BufferedReader kbi = new BufferedReader (new InputStreamReader (System.in));
	int randNum2 = (int) (Math.random () * 2 + 1);  //generating random number which determines what question to ask

	//if the random number is 1
	if (randNum2 == 1)
	{
	    //displaying question and possible answers
	    System.out.println ("QUESTION #2");
	    System.out.println ("What sport was invented by Canadian James Naismith?");
	    System.out.println ("1. Tennis");
	    System.out.println ("2. Golf");
	    System.out.println ("3. Basketball");
	    System.out.println ("4. Dodgeball");
	    System.out.println ("Please enter a 1,2,3,or 4 here: ");
	    answer = Integer.parseInt (kbi.readLine ());

	    //if the user  answers correctly
	    if (answer == 3)
	    {
		System.out.println ("");
		System.out.println ("You answered Correctly!");
		correctCount = correctCount + 1;  //adding to the count of the amount of correct answers
	    }
	    else
	    {
		System.out.println ("You answered incorrectly");
	    } //end if

	} //end if
	//if the random number is 2
	if (randNum2 == 2)
	{
	    //displaying question and possible answers
	    System.out.println ("QUESTION #2");
	    System.out.println ("Which of these races is two laps around a regular sized track?");
	    System.out.println ("1. 400m");
	    System.out.println ("2. 1500m");
	    System.out.println ("3. 800m");
	    System.out.println ("4. 2000m");
	    System.out.println ("Please enter a 1,2,3,or 4 here: ");
	    answer = Integer.parseInt (kbi.readLine ());

	    //if the user  answers correctly
	    if (answer == 3)
	    {
		System.out.println ("");
		System.out.println ("You answered Correctly!");
		correctCount = correctCount + 1; //adding to the count of the amount of correct answers
	    }
	    else
	    {
		System.out.println ("You answered incorrectly");
	    } //end if
	}// end if

	return correctCount;

    } //level2 method

    //level3 method
    public static int level3 (int answer, int correctCount) throws IOException 
    {
	BufferedReader kbi = new BufferedReader (new InputStreamReader (System.in));
	int randNum3 = (int) (Math.random () * 2 + 1); //generating random number which determines what question to ask
	
	//if the random number is 1
	if (randNum3 == 1)
	{
	    //displaying question and possible answers
	    System.out.println ("QUESTION #3");
	    System.out.println ("Which sport uses the smallest ball?");
	    System.out.println ("1. Soccer");
	    System.out.println ("2. Volleyball");
	    System.out.println ("3. Softball");
	    System.out.println ("4. Baseball");
	    System.out.println ("Please enter a 1,2,3,or 4 here: ");
	    answer = Integer.parseInt (kbi.readLine ());

	    //if the user  answers correctly
	    if (answer == 4)
	    {
		System.out.println ("");
		System.out.println ("You answered Correctly!");
		correctCount = correctCount + 1; //adding to the count of the amount of correct answers
	    }
	    else
	    {
		System.out.println ("You answered incorrectly");
	    }//end if

	}// end if
	
	//if the random number is 2
	if (randNum3 == 2)
	{
	    //displaying question and possible answers
	    System.out.println ("QUESTION #3");
	    System.out.println ("Which of these sports is considered Americas national pastime");
	    System.out.println ("1. Football");
	    System.out.println ("2. Baseball");
	    System.out.println ("3. Golf");
	    System.out.println ("4. Basketball");
	    System.out.println ("Please enter a 1,2,3,or 4 here: ");
	    answer = Integer.parseInt (kbi.readLine ());

	    //if the user  answers correctly
	    if (answer == 2)
	    {
		System.out.println ("");
		System.out.println ("You answered Correctly!");
		correctCount = correctCount + 1; //adding to the count of the amount of correct answers
	    }
	    else
	    {
		System.out.println ("You answered incorrectly");
	    } //end if
	}//end if

	return correctCount;

    }//level3 method

    //level4 method
    public static int level4 (int answer, int correctCount) throws IOException
    {

	BufferedReader kbi = new BufferedReader (new InputStreamReader (System.in));
	int randNum4 = (int) (Math.random () * 2 + 1); //generating random number which determines what question to ask
	
	//if the random number is 1
	if (randNum4 == 1)
	{
	     //displaying question and possible answers
	    System.out.println ("QUESTION #4");
	    System.out.println ("Which of these sports is NOT in the Olympics?");
	    System.out.println ("1. Soccer");
	    System.out.println ("2. Volleyball");
	    System.out.println ("3. Football");
	    System.out.println ("4. Ice Hockey");
	    System.out.println ("Please enter a 1,2,3,or 4 here: ");
	    answer = Integer.parseInt (kbi.readLine ());

	    //if the user  answers correctly
	    if (answer == 3)
	    {
		System.out.println ("");
		System.out.println ("You answered Correctly!");
		correctCount = correctCount + 1; //adding to the count of the amount of correct answers
	    }
	    else
	    {
		System.out.println ("You answered incorrectly");
	    }//end if

	}//end if
	//if the random number is 2
	if (randNum4 == 2)
	{
	     //displaying question and possible answers
	    System.out.println ("QUESTION #4");
	    System.out.println ("Which of these Canadian NHL teams moved to Canada from Atlanta");
	    System.out.println ("1. Nordiques");
	    System.out.println ("2. Maple Leafs");
	    System.out.println ("3. Canucks");
	    System.out.println ("4. Jets");
	    System.out.println ("Please enter a 1,2,3,or 4 here: ");
	    answer = Integer.parseInt (kbi.readLine ());

	    //if the user  answers correctly
	    if (answer == 4)
	    {
		System.out.println ("");
		System.out.println ("You answered Correctly!");
		correctCount = correctCount + 1; //adding to the count of the amount of correct answers
	    }
	    else
	    {
		System.out.println ("You answered incorrectly");
	    }//end if
	} //end if

	return correctCount;

    } //level4 method

    //level5 method
    public static int level5 (int answer, int correctCount) throws IOException
    {
	BufferedReader kbi = new BufferedReader (new InputStreamReader (System.in));
	int randNum5 = (int) (Math.random () * 2 + 1); //generating random number which determines what question to ask

	//if the random number is 1
	if (randNum5 == 1)
	{
	     //displaying question and possible answers
	    System.out.println ("QUESTION #5");
	    System.out.println ("Which sport does Rafael Nadal play?");
	    System.out.println ("1. Tennis");
	    System.out.println ("2. Soccer");
	    System.out.println ("3. Baseball");
	    System.out.println ("4. F1 racing");
	    System.out.println ("Please enter a 1,2,3,or 4 here: ");
	    answer = Integer.parseInt (kbi.readLine ());

	    //if the user  answers correctly
	    if (answer == 1)
	    {
		System.out.println ("");
		System.out.println ("You answered Correctly!");
		correctCount = correctCount + 1; //adding to the count of the amount of correct answers
	    }
	    else
	    {
		System.out.println ("You answered incorrectly");
	    }//end if

	}//end if
	//if the random number is 2
	if (randNum5 == 2)
	{
	     //displaying question and possible answers
	    System.out.println ("QUESTION #5");
	    System.out.println ("Who battled in the 'Rumble in the Jungle' ");
	    System.out.println ("1. Floyd Mayerweather and Manny Paquiao");
	    System.out.println ("2. Muhammad Alli and Mike Tyson");
	    System.out.println ("3. George Foreman and Muhammad Alli");
	    System.out.println ("4. Chimpanzee and Baboon");
	    System.out.println ("Please enter a 1,2,3,or 4 here: ");
	    answer = Integer.parseInt (kbi.readLine ());

	    //if the user  answers correctly
	    if (answer == 3)
	    {
		System.out.println ("");
		System.out.println ("You answered Correctly!");
		correctCount = correctCount + 1; //adding to the count of the amount of correct answers
	    }
	    else
	    {
		System.out.println ("You answered incorrectly");
	    }//end if
	}// end if

	return correctCount;
    } //level5 method
}//the QuizGame class


