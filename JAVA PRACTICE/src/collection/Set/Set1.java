package collection.Set;
import java.util.*;
public class Set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub    ///////adding one set collection to another set collection
		LinkedHashSet<String> lh = new LinkedHashSet<String>();
		lh.add("ratan");
		lh.add("data");
		lh.add("avik");
		System.out.println(lh);
		
		HashSet<String> hh = new HashSet<String>(lh);
		hh.add("krish");
		System.out.println(hh);
		
		LinkedHashSet<String> lh1 = new LinkedHashSet<String>();
		lh1.addAll(hh);
		lh1.addAll(lh);
		lh1.add("chelsea");
		System.out.println(lh1);
	}

}
