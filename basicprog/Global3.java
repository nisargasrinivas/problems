package basicprog;

public class Global3 
{
    static int a =20;
    static int b =10;
    
    static void add()
    {
    	int a=90;//now a is 90 and it is local a is used
     System.out.println(a+b);
    }
    static void sub()
    {
    	System.out.println(a-b);	
    }
    static void mul()
    {
    	System.out.println(a*b);
    }
    
     void div()
    {
    	System.out.println(a%b);
    }
	public static void main(String[] args) {
		
	add();
	sub();
	mul();
	Global3 n1=new Global3();
	n1.div();
	
		

	}

}
