package strings;

public class String_functions2 
{

	public static void main(String[] args)
	{
	
		String a1="Manish";
		System.out.println(a1.replace("M", "z"));
		boolean answer = a1.contains("tiwari");
		System.out.println(answer);
		String a2= "Manish Kumar Tiwari";
		System.out.println(a2.replace(" ", ""));//replace space with ntng 
		String a3= "Avinash Yadav";
		System.out.println(a3.replaceAll("[A-Z]", ""));//removes upper case
		System.out.println(a3.replaceAll("[a-z]", ""));//removes lower case
		String a4= "Avinash Yadav123";
		System.out.println(a4.replaceAll("[0-9]", ""));

	}

}
