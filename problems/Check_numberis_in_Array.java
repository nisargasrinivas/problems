package problems;


import java.util.Scanner;

public class Check_numberis_in_Array {

	public static void main(String[] args) {
		int [] roll= new int[4];
		roll[0]=100;
		roll[1]=200;
		roll[2]=300;
		roll[3]=400;
		
		//int checkvalue = 500;
		
		Scanner s1= new Scanner(System.in);
		int checkvalue=s1.nextInt();
		
		
		for(int i=0;i<roll.length;i++)
		{
			if(checkvalue==roll[i])
			{
				System.out.println("given number exists");
			}
			else
			{
				System.out.println("given number does not exists");
			}
			
			s1.close();
		}
		
		
	
		
	}

}
