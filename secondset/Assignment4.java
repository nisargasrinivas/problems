package secondset;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println("enter the value of number");
		int n1= s1.nextInt();
		int number=n1%2;
		
		if(number==0)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("number is odd");
		}
		

	}

}
