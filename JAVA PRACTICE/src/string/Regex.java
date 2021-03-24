package string;
import java.util.regex.*;

public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern P = Pattern.compile(".m"); /* 1st character could be anything, 2nd character is m */
		Matcher M = P.matcher("am");  
		boolean b1 = M.matches();
		System.out.println(b1);
		
		
		boolean b2= Pattern.matches(".m","am");
		System.out.println(b2);
		
		boolean b3 = Pattern.compile(".m").matcher("monica").matches();
		System.out.println(b3);
		/* here we are trying to predict the our desired string by giving metacharacter expression */
		/*find a string which 1st letter is could be anything but 2nd letter must be 'm' */
		
		System.out.println(Pattern.matches("[amn]","acd"));
		/* try to find any of these single character inside third bracket from given string "acd" */
		System.out.println(Pattern.matches("[^amn]", "acd"));
		/* try to find any character except present character inside third bracket*/
		System.out.println(Pattern.matches("[a-zA-Z]", "T"));
		/*try to find a-z and A-Z which matches with 2nd string*/
		System.out.println(Pattern.matches("[MS][a-z]{5}", "Monica"));
		/* try to find a string which start by M or S followed by a-z and length of character is 5*/
		System.out.println(Pattern.matches("[xyz]?", "x"));
		/* try to check whether x,y,z occurs 0 or 1 */
		System.out.println(Pattern.matches("[xyz]+", "y"));
		/*try to check whether x,y,z occurs 1 or more */
		System.out.println(Pattern.matches("[xyz]*", "ui"));
		/*try to check whether x,y,z occurs 0 or more */
		System.out.println(Pattern.matches("\\d", "5"));
		/*try to check whether the string is consists of digit or not*/
		System.out.println(Pattern.matches("\\D", "rty"));
		/*try to check whether if the string has not any digit in it means only consists of character*/
	}

}
