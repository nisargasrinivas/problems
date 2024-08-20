package basicprog;

public class Genderprog_1 {

	public static void main(String[] args) {
	String  gender1="Female";
	String gender2="male";
	int age=64;

	
	if (gender1 == "Female")
	{
	   System.out.println("travelling is free");

	}
	else
	{
		if(age<=12)
		{
			System.out.println("ticket is half");
		}
		else if(age>=12 && age <=59)
		{
			
			System.out.println("price is full");
		}
		else
		{
			System.out.println("ticket price on behalf of senior citizen");
		}
	}
}
}
