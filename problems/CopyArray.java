package problems;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) 
	{
	double Esalary[]=new double[3];
	Esalary[0]=789.67;
	Esalary[1]=89.78;
	Esalary[2]=99.78;
	
	double Manager[]= new double[3];
	
	for(int i=0;i<Esalary.length;i++)
	{
	Manager[i]=Esalary[i];	
	
	}
	System.out.println(Arrays.toString(Manager));
	}
}
