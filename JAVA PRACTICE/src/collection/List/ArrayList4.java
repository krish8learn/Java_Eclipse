package collection.List;
import java.util.*;
public class ArrayList4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*approach 1*/
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(100);
		a1.add(988);
		ArrayList <Integer> a2 = new ArrayList<Integer>(a1);
		a2.add(876);
		System.out.println(a2);
		/*2nd approach*/
		ArrayList<Integer> b1 = new ArrayList<Integer>();
		b1.add(234);
		b1.add(478);
		b1.add(589);
		ArrayList<Integer> b2 = new ArrayList<Integer>();
		b2.add(514);
		b2.add(12478);
		b2.add(1248);
		ArrayList<Integer> b3 = new ArrayList<Integer>();
		b3.add(675); /*one object adding*/
		b3.addAll(b1);  /*adding collection data*/
		b3.addAll(b2);
		b3.addAll(b3);
		System.out.println(b3);
	}

}
