package exception;


import java.util.InputMismatchException;

public class Try3_catch3 {

	public static void main(String[] args) 
	{
int rollno[]=new int[3];
		
		rollno[0]=56;
		rollno[1]=78;
		rollno[2]=67;
		try
		{
        rollno[3]=89;
		}
		catch(ArrayIndexOutOfBoundsException a1)
		{
			
		}
		catch(InputMismatchException b1)
		{
			
		}
		catch(NullPointerException c1)
		{
			
		}

	}

}
