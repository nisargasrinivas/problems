package basicprog;

public class FinalVariable {
	
	final static double pi=3.14;
	

	public static void main(String[] args) 
	{
	final int age=90;
	//age=50;//updating is not possible
	System.out.println(age);
	//pi=5;//updating is not allowed since it is final

	}

}
