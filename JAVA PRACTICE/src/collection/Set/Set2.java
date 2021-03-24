package collection.Set;
import java.util.*;
public class Set2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> s1 = new HashSet<String>(); //set is parent class  Parent p = new Child()
		s1.add("durga");
		s1.add("durga");
		s1.add("chelsea");
		s1.add("avik");
		System.out.println(s1);
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("liverpool");
		al.add("liverpool");
		al.add("chelsea");
		al.add("Manchester United");
		al.add("Manchester city");
		
		HashSet<String> hs = new HashSet<String>(al);
		hs.add("wolves");
		System.out.println(hs);
	}

}
