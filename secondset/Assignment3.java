package secondset;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
	
		Scanner s1= new Scanner(System.in);
		System.out.println("enter the lenght");
		float lenght= s1.nextFloat();
		System.out.println("enter the height");
		float height= s1.nextFloat();
		float area = lenght*height;
		System.out.println("area of a reactangle is->"+area);

	}

}
