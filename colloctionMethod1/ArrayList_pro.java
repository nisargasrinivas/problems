package colloctionMethod1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ListIterator;

public class ArrayList_pro {

	public static void main(String[] args) {
		
		ArrayList a1= new ArrayList();
		a1.add(34);
		a1.add(456);
		a1.add(67);
		a1.add(56.8);
		a1.add("ram");
		a1.add("raj");
		a1.add("ram");
		a1.add("raj");
		a1.add(null);
		a1.add(null);
		a1.add(null);
		
		
		ArrayList a2= new ArrayList();
		a2.add(66);
		a2.add(45);
		a2.add(98);
		
		
		
		
	Collections.sort(a2);
		
		System.out.println(a2);
		
		
		
		
		ListIterator l3= a1.listIterator();
		
	       
	       while(l3.hasNext())

	       {
	    	   System.out.println(l3.next());
	       }
		
	       while(l3.hasPrevious())

	       {
	    	   System.out.println(l3.previous());
	       }
		
		System.out.println(a1);
		
		

	}

}
