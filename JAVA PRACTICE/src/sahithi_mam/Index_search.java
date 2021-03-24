package sahithi_mam;
import java.util.*;
public class Index_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] abc = {2,3,4,2,5,5};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter searching index");
		int n = sc.nextInt();
		System.out.println(abc[n]);
		
		int num = sc.nextInt();
		for(int i=0;i<abc.length;i++)
		{
			if(num==abc[i])
			{
				System.out.println(i);
			}
		}
	}

}
