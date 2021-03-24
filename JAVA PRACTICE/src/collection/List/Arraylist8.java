package collection.List;
import java.util.*;
public class Arraylist8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> ob = new ArrayList<Book>();
		ob.add(new Book(111,"java","ratan"));
		ob.add(new Book(123,"c","vaskar"));
		ob.add(new Book(321,"python","chuck"));
		ob.add(new Book(212,"php","krish"));
		ob.add(new Book(451,"ruby","kreeti"));
		ob.add(new Book(245,"django","noman"));
		ob.add(new Book(156,"javascript","levis"));
		ob.add(new Book(326,"c++","james"));
		
		Iterator<Book> it = ob.iterator();
		while(it.hasNext())
		{
			Book b = it.next();
			if(b.id==111)
			{
				it.remove();
			}
			else if(b.name.equals("python"))
			{
				it.remove();
			}
		}
		for (Book ab : ob)
		{
			System.out.println(ab.id+","+ab.author+","+ab.name);
		}
	}

}
