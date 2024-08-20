package inheritance;

public class Global_Local
{
	int age;
	static double salary;
	String name;
	void employee_details(int age,double salary,String name)
	{
		System.out.println("age is ->"+age);
		System.out.println("salary is->"+salary);
		System.out.println("Name is->"+name);
	}

	public static void main(String[] args) 
	{
		Global_Local g1= new Global_Local();
		g1.employee_details(67,56.450, null);
		System.out.println(g1.age);
		System.out.println(salary);
		System.out.println(g1.name);
	    

	}

}
