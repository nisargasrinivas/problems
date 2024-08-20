package exception;

public class Try2_catch2 {

	public static void main(String[] args) {
		
		
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
		System.out.println("the roll");
		
	}

}
