package collection.Map;
import java.util.*;
import java.util.Map.Entry;
public class TreeMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Product,Customer> tp = new TreeMap<Product,Customer>(new PidComp());
		tp.put( new Product(102,"Shirt",390),new Customer("krish"));
		tp.put( new Product(121,"phone",9000),new Customer("Sayak"));
		tp.put( new Product(100,"T-shirt",320),new Customer("Supriyo"));
		tp.put( new Product(182,"Tie",453),new Customer("avishek"));
		tp.put( new Product(165,"Pant",600),new Customer("rahul"));
		
		
		
		for(Entry<Product,Customer>ob:tp.entrySet())
		{
			Product pt = ob.getKey();
			Customer ct = ob.getValue();
			System.out.println(pt.pid+","+pt.pcost+","+pt.pname+"-----"+ct.cname);
		}
	}

}

