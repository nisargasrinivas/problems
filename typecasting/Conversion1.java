package typecasting;

public class Conversion1 {
	
	
	public static void main(String[] args)
	{
	
	int a=100;
	double b1=a;//implecit way
	System.out.println(b1);
	
	
	int b= 100;
	double b2 =(double)b;
	System.out.println(b2);//EXplict way
	
	int a1=(int)67.7;
	System.out.println(a1);//narrowing
	
	double wt =88.6;
	int w3=(int)wt;//norrowing
	
	}
	
	

}
