package secondset;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println("please enter value of side1");
		double side1=s1.nextDouble();
		System.out.println("please enter value of side2");
		double side2=s1.nextDouble();
		System.out.println("please enter value of side3");
		double side3=s1.nextDouble();
		double circumferance = side1+side2+side3;
		System.out.println("circumferance of a triangle is->"+circumferance);
		s1.close();
		
		
		
	
	}

}
