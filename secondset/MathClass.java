package secondset;

public class MathClass {

	public static void main(String[] args) {
	          
		int d=Math.addExact(5,6);
		System.out.println(d);
		//long e=Math.addExact(1234556, 56789);
		//System.out.println(e);
		System.out.println(Math.addExact(1234556l, 56789l));
		int a=Math.subtractExact(567, 67);
		System.out.println(a);
        long b=Math.subtractExact(123578990000l, 56);
        System.out.println(b);
        System.out.println(Math.max(1234556l, 56789l));
        System.out.println(Math.min(1234556l, 56789l));
        System.out.println(Math.sqrt(81));
        System.out.println(Math.addExact(1234556l, 56789l));
        System.out.println(Math.random());//unique value when we run it each time
        System.out.println(Math.abs(-81));//absolute will always give you positive value,if it is positive it gives positive
        System.out.println(Math.PI);//gives you double value
        
        
	}

}
