package problems;

import java.util.Arrays;

public class Arrayequal
{

	public static void main(String[] args) 
	{
		int[] rollno = new int[4];
		int [] rollno1 =new int[4];
		
		rollno[0]=56;
		rollno[1]=59;
		rollno[2]=678;
		rollno[3]=890;
		
		rollno1[0]=56;
		rollno1[1]=59;
		rollno1[2]=678;
		rollno1[3]=890;
		
		
		boolean b1 = Arrays.equals(rollno, rollno1);//to check they are equal 
		System.out.println(b1);
		
		

	}

}
