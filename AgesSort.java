/* Program name: AgesSort.java
   Purpose: This program allows the user to enter the ages of a specific amount of
   family members and will sort the ages inputted into oldest to youngest
   Author: Cameron Dufault
   Date of completion: March 21 2016 */

import java.io.*;

// The "AgesSort" class.
public class AgesSort
{
    public static void main (String[] args) throws IOException
    {
	//Setting up variables
	boolean swap;
	int temp;

	BufferedReader kbi = new BufferedReader (new InputStreamReader (System.in));

	//Setting up array to hold the ages entered
	int age[] = new int [6];

	//this loop continually asks for the ages of the family members and stores them in the array
	for (int x = 0 ; x <= age.length - 1 ; x++)
	{
	    System.out.print ("Please enter the age of family member #" + (x + 1) + ": ");
	    age [x] = Integer.parseInt (kbi.readLine ());
	} //end loop

	// This loop continally checks to see if swaps are needed to be made and swaps ages when necessary until no swaps are made
	do
	{
	    swap = false;

	    //This loop repeatedly checks to see if swaps are needed and makes swaps when needed
	    for (int index = 0 ; index < age.length - 1 ; index++)
	    {
		//checking if the current element needs to be swapped or not
		if (age [index] < age [index + 1])
		{
		    //making swaps
		    temp = age [index];
		    age [index] = age [index + 1];
		    age [index + 1] = temp;

		    swap = true; //
		} //end if
	    } //end loop
	}
	while (swap == true); //this loop exits when 0 swaps are made

	//outputting the sorted ages to the user
	System.out.println ("");
	System.out.println ("The ages in order from oldest to youngest are:");
	for (int y = 0 ; y < age.length ; y++)
	    System.out.print (age [y] + " ");




    } // main method
} // AgesSort class
