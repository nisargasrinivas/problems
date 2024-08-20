package problems;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) 
	{
		int Esalary[]=new int[3];
		Esalary[0]=789;
		Esalary[1]=89;
		Esalary[2]=99;
		
		int Manager[]= new int[3];
		
		for(int i=0,k=2;i<Esalary.length;i++,k--)
		{
		Manager[k]=Esalary[i];	
		}
		System.out.println(Arrays.toString(Manager));
		System.out.println(Arrays.toString(Esalary));
		

	}

}
