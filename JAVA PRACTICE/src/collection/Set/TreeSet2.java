package collection.Set;
import java.util.*;
public class TreeSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String>(new Mycomp());
		ts.add("Anu");
		ts.add("Liverpool");
		ts.add("dilip");
		ts.add("Avik");
		ts.add("karom");
		ts.add("chelsea");
		ts.add("wolves");
		System.out.println("Normal form:"+ts);
		
		
		TreeSet<Integer> st = new TreeSet<Integer>(new Mycomp1());
		st.add(45);
		st.add(12);
		st.add(43);
		st.add(16);
		st.add(89);
		st.add(34);
		st.add(55);
		System.out.println("Normal form:"+st);
	}
}
class Mycomp implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return -o1.compareTo(o2);
	}
}
class Mycomp1 implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return - o1.compareTo(o2);
	}
	
}