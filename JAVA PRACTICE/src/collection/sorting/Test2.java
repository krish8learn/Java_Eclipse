package collection.sorting;
import java.util.*;
public class Test2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Emp2comparator> al = new ArrayList<Emp2comparator>();
		al.add(new Emp2comparator(12,"avik"));
		al.add(new Emp2comparator(45,"kris"));
		al.add(new Emp2comparator(32,"james"));
		al.add(new Emp2comparator(34,"Liverpool"));
		Collections.sort(al, new Enamecomparator());
		
		
		for(Emp2comparator ep : al)
		{
			System.out.println(ep.eid+","+ep.ename);
		}
		
		System.out.println();
		
        Collections.sort(al, new Eidcomparetor());
		for(Emp2comparator ep : al)
		{
			System.out.println(ep.eid+","+ep.ename);
		}
	}

}
