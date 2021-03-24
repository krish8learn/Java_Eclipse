package sahithi_mam.LB;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input3 = "hidasyun";
		String input4 = "hyd;blr;delhi;goa;india;usa;idn";
		System.out.println("1st case:"+namepossibility(input3,input4));
		
		String input5 = "mabgtinlope";
		String input6 = "mango;apple;banana;guava;tea;ice;nut;grape;lemon";
		System.out.println("2nd case:"+namepossibility(input5,input6));
		
		String input7 = "abcrstuv";
		String input8 = "bike;car;jeep;taxi;bus;van;boat";
		System.out.println("3rd case:"+namepossibility(input7,input8));
		
	}
	public static String namepossibility(String input1, String input2)
	{
		String ret =" ";
		//1st convert the 2nd string into string array to get the words
		String[] word = input2.split(";");
		//System.out.println(word);
		int wordcount =0;
		for(int i=0;i<word.length;i++)
		{
			int present =0;
			for(int j=0;j<word[i].length();j++)
			{
				for(int k=0;k<input1.length();k++)
				{
					if(word[i].charAt(j)==input1.charAt(k))
					{
						present++;
					}
				}
			}
			if(present == word[i].length())
			{
				wordcount++;
				ret+=word[i]+";";
			}
		}
		ret = ret.substring(0, ret.length()-1)+String.valueOf(wordcount);
		return ret;
	}

}
