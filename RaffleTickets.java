/* Program name: RaffleTickets.java
   Purpose: This program will ask the user to imput the amount of raffle tickets
   sold by 25 students and will output the averge amount of tickets sold as well as
   the total amount of tickets sold to the user.
   Author: Cameron Dufault
   Date of completion: March 8 2016 */


import java.io.*;

// The "RaffleTickets" class.
public class RaffleTickets
{
    public static void main (String[] args) throws IOException
    {
	//Displaying the title to the user
	System.out.println ("THE RAFFLE CALCULATOR");
	System.out.println ("---------------------------------");
	System.out.println ("");
    
	BufferedReader keyboardInput = new BufferedReader (new InputStreamReader (System.in));

	//Creating an array to hold the tickets sold by each student
	int ticketsSold[] = new int [25];

	//creating variables
	int studentNum;
	int totalSold;
	double averageSold;

	//initializing total and tally variables
	studentNum = 0;
	totalSold = 0;

	//this loop continually asks the user to enter the number of tickets sold by each student until 25 students have been inputted
	for (int x = 0 ; x <= ticketsSold.length - 1 ; x++)
	{
	    studentNum = studentNum + 1; //incrementing the studentNumber
	    
	    System.out.print ("Please enter the amount of tickets sold by student " + studentNum + ": ");
	    ticketsSold [x] = Integer.parseInt (keyboardInput.readLine ()); 
	    
	    totalSold = totalSold + ticketsSold [x]; //increasing the total by the amount entered
	    
	    System.out.print ("");
	} //end loop

	averageSold = (double) totalSold / studentNum; //calculating the average number of tickets sold
       
	System.out.println ("");
	System.out.println ("RESULTS");
	System.out.println ("------------------");
	System.out.println ("The total number of tickets sold by the students was " + totalSold);
	System.out.println ("The average amount of tickets sold by each student was " + averageSold);


    } // main method
} // RaffleTickets class
