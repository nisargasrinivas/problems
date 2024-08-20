package basicprog;

public class Global2 
{
	static double pi= 3.14;//global variable
	 int no_of_days_leap_year=366;//global variable can be static or non static
	
	public static void main(String[] args) 
	{
	pi=5;//global stactic value can be updated
	
	System.out.println(pi);//static variable can be called without creating the object
	
	Global2 l1=new Global2();//creating an object in order to access non static global variable
	
    System.out.println(l1.no_of_days_leap_year);//accesing it with ref 
    
    l1.no_of_days_leap_year=90;//updating non static global variable 
    
    System.out.println(l1.no_of_days_leap_year);
    

	}

}
