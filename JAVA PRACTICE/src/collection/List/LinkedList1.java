package collection.List;
import java.util.*;
public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> lt = new LinkedList<String>();
		lt.add("avik");
		lt.add("krish");
		lt.add("sumana");
		lt.add("dadu");
		lt.add("samya");
		lt.add("sayan");
		lt.add("soubik");
		
		lt.addFirst("liverpool");
		lt.addLast("chelsea");
		System.out.println(lt);
		
		System.out.println(lt.size());
		
		lt.add(2," element");
		lt.set(3," element");
		System.out.println(lt);
		System.out.println(lt.isEmpty());
		lt.remove(); //1st index value removed//
		lt.remove("avik");
		lt.removeFirst();
		System.out.println(lt);
		lt.clear();
		System.out.println(lt);
		
	}

}
