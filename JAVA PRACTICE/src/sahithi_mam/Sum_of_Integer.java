package sahithi_mam;
import java.util.*;
public class Sum_of_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		int num = sc.nextInt();
		int rem=0;
		int sum=0;
		while(num!=0)
		{
			rem = num%10;
			sum = sum + rem;
			num /=10;
		}
		System.out.println(sum);
	}

}
