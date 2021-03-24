package collection.List;
import java.util.*;

public class Arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		ArrayList<Comparable> a1 = new ArrayList<Comparable>();
		a1.add("krish");   /*primitive data converted into object format known as autoboxing(automatic conversion of primitive to wrap objective)*/
		a1.add(10);
		a1.add(Integer.valueOf(100)); /*older version without autoboxing concept*/
		System.out.println(a1);
		System.out.println(a1.toString()); /* Arraylist contains multiple objects on every object tostring method executed.
tostring returns the data.*/
		System.out.println("krish");
	}

}
