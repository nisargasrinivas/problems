package basicprog;

public class OrOperator {

	public static void main(String[] args) 
{
	int a=10;
	int b=20;
	if(a==10 || b==a)//one is true one is false ans is true
	{
		
		System.out.println("learing or operator");
	}
	if(a==10 || b==20)
	{
		System.out.println("both the if bloack gets executed");
	}
	
	if(!(a==10 || b==a))
	{
		System.out.println("not operator of or");
	}
	if(!(a==10 && b==a))
	{
		System.out.println("not operator of and");
	}

}
}
