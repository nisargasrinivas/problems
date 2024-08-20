package inheritance;

class Google
{
	Google()
	{
		
		System.out.println("google");
	}
	Google(int a)
	{
		this();//to call the other constructor in same class
		System.out.println("para");
	}
}

public class Constructor_SuperCalling extends Google
{
	Constructor_SuperCalling()
	{
		super(23);//implesetly present it is used to call parent call constructor from child constructor
		System.out.println("amazon");
	}
    
	public static void main(String[] args) 
	{
	
	new Constructor_SuperCalling();
	

	}

}
