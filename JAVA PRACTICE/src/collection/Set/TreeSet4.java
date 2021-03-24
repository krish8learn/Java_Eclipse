package collection.Set;
import java.util.*;
public class TreeSet4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ti = new TreeSet<>();
		ti.add(34);
		ti.add(23);
		ti.add(98);
		for(int i=0;i<20;i++)
		{
			ti.add(i);
		}
		System.out.println(ti);
		
		SortedSet<Integer> st = ti.subSet(3, 17);
		TreeSet<Integer> ti2 = new TreeSet<Integer>(st);
		System.out.println(ti2);
		
		SortedSet<Integer> st2 = ti.tailSet(3);
		TreeSet<Integer> ti3 = new TreeSet<Integer>(st2);
		System.out.println(ti3);
		
		SortedSet<Integer> st3 = ti.headSet( 5);
		TreeSet<Integer> ti4 = new TreeSet<Integer>(st3);
		System.out.println(ti4);
	}

}
