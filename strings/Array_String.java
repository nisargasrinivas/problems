package strings;

import java.util.Arrays;

public class Array_String {

	public static void main(String[] args) 
	{
	   int rollno[]= new int[5];
	   rollno[0]=34;
	   rollno[1]=54;
	   rollno[2]=45;
	   rollno[3]=39;
	   rollno[4]=678;
	   Arrays.sort(rollno);//sorting an array
	   
	   System.out.println(rollno[0]);//*one way to print
	   System.out.println(rollno[1]);
	   System.out.println(rollno[2]);
	   System.out.println(rollno[3]);
	   System.out.println(rollno[4]);//one way to print
	   
	   
	   for(int i=0;i<=4;i++)
	   {
		   System.out.println(rollno[i]);//another way to print
		  
	   }
	   
	   System.out.println(Arrays.toString(rollno));//another way of printing in array format 
	   
	   //accepting the string array 
	   String name[]= new String[3];
	   name[0]="nisarga";
	   name[1]="sunil";
	   name[2]="chirayu";
	   
	   
	   
	   System.out.println(Arrays.toString(name));//printing in array format
	   
	}

}
