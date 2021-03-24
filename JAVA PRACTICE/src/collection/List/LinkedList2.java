package collection.List;
import java.util.*;

public class LinkedList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  //print data by for each loop, get(), ListIterator
		LinkedList<Book> lt = new LinkedList<Book>();
		lt.add(null);
		lt.add(new Book(1,"java","ratan"));
		lt.add(new Book(2,"python","chuck"));
		//lt.add(new Book(3,"football","krish"));
		//lt.add(new Book(4,"champion","james"));
		//lt.add(new Book(5,"bond","chrales"));
		//lt.add(new Book(6,"harry potter","rowling"));
		lt.removeFirst();
		System.out.println("Using for each ");
		for(Book b:lt)
		{
			System.out.println("id:"+b.id+", name:"+b.name+", author:"+b.author);
		}
		
		System.out.println("using ListIterator");
		ListIterator<Book> ltr = lt.listIterator();
		ltr.add(new Book(4,"c++","burowski"));
		while(ltr.hasNext())
		{
			Book b = ltr.next();
			System.out.println("id:"+b.id+", name:"+b.name+", author:"+b.author);
			if(b.name.equals("java"))
			{
				ltr.remove();
			}
			//System.out.println("id:"+b.id+", name:"+b.name+", author:"+b.author);
		}
		
		System.out.println("using get");
		for(int i=0;i<lt.size();i++)
		{
			Book b = lt.get(i);
			System.out.println("id:"+b.id+", name:"+b.name+", author:"+b.author);
		}
		
		
		
	}

}
