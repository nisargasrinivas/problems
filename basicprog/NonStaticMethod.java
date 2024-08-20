package basicprog;

public class NonStaticMethod 
{
	
	void add()//non static method
	{
		int a=10;
		int b=30;
		int sum= a+b;
		System.out.println(sum);
	}
	
	void sub()//non static method
	{
		int a=40;
		int b=15;
		int sub = a-b;
		System.out.println(sub);
	}
	
	static void mul()//static method 
	{
		System.out.println("i am static method");
		
	}

	public static void main(String[] args)
	{
	NonStaticMethod n1 = new NonStaticMethod();//creating an object b4 calling non static method
	n1.add();//calling it by reference
	n1.sub();//calling multiple non static methods 
	mul();//both static method is also called
	

	}

}
