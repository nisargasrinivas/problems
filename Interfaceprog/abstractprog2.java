package Interfaceprog;

abstract class A1{
	
	abstract void add();
	abstract void sub();
	void dev()
	{
	System.out.println("hi HEll0");	
	}
}

class B1 extends A1{
	void div()
	{
		System.out.println("hi HEll0");	
	}

	@Override
	void sub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void add() {
		// TODO Auto-generated method stub
		
	}
}

public class abstractprog2 extends B1
{
	
	void mul()
	{
		
	}

	public static void main(String[] args) {


	}

}
