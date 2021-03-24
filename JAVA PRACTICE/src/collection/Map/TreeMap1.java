package collection.Map;
import java.util.*;
import java.util.Map.Entry;
public class TreeMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>(new Mycomp());
		tm.put(3, "avik");
		tm.put(2,"krish");
		tm.put(1,"rish");
		tm.put(5,"shubo");
		tm.put(4,"sayak");
		tm.put(7,"Liverpool");
		tm.put(8,"chelsea");
		tm.put(9,"Mancity");
		tm.put(23,"burnley");
		tm.put(13,"Stoke");
		tm.put(15,"kansas");
		tm.put(12,"westHam");
		tm.put(22,"Leeds");
		System.out.println(tm);
		
		SortedMap<Integer,String> ms=tm.subMap(22,8);
		TreeMap<Integer,String> tm1 = new TreeMap<Integer,String>(ms);
		System.out.println(tm1);
		System.out.println(tm1.entrySet());
		Set<Entry<Integer,String>> st = tm1.entrySet();
		for(Entry<Integer,String>ob:st)
		{
			System.out.println(ob.getKey()+","+ob.getValue());
		}

	}

}
class Mycomp implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return -o1.compareTo(o2);
	}
	
}
