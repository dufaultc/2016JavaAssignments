/* Program name: RaffleTickets.java
   Purpose: This program will ask the user to imput the amount of raffle tickets
   sold by 25 students and will output the averge amount of tickets sold as well as
   the total amount of tickets sold to the user.
   Author: Cameron Dufault
   Date of completion: March 8 2016 */

import java.io.*;

// The "MinCost" class.
public class MinCost
{
    public static void main (String[] args) throws IOException
    {
	//displaying the title to the user
	System.out.println ("THE MINUMUM ITEM COST CALCULATOR");
	System.out.println ("----------------------------------------");
	System.out.println ("");

	BufferedReader kbi = new BufferedReader (new InputStreamReader (System.in));

	//Creating variables
	int numBought; //the amount of items being bought
	int cheapItemQuantity; //the amount of the cheapest item being bought
	double lowestPrice; //the cost of the cheapest overall item
	String cheapestItem; //the name of the cheapest item

	//Initializing necessary variables
	lowestPrice = 1000000000;
	cheapestItem = "N/A";
	cheapItemQuantity = 0;


	System.out.print ("Please enter the amount of  differemt items being purchased: ");
	numBought = Integer.parseInt (kbi.readLine ());


	//if the amount of items being bought is 0 or below
	if (numBought == 0) //if the amount of items being bought is 0 the lowest price is assigned as 0
	{
	    lowestPrice = 0;
	}
	else if (numBought <= 0) // if the amount of items being bought is below 0, tell the user and close the program
	{
	    System.out.println ("Invalid number");

	    //delaying the closing of the program
	    try
	    {
		Thread.sleep (2000);
	    }
	    catch (InterruptedException ie)
	    {
	    }

	    System.exit (0); //closing the program
	} //end if


	//Creating arrays
	String itemNames[] = new String [numBought]; //the names of all the items being bought
	double itemPrice[] = new double [numBought]; //the price of all the items being bought
	int itemQuantity[] = new int [numBought];    //the quantity of each item being bought
	double totalItemCost[] = new double [numBought]; //the overall cost of each item being bought

	System.out.println ("");

	//This loop continually asks the user to input the name, price, and quantity of each item being bought
	for (int x = 0 ; x <= itemNames.length - 1 ; x++)
	{
	    System.out.print ("Please enter the name of item number " + (x + 1) + ": ");
	    itemNames [x] = kbi.readLine ();

	    System.out.print ("Please enter the price of this item: $");
	    itemPrice [x] = Double.parseDouble (kbi.readLine ());

	    System.out.print ("Please enter the quantity being purchased of this item: ");
	    itemQuantity [x] = Integer.parseInt (kbi.readLine ());

	    totalItemCost [x] = itemPrice [x] * itemQuantity [x]; //calculating the overall cost of each items

	    /*this selection struture determines if the item just entered has the cheapest overall cost,
	      and assigns the price, quantity and name of the cheapest item to varibles*/
	    if (totalItemCost [x] < lowestPrice)
	    {
		lowestPrice = totalItemCost [x];
		cheapestItem = itemNames [x];
		cheapItemQuantity = itemQuantity [x];
	    } //end if

	    System.out.println ("");
	}

	//Displaying the results to the user
	System.out.println ("The item with the least expensive overall cost is: " + cheapestItem);
	System.out.println ("The cost of buying " + cheapItemQuantity + " of this item is $" + lowestPrice);

    } // main method
} // MinCost class


