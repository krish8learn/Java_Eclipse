import java.lang.*;
import java.util.*;
public class armstrong
{
	public static void main(String arg[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		
		
		
			int rem,sum=0,power=0,originalnumber=n;
			while(n!=0)
			{
				n=n/10;
				power++;
			}
			n=originalnumber;
			while(n!=0)
			{
				rem=n%10;
				sum= sum + (int)Math.pow(rem,power);
				n=n/10;
			}
			
			if(sum==originalnumber)
				System.out.println(originalnumber +"armstrong");
			else
				System.out.println(originalnumber +"not armstrong");
		
	}
}