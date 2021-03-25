import java.util.*;
class sort
{
	public static void main(String args[])
	{
		int n,temp;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size");
		n = s.nextInt();
	    int arr[] = new int[n]; //int arr = new int [n];//
		System.out.println("enter all sizes");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if (arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("ascending order");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] + ",");
		}
	}
}
		