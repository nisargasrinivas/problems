package secondset;

import java.util.Scanner;

public class Assignment1
{
    final static double pi=3.14;
	public static void main(String[] args) 
	{
	 Scanner s1= new Scanner(System.in);
	 System.out.println("enter the value of radius");
	double r=s1.nextDouble();
	double Area=pi*r*r;
	System.out.println("area of the triage is ->"+Area);
	 s1.close();

	}

}
