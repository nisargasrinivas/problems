package basicprog;

public class LocalGlobal {
	
	
	LocalGlobal()
	{
		String nam = "RAJU";//local variable
		System.out.println(nam);
	}
	
	static void sub()
	{
		int age = 90;//local variable
	}
	
	void add()
	{
		double pi=3.14;//local variable
	}

	public static void main(String[] args)
	{
	
LocalGlobal n1 = new LocalGlobal();
	}

}
