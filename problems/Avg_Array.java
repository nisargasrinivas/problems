package problems;

public class Avg_Array {

	public static void main(String[] args) {
		int [] roll= new int[4];
		roll[0]=100;
		roll[1]=200;
		roll[2]=300;
		roll[3]=400;
		double sum=0;
		
		for(int i=0;i<roll.length;i++)
		{
			sum= sum+roll[i];
			
		}
		
		System.out.println(sum);
		double  avg = sum/4;
		System.out.println(avg);
		

	}

}
