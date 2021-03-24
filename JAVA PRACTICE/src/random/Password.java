package random;

import java.util.Arrays;

public class Password {
	public static int find(int input1, int input2, int input3)
	{
		//variable declaration area//
		int ret =0;
		int unit =0;
		int tens =0;
		int huns =0;
		int lar =0;
		
		//digit to array conversion//
		//for input1
		String str1 = Integer.toString(input1);
		int[] arr1 = new int[str1.length()];
		for(int i=0; i<str1.length();i++)
		{
			arr1[i] = str1.charAt(i)-'0';
		}
		//input2
		String str2 = Integer.toString(input2);
		int[] arr2 = new int[str2.length()];
		for(int i=0; i<str2.length();i++)
		{
			arr2[i] = str2.charAt(i)-'0';
		}
		//input3
		String str3 = Integer.toString(input3);
		int[] arr3 = new int[str3.length()];
		for(int i=0; i<str3.length();i++)
		{
			arr3[i] = str3.charAt(i)-'0';
		}
		
		//finding password position's value
		for(int i =2; i>=0;i--)
		{
			if(i==2)
			{
				if(arr1[i]<=arr2[i] && arr1[i]<=arr3[i])
				{
					unit = arr1[i];
				}
				else if(arr2[i]<=arr1[i] && arr2[i]<=arr3[i])
				{
					unit = arr2[i];
				}
				else
				{
					unit = arr3[i];
				}
					
			}
			else if(i==1)
			{
				if(arr1[i]<=arr2[i] && arr1[i]<=arr3[i])
				{
					tens= arr1[i];
				}
				else if(arr2[i]<=arr1[i] && arr2[i]<=arr3[i])
				{
					tens = arr2[i];
				}
				else
				{
					tens = arr3[i];
				}
			}
			else if(i==0)
			{
				if(arr1[i]<=arr2[i] && arr1[i]<=arr3[i])
				{
					huns = arr1[i];
				}
				else if(arr2[i]<=arr1[i] && arr2[i]<=arr3[i])
				{
					huns = arr2[i];
				}
				else
				{
					huns = arr3[i];
				}
			}
		}
		//merge every array to find the largest element
		int[] whole = new int[arr1.length+arr2.length+arr3.length];
		int a,b,c;
		for(a=0;a<arr1.length;a++)
		{
			whole[a] = arr1[a];
		}
		for(b=0;b<arr2.length;b++)
		{
			whole[a++] = arr2[b];
		}
		for(c=0;c<arr3.length;c++)
		{
			whole[a++] = arr3[c];
		}
		Arrays.sort(whole);
		lar = whole[whole.length-1];
		
		//the password 
		ret = lar*1000+huns*100+tens*10+unit;
		return ret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1 = 190;
		int input2 = 267;
		int input3 = 853;
		System.out.println(find(input1,input2,input3));

	}

}
