package sahithi_mam.LB;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1 = 234567;
		String input2 = "odd";
		Determine(input1,input2);
		
		int input3 = 123452;
		String input4 = "even";
		Determine(input3,input4);
		
		int input5 = 111111;
		String input6 = "even";
		Determine(input5,input6);

	}
	public static void Determine(int integer,String str)
	{
		String ans = " ";
		//converting the integer into an int array
		String integerstring = Integer.toString(integer);
		int[] inputarray = new int [integerstring.length()];
		for(int i=0;i<inputarray.length;i++)
		{
			inputarray[i] = integerstring.charAt(i) - '0';
			//System.out.println(inputarray[i]);
		}
		int summ =0;
		if(str.equals("odd"))
		{
			for(int i=0;i<inputarray.length;i++)
			{
				if(i%2==0 || i==0)
				{
					//System.out.println(inputarray[i]+","+i);
					summ+=(inputarray[i]*inputarray[i]);
				}
			}
			//System.out.println(summ);
			if(summ>27)
			{
				int val = sum(summ);
				ans = String.valueOf(Assign(val));
			}
			else if(summ<27)
			{
				ans = String.valueOf(Assign(summ));
			}
		}
		else if(str.equals("even"))
		{
			for(int i=0;i<inputarray.length;i++)
			{
				if(i%2!=0)
				{
					summ+=(inputarray[i]*inputarray[i]);
				}
			}
			if(summ>27)
			{
				int val = sum(summ);
				ans = String.valueOf(Assign(val));
			}
			else if(summ<27)
			{
				ans = String.valueOf(Assign(summ));
			}
		}
		
		System.out.println("ans:"+ans);
	}
	
	public static int sum(int integer)
	{
		int ret=0;
		int copy = integer;
		int sum =0;
		while(copy!=0)
		{
			sum +=copy%10;
			copy/=10;
		}
		ret = sum;
		return ret;
	}
	
	public static String Assign(int integer)
	{
		String ret=" ";
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		ret = String.valueOf(alphabet.charAt(integer-1));
		return ret;
	}

}
