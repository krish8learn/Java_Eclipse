package random;
import java.util.*;

public class Non_rep {
	
	public static int find(int input1)
	{
		int ret =0;
		//convert the number into arraylist
		ArrayList<Integer> ls = new ArrayList<Integer>();
		while(input1!=0)
		{
			ls.add(input1%10);
			input1/=10;
		}
		//convert the arraylist into array
		int[] ar = new int [ls.size()];
		Iterator<Integer> iterator = ls.iterator();
		for(int i=0;i<ls.size();i++)
		{
			ar[i]=iterator.next().intValue();
		}
		int count1 = ar.length;
		System.out.println(count1);
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+",");
		}
		System.out.println();
		//check whether the array all same element or not for more than or equal to 3 digit number
		if(ar[0]==ar[1] && ar[1]==ar[2])
		{
			return 0;
		}
		else
		{
			for(int i =0;i<ar.length;i++)
			{
				for(int j=0;j<ar.length;j++)
				{
					if(i!=j)
					{
						if(ar[i]==ar[j])
						{
							count1--;
						}
					}
					
				}
			}
		}
		ret = count1;
		return ret;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1 = 105;
		System.out.println(find(input1));

	}

}
