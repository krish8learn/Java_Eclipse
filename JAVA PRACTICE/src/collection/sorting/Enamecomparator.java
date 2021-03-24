package collection.sorting;
import java.util.*;
public class Enamecomparator implements Comparator<Emp2comparator> {

	@Override
	public int compare(Emp2comparator o1, Emp2comparator o2) {
		// TODO Auto-generated method stub
		return o1.ename.compareTo(o2.ename);
	}
	
}
