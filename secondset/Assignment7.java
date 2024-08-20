package secondset;

import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
	
		Scanner s1= new Scanner(System.in);
		System.out.println("enter the value of length");
		double length = s1.nextDouble();
		System.out.println("enter the value of weight");
		double weight = s1.nextDouble();
		double cir=2*(length*weight);
		System.out.println("circumferance of a rectangle is->"+cir);
		s1.close();
		

	}

}
