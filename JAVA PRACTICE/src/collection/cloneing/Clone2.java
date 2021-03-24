package collection.cloneing;
import java.util.*;
public class Clone2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* create arraylist which object we would clone  and stored in another arraylist*/
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(34);
		//arraylist and vector can implement random access
		al1.add(45);
		al1.add(23);
		al1.add(25);
		al1.add(78);
		
		@SuppressWarnings("unchecked")
		ArrayList<Integer> al2 = (ArrayList<Integer>) al1.clone();
		System.out.println(al2);
	}

}
