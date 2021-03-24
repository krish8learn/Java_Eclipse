package collection.sorting;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Emp1> al = new ArrayList<Emp1>();
		al.add(new Emp1(111,"krish"));
		al.add(new Emp1(134,"arunava"));
		al.add(new Emp1(11,"sayak"));
		al.add(new Emp1(121,"avik"));
		
		Collections.sort(al);
		
		for(Emp1 ep:al)
		{
			System.out.println(ep.eid+","+ep.ename);
		}
	}

}
