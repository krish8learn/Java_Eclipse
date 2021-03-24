package random;
import java.util.*;

public class Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Vector <Integer>v = new java.util.Vector<Integer>();
		System.out.println(v.capacity());
		for(int i=0;i<30;i++)
		{
			v.add(i);
		}
		Iterator<Integer> it = v.iterator();
		while(it.hasNext())
		{
			int element = it.next();
			if (element%2!=0)
			{
				it.remove();
			}
		}
		ArrayList<Integer> al = new ArrayList<Integer>(v);
		System.out.println(al);
		System.out.println(v.capacity());
	}

}
