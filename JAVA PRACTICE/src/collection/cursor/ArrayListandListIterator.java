package collection.cursor;
import java.util.*;

public class ArrayListandListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ob = new ArrayList<Integer>();
		ob.add(2);
		ob.add(4);
		ob.add(8);
		ob.add(4);
		ob.add(9);
		ob.add(12);
		//accessing object using ListIterator generic version
		ListIterator<Integer> it = ob.listIterator();
		while(it.hasNext())
		{
			int x = it.next();
			int i = it.nextIndex();
			int p = it.previousIndex();
			System.out.println("element:"+x+",index:"+i+",previous index:"+p);
		}
		it.set(32);
		/*we can use hasPrevious() on the place of hasNext()*/
		for(int ab:ob)
		{
			System.out.println(ab);
		}
	}
}
