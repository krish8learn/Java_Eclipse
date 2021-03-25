import java.lang.*;
import java.util.*;
public class fibo
{
	public static void main(String arg[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		int first=0,second=1,third;
		
		for(int i = 0;i<=n;i++)
		{
			System.out.printf("  "+first);
			third=first+second;
			first=second;
			second=third;
		}
	}
}
		
		