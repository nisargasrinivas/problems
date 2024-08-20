package colloctionMethod1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class Colle4 {

	public static void main(String[] args) {
		Set s1= new HashSet();
		
		s1.add(34);
		s1.add("chirayu");
		s1.add(34.56);
		s1.add(67);
		s1.add(67);
		s1.add(56);
		s1.add("der");
		s1.add(12);
		s1.add(null);
		s1.add(null);
		s1.add(null);
		
		Set s2= new HashSet();
		s2.add(34);
		s2.add(78);
		s2.add(12);
		s2.add(45);
		
		
		
		Collections.sort(s2);
		
		Iterator i1= s1.iterator();
	       
	       while(i1.hasNext())

	       {
	    	   System.out.println(i1.next());
	       }
		
		System.out.println(s1);

	}

}
