package collection.List;
import java.util.*;

public class Arraylist3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		ArrayList<Comparable> al = new ArrayList<Comparable>(); /*default constructor*/
		al.add("krish");
		al.add(123);
		al.add(null);
		al.add("sumana");
		al.add("tulie");
		al.add(8);
		System.out.println(al.size());
		System.out.println(al);
		al.add(2, "element");
		System.out.println(al);
		al.remove(2);
		al.remove(null);
		al.set(4, "element");
		System.out.println(al.isEmpty());
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
	}
}
