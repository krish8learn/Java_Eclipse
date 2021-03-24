package collection.cursor;
import java.util.*;

public class ArrayListandListIterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ob = new ArrayList<String>();
		ob.add("avik");
		ob.add("sayak");
		ob.add("krish");
		ob.add("sumana");
		ob.add("dadu");
		
		Iterator <String> it = ob.iterator();
		while(it.hasNext())
		{
			String st = it.next();
			if(st.equals("sumana"))
			{
				it.remove();
			}
			System.out.println(ob);
		}
	}

}
