package basicprog;


//constructor overloading

public class Amazon {
	
	Amazon()//this is a constructor
	{
		System.out.println("this is a constructor");
	}
	Amazon(int a)
	{
		System.out.println("second constructor");
	}
	Amazon(int a,String b,char c)
	{
		System.out.println("third constructor");
	}
	public static void main(String[] args) 
	{
	Amazon a1= new Amazon();//as soon as object get created constructor is called
	Amazon b1= new Amazon();//to call for second time
	new Amazon();//another way to create an object since we no need a reference
	new Amazon();//calling it two times
	new Amazon(10);
	new Amazon(50,"NIS",'c');

	}

}
