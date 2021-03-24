package collection.Map;
import java.util.*;
import java.util.Map.Entry;
public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Krish");
		hm.put(2,"avik");
		hm.put(3,"rahul");
		System.out.println(hm);
		Set<Integer> s1 = hm.keySet();
		Collection<String> s2 = hm.values();
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(hm.entrySet());
		
		Set<Entry<Integer,String>> em = hm.entrySet();
		
		for(Entry<Integer,String> ss :em)
		{
			System.out.println(ss.getValue()+","+ss.getKey());
		}
 	}

}
