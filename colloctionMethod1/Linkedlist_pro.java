package colloctionMethod1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist_pro {

	public static void main(String[] args) {
		
		LinkedList L1= new LinkedList();
		
		
		L1.add(56);
		L1.add(78);
		L1.add(456);
		L1.add(12);
		
		Collections.sort(L1);
		System.out.println(L1);
		
		L1.add("get");
		L1.add("hat");
		L1.add(12);
		
		L1.add(null);
		L1.add(null);
		L1.add(null);
		System.out.println(L1);
		
		 ListIterator l3= L1.listIterator();
			
	       
	       while(l3.hasNext())

	       {
	    	   System.out.println(l3.next());
	       }
		
	       while(l3.hasPrevious())

	       {
	    	   System.out.println(l3.previous());
	       }
		
		

	}

}
