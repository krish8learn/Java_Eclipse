package sahithi_mam.LB;
import java.util.Arrays;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "orange;banana;pineapple;mango;apple;cherry;pomegranate;lemon;papaya;grape;Guava;Lichi";
		System.out.println("Sorted:"+sorting(input1));
		
		String input2 = "orange;banana;@pineapple;mango;apple;cherry;pomegranate;lemon;papaya;gr#ape\";Strawberry;Lichi";
		System.out.println("Sorted:"+sorting(input2));
		
	}
	public static String sorting(String input) {
		String ret ="";
		//removing special characters from string
		String[] word = input.split(";");
		for(int i=0;i<word.length;i++)
		{
			 word[i] = word[i].replaceAll("[^a-zA-Z0-9]", "");
		}
		Arrays.sort(word);
		
		for(int i=0;i<word.length;i++)
		{
			ret+=word[i]+";";
		}
		return ret.substring(0, ret.length()-1);
	}

}
