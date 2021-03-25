//constructor chaining //
import java.lang.*;
import java.util.*;
public class primenumber
{
	public static void main(String arg[])
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number : ");
		int n = s.nextInt();
		
		if(isprime(n))
		{
			System.out.println(n + "is a prime number");
		}
		else
		{
			System.out.println(n + "is not a prime number");
		}
	}
	
	public static boolean isprime(int n)
	{
		int m=n/2;
		if(n==0||n==1)
			return false;
		
		for(int i=2;i<=m;i++)
		{
			if(n%i==0)
				return false;
			
		}
		
		return true;
	}
}