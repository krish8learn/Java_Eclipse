package sahithi_mam.LB;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "sir";
		String s2 = "america";
		//finding out every s1 characters are present in the s2 or not
		System.out.println(s1.length());
		int count =0;
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					count++;
					break;
				}
			}
		}
		//removing character 
		System.out.println(count); 
		int op =0;
		char[] ch2 = s2.toCharArray();
		if(count >=s1.length())
		{
			for(int i=0;i<s1.length();i++)
			{
				for(int j=0;j<s2.length();j++)
				{
					if(s1.charAt(i)==ch2[j])
					{
						ch2[j] = ' ';
						op ++;
						break;
					}
				}
			}
			
			String strnew = new String(ch2);
			 strnew = strnew.replaceAll(" ", "");
			 System.out.println(strnew.replaceAll(" ", ""));
			 
			 int ascisum =0;
			 for(int i=0;i<strnew.length();i++)
			 {
				 //System.out.println((int)strnew.charAt(i));
				 ascisum+= (int)strnew.charAt(i);
			 }
			 System.out.println(ascisum);
		}
		else
		{
			int ascisumin =0;
			 for(int i=0;i<s2.length();i++)
			 {
				 //System.out.println((int)strnew.charAt(i));
				 ascisumin+= (int)s2.charAt(i);
			 }
			 System.out.println(ascisumin);
		}
	}

}
