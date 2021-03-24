package collection.List;
import java.util.*;

public class Arraylist2 {

	public static void main(String[] args) {
		ArrayList<Object> a1 = new ArrayList<Object>();
		a1.add(new Employee(111,"ratan"));
		a1.add(new Employee(232,"krish"));
		a1.add(new Student(1,"durga"));
		a1.add(100);
		a1.add(null);
		System.out.println(a1.toString()); /*this returns only object form of data*/
		System.out.println(a1);
		for(Object o :a1)
		{
			if(o instanceof Employee)
			{
				Employee e = (Employee) o;
				System.out.println(e.eid+" "+e.ename);
			}
			if(o instanceof Student)
			{
				Student s = (Student) o;
				System.out.println(s.stdid+" "+s.sname);
			}
			if(o instanceof Integer)
			{
				System.out.println(o);
			}
			if(o == null)
			{
				System.out.println(o);
			}
		}
		Object o = a1.get(1);
		if(o instanceof Student)
		{
			Student s1 = (Student) o;
			System.out.println(s1.stdid+" "+s1.sname);
		}
		if(o instanceof Employee)
		{
			Employee e1 = (Employee)o;
			System.out.println(e1.eid+" "+e1.ename);
		}
		Student s = (Student)a1.get(2);  /*this may throw object class exception*/
		System.out.println(s.stdid+" "+s.sname);
	}
}
