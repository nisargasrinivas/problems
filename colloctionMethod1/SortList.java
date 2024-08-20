package colloctionMethod1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		List l1= new ArrayList();
		l1.add(987);
		l1.add(23);
		l1.add(45);
		Collections.sort(l1);
		System.out.println(l1);
	}

}
