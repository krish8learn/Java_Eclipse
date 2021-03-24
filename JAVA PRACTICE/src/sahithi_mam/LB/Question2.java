package sahithi_mam.LB;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "sahithi";
		System.out.println(evenoddremove(s1));
		String s2 = "priyas";
		System.out.println(evenoddremove(s2));
		String s3 = "pjp";
		System.out.println(evenoddremove(s3));
	}
	
	public static String  evenoddremove(String str)
	{
		String ret ="";
		char[] vowel = {'a','e','i','o','u'};
		int count =0;
		char[] sample = str.toCharArray();
		if(str.length()%2==0)
		{
			for(int i=0;i<str.length();i++)
			{
				for(int j=0;j<vowel.length;j++)
				{
					if(str.charAt(i)==vowel[j])
					{
						count++;
						if(i%2==0)
						{
							sample[i] = ' ';
						}
					}
				}
			}
			if(count ==0)
			{
				ret = str;
			}
			else
			{
				ret = new String(sample);
				 ret = ret.replaceAll(" ", "");
			}
		}
		else if(str.length()%2!=0)
		{
			for(int i=0;i<str.length();i++)
			{
				for(int j=0;j<vowel.length;j++)
				{
					if(str.charAt(i)==vowel[j])
					{
						if(i%2!=0)
						{
							sample[i] = ' ';
						}
					}
				}
			}
			if(count ==0)
			{
				ret = str;
			}
			else
			{
				ret = new String(sample);
				 ret = ret.replaceAll(" ", "");
			}
		}
		return ret;
	}
	
}
