package basicprog;

public class GlobalVariable {
	
	
	double pi= 3.14;//global variable
	static int no_of_days_leap_year=366;//global variable can be static or non static
	static int age;//global variable decalred without initialization
	
	
	static void add()
	{
		String a= "NISARGA";//local variable a
	}

	public static void main(String[] args)
	{
		double salary;//local variable dont have default value 
		//System.out.println(salary);//local variable used without initialization throws error
		System.out.println(age);//value will be printed '0' 
		
        
	}

}
