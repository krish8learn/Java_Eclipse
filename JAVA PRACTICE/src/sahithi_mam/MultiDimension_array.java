package sahithi_mam;
import java.util.*;
import java.util.Arrays;

public class MultiDimension_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row and columns");
		int n = sc.nextInt();
		System.out.println("enter elements");
		int[][] abc = new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				abc[i][j] =sc.nextInt();
			}
		}
		
		int[] sortarr = new int[n*n];
		int x=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				sortarr[x] = abc[i][j];
				x++;
			}
		}
		
		Arrays.sort(sortarr);
		
		System.out.println("Min element:"+sortarr[0]);
		System.out.println("Max element:"+sortarr[sortarr.length-1]);
		sc.close();
	}

}
