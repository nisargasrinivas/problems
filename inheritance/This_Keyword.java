package inheritance;

public class This_Keyword
{
	int age;//default age is 0
    double salary;//default salary is 0.0
	String name;//default string is null
	void employee_details(int age,double salary,String name)
	{
		this.age=age;//this global variable = local variable;
		this.salary=salary;
	}

	public static void main(String[] args) 
	{
		This_Keyword g1= new This_Keyword();
		g1.employee_details(67,56.450, null);
		System.out.println(g1.age);
		System.out.println(g1.salary);
		System.out.println(g1.name);
	    

	}

}

