package basicprog;

public class Pgm2_NonStaticMethod {
	
	
	void add()
	{
		System.out.println("i am non static method");
		
		
	}
	
	void sub()
	{
		System.out.println("i am non static methos two");
	}

	public static void main(String[] args)
	{
		System.out.println("i am your main method");
		Pgm2_NonStaticMethod n1= new Pgm2_NonStaticMethod();
		n1.add();
		n1.sub();

	}

}
