package collection.List;
import java.util.*;
public class ArrayList9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ac = {"krish","sayak","avik","arunava","subhashis"};
		ArrayList<String> ob = new ArrayList<String>(Arrays.asList(ac));
		ListIterator<String> it = ob.listIterator();
		System.out.println(ob);
		it.add("sravya");
		while(it.hasNext())
		{
			String st = it.next();
			if(st.equals("avik"))
			{
				it.remove();
			}
			if(st.equals("subhashis"))
			{
				it.set("supriyo");
			}
		}
		System.out.println(ob);
		for(String ss : ob)
		{
			System.out.println(ss);
		}

	}

}
