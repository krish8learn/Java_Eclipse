package sahithi_mam;
import java.util.*;
import java.util.Arrays.*;
public class Max_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] abc = {23,67,23,45,12,56,44};
		Integer[] boxedArray = new Integer[abc.length];
		 
        for (int i = 0; i < abc.length; i++) {
            boxedArray[i] = Integer.valueOf(abc[i]);
        }
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(boxedArray));
		Collections.sort(al);
		System.out.println("max elements:"+al.get(abc.length-1));
		System.out.println("min elements:"+al.get(0));
		/*sorting, min, max done in this program*/
	}

}
