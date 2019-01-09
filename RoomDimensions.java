/* Program name: RoomDimensions.java
   Purpose: This program is displays the dimensions of a room when given its length and width
   Author: Cameron Dufault
   Date of completion: March 30 2016 */

import java.io.*;

//RoomDimensions class
public class RoomDimensions
{
    public static void main (String[] args) throws IOException
    {
	BufferedReader kbi = new BufferedReader (new InputStreamReader (System.in));

	//displaying instructions
	instructions ();

	//Asking the user for the width and length of the room
	System.out.print ("Please enter the width of the room in metres: ");
	double width = Double.parseDouble (kbi.readLine ());
	System.out.print ("Please enter the length of the room in metres: ");
	double length = Double.parseDouble (kbi.readLine ());

	//callng on the perimeterCalculator and areaCalculator methods in order to calculate perimeter and area
	double perimeter = perimeterCalculator (length, width);
	double area = areaCalculator (length, width);

	System.out.println ("");

	//outputting results
	output (width, length, perimeter, area);



    } //main method


    //instructions method
    public static void instructions ()
    {
	System.out.println ("This application will determine the area");
	System.out.println ("and perimeter of room when given it's dimensions");
	System.out.println ("");
    } //area calculator method


    //perimeterCalculator method
    public static double perimeterCalculator (double length, double width)
    {
	double ans;
	ans = (length + width) * 2;
	return ans;
    } // area calculator method


    //areaCalculator method
    public static double areaCalculator (double length, double width)
    {
	double ans;
	ans = length * width;
	return ans;
    } //area calculator method


    //output method
    public static void output (double width, double length, double perimeter, double area)
    {
	System.out.println ("Width: " + width + "m");
	System.out.println ("Length: " + length + "m");
	System.out.println ("Area: " + area + "m^2");
	System.out.println ("Perimeter: " + perimeter + "m");
    } //output method
} //the RoomDimensions class


