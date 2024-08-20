package colloctionMethod1;

import java.util.Collections;
import java.util.ListIterator;
import java.util.Vector;

public class VectorPro {

	public static void main(String[] args) {
		
		Vector v1=new Vector();
		v1.add(123);
		v1.add(56);
		v1.add(78);
		//Collections.sort(v1);
		//System.out.println(v1);
		System.out.println(v1);
		
		
		Vector v2=new Vector();
		v2.add(44);
		v2.add("ram");
				v2.add(67);	
        v2.add("trg");
        v2.add(null);
        v2.add(null);
        v2.add(null);
        System.out.println(v2);
        
        System.out.println("itrator");
        
        ListIterator l3= v1.listIterator();
		
	       
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
