package problems;

import java.util.Arrays;

public class Alphabets_CountInString 
{
	
	static int count_of_alphabet=0;
	static int count_of_numeric=0;
	static int count_of_space=0;

	public static void main(String[] args) 
	 {
		
		String input="kv no 1";
		char[] c1 = input.toCharArray();//coverting string into char
		System.out.println(Arrays.toString(c1));
		
		System.out.println("length of alphabet");
		
		for(int i=0;i<input.length();i++)
		{
		boolean answer1=Character.isAlphabetic(c1[i]);//return type is boolean to check alphabet or not
		//System.out.println(answer1);
		       if(answer1== true)
		       {
		    	   count_of_alphabet++;

		       }
		
		}
		
		System.out.println(count_of_alphabet);
		
		
		
		System.out.println("fing the numeric");
		
		for(int i=0;i<input.length();i++)
		{
		boolean answer2=Character.isDigit(c1[i]);//return type is boolean to check number or not
		//System.out.println(answer2);
		if(answer2 == true)
	       {
			count_of_numeric++;

	       }
	
	     }
	
	System.out.println(count_of_numeric);
		
	
	
	  System.out.println("finding space");	
		for(int i=0;i<input.length();i++)
		{
		boolean answer3=Character.isSpaceChar(c1[i]);//return type is boolean to check space or not
		//System.out.println(answer3);
		if(answer3 == true)
	       {
			count_of_space++;

	       }
	
		 }
		System.out.println(count_of_space);
		
		
		System.out.println("special charecters");
		
		int symbol= input.length()- (count_of_alphabet+count_of_numeric+count_of_space);
		System.out.println(symbol);
        System.out.println(input.length());
	}

}
