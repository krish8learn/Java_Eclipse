package collection.sorting;
import java.util.*;
public class Eidcomparetor implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Emp2comparator e1 = (Emp2comparator) o1;
		Emp2comparator e2 = (Emp2comparator) o2;
		if(e1.eid == e2.eid)
		{
			return 0;
		}
		else if(e1.eid>e2.eid)
		{
			return 1;
		}
		else
			return -1;
	}
	
}
