package collection.cursor;
import java.util.*;

public class ArraylistIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ob = new ArrayList<String>();
		ob.add("avik");
		ob.add("sayak");
		ob.add("krish");
		ob.add("arunava");
		
		//reading data by iterator cursor(generic)
		Iterator<String> it = ob.iterator();
		while(it.hasNext())
		{
			String st = it.next();
			System.out.println(st);
		}

	}

}
