package collection.sorting;
import java.util.*;
public class Test3 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Product> ll = new LinkedList<Product>();
		ll.add(new Product(34,"phone",5681));
		ll.add(new Product(12,"laptop",45000));
		ll.add(new Product(47,"adapter",4000));
		ll.add(new Product(23,"ps4",20000));
		ll.add(new Product(25,"xbox",23000));
		
		Collections.sort(ll);
		
		System.out.println("By using comparable interface Ascending order:");
		for (Product p : ll)
		{
			System.out.println(p.pid+","+p.cost+","+p.pname);
		}
		
		
		Collections.sort(ll, new Pidcomparator());
		System.out.println("By using comparator interface descending order");
		ListIterator<Product> lit = ll.listIterator();
		while(lit.hasNext())
		{
			Product p = lit.next();
			System.out.println(p.pid+","+p.cost+","+p.pname);
		}
		
		Collections.sort(ll,new Pnamecomparator());
		System.out.println("By using comparator interface based on name");
		Iterator<Product> it = ll.iterator();
		while(it.hasNext())
		{
			Product p = it.next();
			System.out.println(p.pname+","+p.cost+","+p.pid);
		}
		
	}

}
