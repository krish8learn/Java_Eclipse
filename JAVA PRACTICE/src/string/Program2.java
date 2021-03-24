package string;

public class Program2 {
	public static String perform(String input1, String input2)
	{
		String ret = "";
		input1 = input1.toUpperCase();
		//input1 = input1.replace("_", "");
		char[] ch1 = input1.toCharArray();
		input2 = input2.toUpperCase();
		String[] strArray = input2.split(":");
		
		
		for(int i=0;i<strArray.length;i++)
		{
			int count =0;
			char[] ch2 = strArray[i].toCharArray();
			//if(input1.length()==strArray.length)
			{
				for(int j=0;j<ch1.length;j++)
				{
					//System.out.println(ch1[j]+","+ch2[j]);
					int comp = Character.compare(ch1[j], ch2[j]);
					if(comp==0)
					{
						count++;
						//System.out.println(count);
					}
					
				}
			}
			
			if(count==4)
			{
				ret = ret+strArray[i] +":";
			}
		}
		if(ret.length()==0)
		{
			ret = "ERROR";
		}
		else if(ret.length()>0)
		{
			ret = ret.substring(0,ret.length()-1);
		}
		return ret;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "fi_er";
		String input2 = "fever:filgher:filter:fihjxer:fibetr:fibyre:tailor:offer";
		System.out.println(perform(input1,input2));
		

	}

}
