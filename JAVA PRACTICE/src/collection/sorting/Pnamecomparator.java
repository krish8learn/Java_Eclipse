package collection.sorting;

import java.util.Comparator;

public class Pnamecomparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Product p1 = (Product) o1;
		Product p2 = (Product) o2;
		return  p1.pname.compareTo(p2.pname);
	}
	

}
