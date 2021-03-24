package collection.Set;
import java.util.*;
public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<>();
		hs.add("krish"); //return true
		hs.add("avik"); //return true
		hs.add("krish"); //ignored by default , return false
		hs.add("liverpool");
		System.out.println(hs);
		//insertion order not preserved
		
		
	}

}
