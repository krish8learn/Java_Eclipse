package collection.Map;
import java.util.*;
import java.util.Map.Entry;
public class Map2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap <Emp,Student> lmp = new LinkedHashMap<Emp,Student>();
		lmp.put(new Emp(111,"krish"), new Student(1,"Durga"));
		lmp.put(new Emp(151,"avik"), new Student(13,"anu"));
		lmp.put(new Emp(411,"shuva"), new Student(21,"shrama"));
		lmp.put(new Emp(1,"sayak"), new Student(15,"sharma"));
		lmp.put(new Emp(23,"avishek"), new Student(61,"Dravid"));
		
		System.out.println("normally");
		System.out.println(lmp);
		
		Set<Emp> s1 = lmp.keySet();
		for(Emp ep: s1)
		{
			System.out.println(ep.empid+","+ep.ename);
		}
		
		Collection <Student> st = lmp.values();
		for(Student st1 :lmp.values())
		{
			System.out.println(st1.stdid+","+st1.stname);
		}
		
		Set<Entry<Emp,Student>> sem = lmp.entrySet();
		Iterator<Entry<Emp,Student>> it = sem.iterator();
		while(it.hasNext())
		{
			Entry<Emp,Student> es = it.next();
			Emp ep1 = es.getKey();
			System.out.println(ep1.empid+","+ep1.ename);
			Student st1 = es.getValue();
			System.out.println(st1.stdid+","+st1.stname);
		}		
	}

}
