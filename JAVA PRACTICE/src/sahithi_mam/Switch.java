package sahithi_mam;
import java.util.*;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter these options: a,e,i,o,u");
		char ch = sc.next().charAt(0);
		
		switch(ch) {
		case 'a':
			System.out.println("air");
			break;
		case 'e':
			System.out.println("egg");
			break;
		case 'i':
			System.out.println("icecream");
			break;
		case 'o':
			System.out.println("owl");
			break;
		case 'u':
			System.out.println("uno");
			break;
		}
		

	}

}
