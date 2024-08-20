package colloctionMethod1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Coll3 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List l1= new ArrayList();
		
		l1.add("ramu");
		l1.add(455);
		l1.add(3300.23);
		l1.add("colour");
		l1.add(null);
		l1.add(null);
		l1.add(null);
		
		
		List l2= new ArrayList();
		l2.add(l2);
		l2.add(3378);
		l2.add(2900);

		Collections.sort(l2);
		
		ListIterator l3= l1.listIterator();
		
	       
	       while(l3.hasNext())

	       {
	    	   System.out.println(l3.next());
	       }
		
	       while(l3.hasPrevious())

	       {
	    	   System.out.println(l3.previous());
	       }
		
	/*	l1.add("ramu");
		l1.add(455);
		l1.add(3300.23);
		l1.add("colour");
		l1.add(null);
		l1.add(null);
		l1.add(null);
		
		
		l1.add("ramu");
		l1.add(455);
		l1.add(3300.23);
		l1.add("colour");
		l1.add(null);
		l1.add(null);
		l1.add(null);
		
		
		l1.add("ramu");
		l1.add(455);
		l1.add(3300.23);
		l1.add("colour");
		l1.add(null);
		l1.add(null);
		l1.add(null);
		
		l1.add("ramu");
		l1.add(455);
		l1.add(3300.23);
		l1.add("colour");
		l1.add(null);
		l1.add(null);
		l1.add(null);
		l1.add("ramu");
		l1.add(455);
		l1.add(3300.23);
		l1.add("colour");
		l1.add(null);
		l1.add(null);
		l1.add(null);
		l1.add("ramu");
		l1.add(455);
		l1.add(3300.23);
		l1.add("colour");
		l1.add(null);
		l1.add(null);
		l1.add(null);*/
		
		System.out.println(l1);
		
		
		
		
		
		
		
	}

}
