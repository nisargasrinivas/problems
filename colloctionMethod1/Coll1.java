package colloctionMethod1;

import java.util.ArrayList;
import java.util.Collection;

public class Coll1 {

	public static void main(String[] args) {
		
		
		Collection c1= new ArrayList();
         c1.add("Age");
         c1.add("colour");
         c1.add(78);
         c1.add(false);
         c1.add(5.678);
         System.out.println(c1);
         
         
         Collection c2= new ArrayList();
         c2.addAll(c1);//copy c1 to c2
         System.out.println(c2);
         c2.add("rice");
         c2.add("sugar");
         System.out.println(c2);
         
         
         
         boolean b1= c2.equals(c1);
         System.out.println(b1);
         
         
         boolean b2=c1.isEmpty();
         System.out.println(b2);
         
         //c1.clear();
         
         c2.removeAll(c1);//removes the content of c1 in c2
         c1.remove(76);//removing perticular object from c1
         
         System.out.println(c2);
         System.out.println(c1);
         
         
         
         
	}

}
