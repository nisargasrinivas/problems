package colloctionMethod1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class HashSey_pro {

	public static void main(String[] args) {
HashSet L1= new HashSet();
		
		
		L1.add(56);
		L1.add(78);
		L1.add(456);
		L1.add(12);
		
		//Collections.sort(L1);
		//System.out.println(L1);
		
		L1.add("get");
		L1.add("hat");
		L1.add(12);
		
		L1.add(null);
		L1.add(null);
		L1.add(null);
		System.out.println(L1);
		
		Iterator i1= L1.iterator();
	       
	       while(i1.hasNext())

	       {
	    	   System.out.println(i1.next());
	       }
	      
		

	}

}
