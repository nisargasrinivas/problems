package inheritance;

class Parent
{
	void login()
	{
		System.out.println("login using email ID");
	}
}

public class Method_Overriding extends Parent

{

	
	void login()
	{
	 System.out.println("login using phone number");	
	 super.login();
	}
	public static void main(String[] args)
	{
	Method_Overriding n1= new Method_Overriding();
	n1.login();//child method is overriding the parent method
	
	
	
	

	}

}
