package logical_builing;
import java.util.*;
public class NumToWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		System.out.println(numtoword(number));
	}
	public static String numtoword(int number) {
		String unitArray[] = {"Zero","One","Two","Three","Four","Six","Seven","Eight","Nine", "Ten","Eleven","Twelve","Thirteen","Fourteen",
				"Fifteen", "Sixteen","Seventeen", "Eighteen", "Nineteen"};
		String tensArray[] = {"Zero","ten","Twenty","Thirty", "Forty", "Fifty","Sixty","Seventy", "Eighty", "Ninety"};
		
		String words = "";
		
		if (number == 0) {
		    return "zero";
		}
		// add minus before conversion if the number is less than 0
		if (number < 0) { 
	           // convert the number to a string
	           String numberStr = "" + number; 
	           // remove minus before the number 
	           numberStr = numberStr.substring(1); 
	           // add minus before the number and convert the rest of number 
	           return "minus " + numtoword(Integer.parseInt(numberStr)); 
	        } 
	        // check if number is divisible by 1 million
	        if ((number / 1000000) > 0) {
		   words += numtoword(number / 1000000) + " million ";
		   number %= 1000000;
		}
		// check if number is divisible by 1 thousand
		if ((number / 1000) > 0) {
		    words += numtoword(number / 1000) + " thousand ";
		    number %= 1000;
		}
		// check if number is divisible by 1 hundred
		if ((number / 100) > 0) {
		     words += numtoword(number / 100) + " hundred ";
		     number %= 100;
		}
	 
		if (number > 0) {
		     // check if number is within teens
		     if (number < 20) { 
	                    // fetch the appropriate value from unit array
	                    words += unitArray[number];
	             } else { 
	                // fetch the appropriate value from tens array
	                words += tensArray[number / 10]; 
	                if ((number % 10) > 0) {
			    words += "-" + unitArray[number % 10];
	                }  
		     }
	          }
		  return words;
	}

}
