package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanner_class1 {

	public static void main(String[] args) {
		
		
		Scanner s1= new Scanner(System.in);
		System.out.println("enter your age");
		try {
		int age = s1.nextInt();
		
		}
		catch(InputMismatchException a1)
		{
			Scanner s2= new Scanner(System.in);
			System.out.println("enter your age");
			int age1 = s2.nextInt();
			
			
		}
		
		Scanner s3=new Scanner(System.in);
	    System.out.println("enter your firstname");
        String firstname = s3.next();
        
}
}