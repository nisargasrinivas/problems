package basicprog;

public class StaticMethod {


static void addition()//static method 
	{
		System.out.println("i am addition");
		
	}

static void sub()//static method 
{
	System.out.println("i am subtraction");
	
}

static void mul()//static method 
{
	System.out.println("i am multiplication");
	
}


public static void main(String[] args) //main method
{
	
	System.out.println("i am main method");
	addition();//calling static method
	sub();//calling static method 
	mul();//calling static method
	addition();//we can call multiple times
	sub();//we can call multiple times
	

}

}
