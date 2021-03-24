package collection.List;
import java.util.*;

public class Arraylist6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> abc = new ArrayList<String>();
		abc.add("avik");
		abc.add("krish");
		abc.add("sayak");
		abc.add("arghya");
		System.out.println("before swap: "+abc);
		
		Collections.swap(abc, 1, 3);
		System.out.println("after swap: "+abc);
		
		ArrayList<String> ab = new ArrayList<String>(abc.subList(1, 4));
		System.out.println(ab);
	}

}
