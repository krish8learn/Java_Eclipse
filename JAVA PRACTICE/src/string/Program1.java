package string;

public class Program1 {
	
	public static String reverse(int input1,String input2)
	{
		String ret = "";
		String [] split = input2.split(" "); 
		if(input1==0)
		{
			for(int i=0;i<split.length;i++)
			{
				StringBuilder str = new StringBuilder(split[i]);
				str.reverse();
				split[i] = str.toString();
			}
			for(int i=0;i<split.length;i++)
			{
				ret = ret+split[i]+" ";
			}
		}
		else if(input1==1)
		{
			for(int i=0;i<split.length;i++)
			{
				StringBuilder str = new StringBuilder(split[i]);
				str.reverse();
				split[i] = str.toString();
			}
			for(int i =0;i<split.length;i++)
			{
				char[] arr = split[i].toCharArray();
				
				if(arr[0]!=',')
				{
					arr[0]=Character.toUpperCase(arr[0]);
					arr[split[i].length()-1] = Character.toLowerCase(arr[split[i].length()-1]);
				}
				else
				{
					//arr[0]=Character.toUpperCase(arr[0]);
					arr[split[i].length()-1] = Character.toUpperCase(arr[split[i].length()-1]);
				}
				
				
				
				for(int k = 0;k<split[i].length();k++)
				{
					split[i] = String.copyValueOf(arr);
				}
			}
			for(int i=0;i<split.length;i++)
			{
				ret = ret+split[i]+" ";
			}
		}
		return ret;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1 = 1; //just reverse the string
		String input2 ="Wipro Technoogies, Bangalore";
		System.out.println(reverse(input1,input2));

	}

}
