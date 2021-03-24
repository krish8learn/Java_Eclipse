package sahithi_mam.LB;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "Sahithi";
		String input2 = "ihtihaS";
		System.out.println("Weight:"+String.valueOf(weight(input1,input2)));
		String input3="Sahithi";
		String input4 = "ihtihas";
		System.out.println("Weight:"+String.valueOf(weight(input3,input4)));
		String input5 = "abcd";
		String input6 = "bcda";
		System.out.println("Weight:"+String.valueOf(weight(input5,input6)));
	}
	
	public static int weight(String input10,String input11)
	{
		int ret =0;
		int weight=0;
		int fronts1 =0;
		int backs2 =input11.length()-1;
		while(fronts1 != input10.length())
		{
			if(input10.charAt(fronts1)==input11.charAt(backs2))
			{
				weight+=(fronts1+1);
			}
			else {
				weight+=0;
			}
			fronts1++;
			backs2--;
		}
		
		System.out.println(weight);
		int val = internalweight(weight);
		if(val<10)
		{
			ret = val ;
		}
		else
		{
			ret =internalweight(val);
		}
		return ret;
	}
	
	public static int internalweight(int input)
	{
		int sum =0;
		int copy = input;
		while(copy!=0)
		{
			sum +=copy%10;
			copy/=10;
		}
		return sum;
	}

}
