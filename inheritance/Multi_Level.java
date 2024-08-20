package inheritance;
class one
{
	static void add()
	{
	System.out.println("1");
	}	
}
class two extends one
{
	static void mul()
	{
		
	System.out.println("2");
	}
}
public class Multi_Level extends two

{
	static void sub()
	{
		
	System.out.println("3");
	}

	public static void main(String[] args)
	{
		
	sub();
	mul();//method of class two
	add();//method of class one
	
	

	}

}
