package strings;

public class Trim_function {

	public static void main(String[] args) 
	{
		String a="my name is rama";
		String b="     my name is ramu      ";
		
		System.out.println(a.trim());//no change in string bcoz space in middle cant be removed
		System.out.println(b.trim());//+:" from starting and ending is removed
		
		String name= "Abhishek";
		String name1="abhishek";
		
		System.out.println(name.equals(name1));//to check its equal
		System.out.println(name.concat(name1));//joins the strig
		System.out.println(name.concat(" kumar Tiwari"));//concat
		System.out.println(name.equalsIgnoreCase(name1));//ignores the case and check the strings are equal
		
		
		

	}

}
