package inheritance;
class Amazon
{
	static void login()
	{
		System.out.println("mobile no");
	}
	
	void registration()
	{
		System.out.println("registration");
	}
	
}

public class Single_Level extends Amazon
{
    static void loginID()
    {
    	System.out.println("email ID");
    }
    void logout()
    {
    	System.out.println("logout");
    }
	public static void main(String[] args) 
	{
	login();//parent calls method is called and it is static in nature
	loginID();
	Single_Level n1 = new Single_Level();//always create object of child class in order to acces the non static method of parent
	n1.registration();
	n1.logout();//non static method of non static method

	}

}
