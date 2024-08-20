package basicprog;

public class Constructor_Overloading {
	
	Constructor_Overloading()
	{
		System.out.println("constructor 1");
	}
	Constructor_Overloading(int a)
	{
		System.out.println("constructor 2");
	}
	Constructor_Overloading(int a, double b)
	{
		System.out.println("constructor 3");
	}
	Constructor_Overloading(String nis,int a)
	{
		System.out.println("constructor 4");
	}


	public static void main(String[] args) 
	{
		Constructor_Overloading s1= new Constructor_Overloading();
		Constructor_Overloading s2= new Constructor_Overloading(345,67.899876);
		Constructor_Overloading s3= new Constructor_Overloading("redflag",34);
		
	}

}
