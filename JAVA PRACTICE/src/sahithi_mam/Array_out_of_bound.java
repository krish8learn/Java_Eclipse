package sahithi_mam;
import java.util.*;
public class Array_out_of_bound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[4];
		System.out.println("enter values");
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<6;i++)
		{
			arr[i] = sc.nextInt();
		}
	}

}
