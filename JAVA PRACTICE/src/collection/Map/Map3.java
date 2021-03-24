package collection.Map;
import java.util.*;
import java.util.Map.Entry;
public class Map3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,Student> lmp = new LinkedHashMap<Integer,Student>();
		lmp.put(1, new Student(12,"krish"));
		lmp.put(2, new Student(14,"sayak"));
		lmp.put(3, new Student(15,"shuvo"));
		
		Set<Entry<Integer,Student>> sep =lmp.entrySet();
		Iterator<Entry<Integer,Student>> it = sep.iterator();
		while(it.hasNext())
		{
			Entry<Integer,Student> stp = it.next();
			Student st1 = stp.getValue();
			if(st1.stdid==14)
			{
				it.remove();
			}
		}
		
		for(Integer ip :lmp.keySet())
		{
			System.out.println(ip);
		}
		
		System.out.println();
		for(Student st1 :lmp.values())
		{
			System.out.println(st1.stdid+","+st1.stname);
		}
		
		System.out.println();
		Set<Entry<Integer,Student>> smp = lmp.entrySet();
		for(Entry<Integer,Student> ep : smp)
		{
			Student str = ep.getValue();
			System.out.println(ep.getKey()+","+str.stdid+","+str.stname);
		}
	}

}
