package secondset;

import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) 
	{
	 Scanner s1= new Scanner(System.in);
	 System.out.println("enter value of a");
	 double a= s1.nextDouble();
	 System.out.println("enter value of b");
	 double b= s1.nextDouble();
	 System.out.println("enter value of height");
	 double height= s1.nextDouble();
	 double cir= 0.5*(a+b)*height;
	 System.out.println("circumferance of trapezium is ->"+cir);
	 s1.close();
	 
	 
	 

	}

}
