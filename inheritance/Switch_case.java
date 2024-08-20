package inheritance;

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) 
	{ 
	   Scanner s1= new Scanner(System.in);
	   System.out.println("press 1 for chrome");
	   System.out.println("press 2 for firefox");
	   System.out.println("press 3 for edge");
	   int browser_sel=s1.nextInt();
	   
	   switch( browser_sel)
	   {
	   case 1:System.out.println("launch chrome browser");
	   break;
	   
	   case 2:System.out.println("launch firefox browser");
	   break;
	   
	   case 3:System.out.println("launch firefox browser");
	   break;
	   
	   default:
		   System.out.println("sorry yo have selectio is wrong");
	   
	   }

	}

}
