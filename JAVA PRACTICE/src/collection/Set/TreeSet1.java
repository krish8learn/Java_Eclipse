package collection.Set;
import java.util.*;
public class TreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Anu");
		ts.add("Liverpool");
		ts.add("dilip");
		ts.add("Avik");
		ts.add("karom");
		ts.add("chelsea");
		ts.add("wolves");
		System.out.println(ts);
		System.out.println(ts.last());
		
		SortedSet<String> ss = ts.subSet("Liverpool", "wolves");
		TreeSet<String> st = new TreeSet<String>(ss);
		System.out.println(st);

	}

}
