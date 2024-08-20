package inheritance;

public class Constructor_OverloadingThis 
{
	
	Constructor_OverloadingThis(int a)
	{
		System.out.println("constructor1");
	}
	
	Constructor_OverloadingThis(double b)
	{
		this(678);
		System.out.println("constructor2");
	}
	Constructor_OverloadingThis()
	{
		this(3468.7);
		System.out.println("constructor3");
	
	}

	public static void main(String[] args) 
	{
		Constructor_OverloadingThis S1= new Constructor_OverloadingThis();
		
	}

}
