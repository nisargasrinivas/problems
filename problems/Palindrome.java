package problems;

public class Palindrome {

	public static void main(String[] args) 
	{
		String input = "my name is venu";
		String output = " ";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1 = input.charAt(i);
			output = output+c1;
		}
           System.out.println(output);
           
           if(input.equals(output))
           {
        	   System.out.println("it is a palindrome");
           }
		 
           else
           {
        	   System.out.println("not a palindrome");
         }

	}

}
