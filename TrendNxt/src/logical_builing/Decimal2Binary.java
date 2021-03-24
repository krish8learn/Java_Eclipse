package logical_builing;
import java.util.*;

public class Decimal2Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//logic 1 
		int number =0;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		System.out.println("The Binary number:"+Integer.toString(number,2));
		System.out.println("The Binary number:"+Integer.toBinaryString(number));

	}

}
