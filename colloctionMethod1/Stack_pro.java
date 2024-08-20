package colloctionMethod1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class Stack_pro {

	public static void main(String[] args) {
Stack L1= new Stack();
		
		
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
