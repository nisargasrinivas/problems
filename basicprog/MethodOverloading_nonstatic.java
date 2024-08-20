package basicprog;

public class MethodOverloading_nonstatic {
	
	//calling non static methods with and without parameters
	
	void add(int a)
	{
		System.out.println("1");
	}
	
	void add()
	{
		System.out.println("2");
	}
	
	 void add(String a)
	{
		System.out.println("3");
	}
	
	void add(String a,char b,double c)
	{
		System.out.println("4");
	}
	
	static void add(boolean a)//static method
	{
		System.out.println("it is static method");
		System.out.println(a);
	}

    public static void main(String[] args) {
		
		MethodOverloading_nonstatic n1 = new MethodOverloading_nonstatic();//creating an object for non static method
		n1.add();
		n1.add(40);
		n1.add("NISARGA");
		n1.add("nis",'a',12.345553);
		add(true);//calling static method
		

	}

}
