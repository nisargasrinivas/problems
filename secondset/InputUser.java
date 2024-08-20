package secondset;

import java.util.Scanner;

public class InputUser {

	public static void main(String[] args) 
	{
		//addition of two numbers at runtime
	 Scanner s1=new Scanner(System.in);//it will always accepts the paramter
	 System.out.println("please enter your a");
	 int a = s1.nextInt();
	 System.out.println("please enter your b");
	 int b = s1.nextInt();
	 int sum= a+b;
	 System.out.println("sum of the two numbers are->"+sum);
	 int sub= a-b;
	 System.out.println("sub of two numbers is-> "+sub);
	 int mul=a*b;
	 System.out.println("mul of two numbers is ->"+mul);
	 double div=a/b;
	 System.out.println("div of two numbers is ->"+div);
	 double mod=a%b;
	 System.out.println("mod of two numbers is ->"+mod);
	 s1.close();
	 
	 
	 
	}
	//system.in to take the values

}
