package collection.List;
import java.util.*;

public class ArrayList5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//conversion arrays------->collection
		String [] abc = {"krish","sayak","subhashish", "avik"};
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(abc));
		al.add(null);
		al.add("arunava");
		al.add("arghya");
		System.out.println(al);
		
		//conversion of collection to arrays
		ArrayList<String> ab = new ArrayList<String>();
		ab.add("liverpool");
		ab.add("chelsea");
		ab.add("mancity");
		
		String[] as = new String[ab.size()];
		ab.toArray(as);
		for(String ss : as)
		{
			System.out.println(ss);
		}
		//conversion heterogeneous collection to array
		ArrayList<Object> ob = new ArrayList<Object>();
		ob.add(100);
		ob.add("krish");
		ob.add("liverpool");
		Object[] oc = ob.toArray();
		for(Object oo:oc)
		{
			System.out.println(oo);
		}
	}

}
