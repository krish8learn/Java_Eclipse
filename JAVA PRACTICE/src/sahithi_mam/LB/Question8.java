package sahithi_mam.LB;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "Wipro";
		String input2 = "Technologies";
		int input3 = 0;
		int input4 = 0;
		System.out.println("1st case:"+Extraction(input1,input2,input3,input4)); //wprtechngles
		
		String input5 = "Wipro";
		String input6 = "Technologies";
		int input7 = 1;
		int input8 = 1;
		System.out.println("2nd case:"+Extraction(input5,input6,input7,input8)); //IOOOI
		
		String input9 = "Apples";
		String input10 = "PEARL";
		int input11 = 0;
		int input12 = 1;
		System.out.println("3rd case:"+Extraction(input9,input10,input11,input12)); //SR
		
		String input13 = "Apples";
		String input14 = "PEARL";
		int input15 = 1;
		int input16 = 0;
		System.out.println("4th case:"+Extraction(input13,input14,input15,input16));  //applepeal
	}
	public static String Extraction(String input1,String input2, int input3, int input4)
	{
		String ret ="";
		input1 = input1.toLowerCase();
		input2 = input2.toLowerCase();
		String output = "";
		if(input3==1) {
			//just extracting the characters present in both words
			
			//1st word
			for(int i=0;i<input1.length();i++)
			{
				for(int j=0;j<input2.length();j++)
				{
					if(input1.charAt(i)==input2.charAt(j))
					{
						output +=Character.toString(input1.charAt(i));
						break;
					}
				}
			}
			//2nd word
			for(int i=0;i<input2.length();i++)
			{
				for(int j=0;j<input1.length();j++)
				{
					if(input2.charAt(i)==input1.charAt(j))
					{
						output+=Character.toString(input2.charAt(i));
						break;
					}
				}
			}
		}else if(input3==0) {
			
			//extracting the uncommon characters from both words
			
			//1st step extracting common characters for only once
			String present = "";
			for(int i=0;i<input1.length();i++)
			{
				for(int j=0;j<input2.length();j++)
				{
					if(input1.charAt(i)==input2.charAt(j))
					{
						present +=Character.toString(input1.charAt(i));
						break;
					}
				}
			}
			
			//removing the common characters from both words  
			//System.out.println("present:"+present);
			
			char[] input1ch =input1.toCharArray();
			char[] input2ch =input2.toCharArray();
			
			//removing the characters from 1st word
			for(int i=0;i<present.length();i++)
			{
				for(int j=0;j<input1.length();j++)
				{
					if(present.charAt(i)==input1.charAt(j))
					{
						input1ch[j] =' ';
					}
				}
			}
			
			//removing the characters from 2nd characters
			for(int i=0;i<present.length();i++)
			{
				for(int j=0;j<input2.length();j++)
				{
					if(present.charAt(i)==input2.charAt(j))
					{
						input2ch[j] =' ';
					}
				}
			}
			
			//converting character array to string and concatenating them
			output = String.valueOf(input1ch) + String.valueOf(input2ch);
			//removing spcaes 
			output = output.replaceAll(" ", "");
		}
		
		if(input4==0)
		{
			ret = output.toLowerCase();
		}
		else if(input4==1)
		{
			ret = output.toUpperCase();
		}
		
		return ret;
	}

}
