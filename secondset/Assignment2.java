package secondset;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the value of base");
		double base=s1.nextDouble();
		System.out.println("enter the value of height");
		double height=s1.nextDouble();
	
		double area=0.5*base*height;
		System.out.println("area of traiangle is ->"+area);
		s1.close();
		

	}

}
