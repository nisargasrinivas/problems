package secondset;

import java.util.Scanner;

public class Assignment5 {
	
	final static double pi=3.14;

	public static void main(String[] args) {
		
		Scanner s1= new Scanner(System.in);
		 System.out.println("enter the value of radius");
		double r=s1.nextDouble();
		double d=2*r;
		double circumferance =pi*d;
		System.out.println("circumferance of a circle is ->"+circumferance);
		 s1.close();


	}

}
