package exception;

public class Try1_catch2 {

	public static void main(String[] args) 
	{
		
		try
		{
	
		int c=1/0;//infinity
		System.out.println(c);
		}
		
		catch(ArithmeticException a1)
		{
			System.out.println("handeled the exception");
		}
		

	}

}
