package basicprog;
//calling static methods in main method

public class Pgm1_StaticMethod {
	
	
	static void add()
	{
		System.out.println("static method calling");
	}
	
	static void sub()
	{
		System.out.println("static method 2");
	}

	public static void main(String[] args) 
	{
     System.out.println("i am main method ");
     
     sub();
     
  
	}

}
