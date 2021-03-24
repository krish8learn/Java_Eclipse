package sahithi_mam.LB;
import java.util.*;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1 = 153;
		String str1 = "jaya";
		System.out.println(armstrongduplicateconcat(input1,str1));
		
		int input2 = 111;
		String str2 = "bhanuchandra";
		System.out.println(armstrongduplicateconcat(input2,str2));
	}
	
	public static String armstrongduplicateconcat(int input,String str)
	{
		String ret="";
		String armstr = "";
		//checking armstrong number
		if(checkarmstrong(input)==true)
		{
			int copy = input;
			int num =0;
			int diff =0;
			while(copy!=0)
			{
				num = copy%10;
				diff = num - diff;
				copy/=10;
			}
			ret =  removedup(str) +  Integer.toString(Math.abs(diff)) ;
		}
		else if(checkarmstrong(input)==false)
		{
			int copy = input;
			int num = 0;
			int sum =0;
			while(copy!=0)
			{
				num = copy%10;
				sum+=num;
				copy/=10;
			}
			ret =  removedup(str)+String.valueOf(sum); 
		}
		return ret;
	}
	
	
	public static boolean checkarmstrong(int input)
	{
		boolean ret = true;
		int copy = input;
		int sum = 0;
		int rem =0;
		while(copy!=0)
		{
			rem = copy % 10;
			sum+= (rem*rem*rem);
			copy/=10;
		}
		if(sum!=input)
		{
			ret = false;
		}
		return ret;
	}
	
	
	public static String removedup(String str)
	{
		String strr = "";
		char[] ch = str.toCharArray();
		for (int i = 0; i < str.length(); i++) 
        { 
			for(int j=0;j<ch.length;j++)
			{
				if(str.charAt(i)==ch[j] && i!=j)
				{
					ch[j] =' ';
				}
			}
        } 
		 strr = String.valueOf(Arrays.copyOf(ch, ch.length));
		 strr = strr.replaceAll(" ", "");
		 return strr;
	}

}
