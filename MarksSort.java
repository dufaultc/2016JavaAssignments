/* Program name: MarksSort.java
   Purpose:
   Author: Cameron Dufault
   Date of completion: March  2016 */

import java.io.*;

// The "MarksSort" class
public class MarksSort
{
    public static void main (String[] args) throws IOException
    {
	//displaying title to the user
	System.out.println ("THE STUDENT MARK SORTER");
	System.out.println ("--------------------------------------");
	System.out.println ("");

	BufferedReader kbi = new BufferedReader (new InputStreamReader (System.in));

	//declaring variables
	boolean swap;
	double markTemp;
	String nameTemp;
	int orderChoice;
	int studentNum;

	System.out.print ("Please enter the number of students you wish to enter marks for: ");
	studentNum = Integer.parseInt (kbi.readLine ()); //recieving the number of students from the user
	System.out.println ("");

	//declaring arrays
	String studentNames[] = new String [studentNum];
	double studentMarks[] = new double [studentNum];

	//this loop continually get the students names and marks from the user
	for (int x = 0 ; x <= studentNames.length - 1 ; x++)
	{
	    System.out.print ("Please enter the name of student #" + (x + 1) + ": ");
	    studentNames [x] = kbi.readLine ();
	    System.out.print ("Please enter the mark of student #" + (x + 1) + ": ");
	    studentMarks [x] = Double.parseDouble (kbi.readLine ());
	    System.out.println ("");
	} //end loop

	//asking the user if they would like the marks displayed in increasing or decreasing order
	System.out.println ("If you would like the marks displayed in increasing order, enter a 1,");
	System.out.print ("If you would like the marks displayed in decreasing order, enter a 2: ");
	orderChoice = Integer.parseInt (kbi.readLine ());

	do
	{
	    swap = false; //inizializing swap flag

	    //this loop will continiually sort the students marks and names so that they are in order based on the students marks
	    for (int x = 0 ; x < studentNames.length - 1 ; x++)
	    {
		if (orderChoice == 1) //if the user wants the marks in increasing order
		{
		    if (studentMarks [x] > studentMarks [x + 1]) //if the current mark needs to be swapped this structure swaps the names and marks to increasing order
		    {
			//making swaps of marks
			markTemp = studentMarks [x];
			studentMarks [x] = studentMarks [x + 1];
			studentMarks [x + 1] = markTemp;

			//making swaps of names
			nameTemp = studentNames [x];
			studentNames [x] = studentNames [x + 1];
			studentNames [x + 1] = nameTemp;

			swap = true; //flagging that a swap was made
		    }//end if
		}//end if                

		    else if (orderChoice == 2) //if the user wants the marks in decreasing order
		    {
			if (studentMarks [x] < studentMarks [x + 1]) //if the current mark needs to be swapped this structure swaps the names and marks to decreasing order
			{
			    //making swaps of marks
			    markTemp = studentMarks [x];
			    studentMarks [x] = studentMarks [x + 1];
			    studentMarks [x + 1] = markTemp;

			    //making swaps of names
			    nameTemp = studentNames [x];
			    studentNames [x] = studentNames [x + 1];
			    studentNames [x + 1] = nameTemp;

			    swap = true; //flagging that a swap was made
			}
		    }

	    }
	}//end loop
	while (swap == true); //stops when no swaps are made

	//outputing results of sort to the user
	System.out.println ("");
	System.out.println ("After sorting, the students marks in order are shown below.");
	
	// this loop continually output the student names and corresponding marks in order
	for (int y = 0 ; y < studentNames.length ; y++)
	{
	    System.out.print (studentNames [y] + " ");
	    System.out.println (studentMarks [y]);
	}//end loop


    } // main method
} // MarksSort class


