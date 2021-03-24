package random;
import java.util.*;
public class Vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		java.util.Vector<Product> vec = new java.util.Vector<Product>();
		vec.add(new Product(1, "shirt", 200));
		vec.add(new Product(2, "ball", 230));
		vec.add(new Product(3, "doll", 24));
		vec.add(new Product(4, "bootle", 20));
		vec.add(new Product(5, "pant", 280));
		vec.add(new Product(6, "batch", 300));
		
		java.util.Enumeration en = vec.elements();
		while(en.hasMoreElements())
		{
			Product p = (Product) en.nextElement();
			System.out.println(p.id+","+p.name+","+p.cost);
		}
		Iterator<Product> it = vec.iterator();
		while(it.hasNext())
		{
			Product p = it.next();
			if(p.id==2)
			{
				it.remove();
			}
			System.out.println(p.id+","+p.name+","+p.cost);
		}
		ListIterator<Product> lt = vec.listIterator();
		while(it.hasNext())
		{
			Product p = lt.next();
			System.out.println(p.id+","+p.name+","+p.cost);
		}
	}

}
