package colloctionMethod1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Coll2 {

	public static void main(String[] args) {
		
		Collection c1= new ArrayList();
        c1.add("Age");
        c1.add("colour");
        c1.add(78);
        c1.add(false);
        c1.add(5.678);
        System.out.println(c1);
        
       Iterator i1= c1.iterator();
       
       while(i1.hasNext())

       {
    	   System.out.println(i1.next());
       }
       
       Collection c2= new ArrayList();
       c2.addAll(c1);//copy c1 to c2
       System.out.println(c2);
       c2.add("rice");
       c2.add("sugar");
       System.out.println(c2);
       
       System.out.println(c1.size());
       
       boolean b1=c1.contains("manish");
       System.out.println(b1);
       boolean b2=c2.containsAll(c1);
       System.out.println(b2);
       
       c1.add(null);
       c1.add(null);
       c1.add(null);
       c1.add("Age");
       
       System.out.println(c1);
	}

}
