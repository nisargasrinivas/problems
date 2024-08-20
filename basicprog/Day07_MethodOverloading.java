package basicprog;
//static method overloading

public class Day07_MethodOverloading {
	
	//calling static methods with and without parameter
	static void add(int a)
	{
		System.out.println("1");
	}
	
	static void add()
	{
		System.out.println("2");
	}
	
	static void add(String a)
	{
		System.out.println("3");
	}
	
	static void add(String a,char b,double c)
	{
		System.out.println("4");
	}

	
	public static void main(String[] args) 
	{
		
        add();//calling static method
        add(10);//calling static method with paramaters
        add("NIS");
        add("nis",'K',10.2345678);//string char and double
	}

}
