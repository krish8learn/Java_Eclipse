package logical_builing;
import java.util.*;

public class ArrayCommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Enter array elements of +ve real integer");
		String regex = "[^0-9 ]";
		Scanner sc = new Scanner(System.in);
		while(true) {
			String input = sc.next();
			if(input.matches(regex)) {
				System.out.println("Specials characters entered, accepting input has been stopped");
				break;
			}else {
				al.add(Integer.parseInt(input));
			}
		}
		
		for (int i=0;i<al.size();i++) {
			if (al.get(i)<0) {
				al.remove(i);
			}
		}
		
		Collections.sort(al);
		System.out.println(al);
	}

}
