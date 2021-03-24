package sahithi_mam.LB;
import java.util.*;
import java.util.Map.Entry;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int date = 21;
		String month = "march";
		int year = 2005;
		
		HashMap<String,Integer> monthday = new HashMap<String,Integer>();
		monthday.put("jan", 31);
		monthday.put("feb", 28);
		monthday.put("march", 31);
		monthday.put("april", 30);
		monthday.put("may", 31);
		monthday.put("june", 30);
		monthday.put("july", 31);
		monthday.put("august", 31);
		monthday.put("september", 30);
		monthday.put("october", 31);
		monthday.put("november", 30);
		monthday.put("december", 31);
		
		/*at first we will check the year validation then we will compare the month name with hashmap key , 
		 if that's true we would find the month number after that date+monthnumber + year would be converted string */
		
		int getmonthnum=0;
		if(year>2030)
		{
			System.out.println("Invalid year");
		}
		else if(year<2030)
		{
			Set<Entry<String,Integer>> em = monthday.entrySet();
			int monthnum =01;
			for(Entry<String,Integer>ss:em)
			{
				if(ss.getKey().equals(month))
				{
					if(ss.getValue()<date)
					{
						System.out.println("Invalid date of:"+month);
						break;
					}
					else 
					{
						getmonthnum = monthnum;
					}
				}
				monthnum++;
			}
			
			//converting date into string
			String valofdate ="";
			if(date<10)
			{
				valofdate = "0"+Integer.toString(date);
			}
			else
			{
				valofdate = String.valueOf(date);
			}
			
			//converting month number into string
			String valofmonthnum ="";
			if(getmonthnum<10)
			{
				valofmonthnum = "0"+Integer.toString(getmonthnum);
			}
			else
			{
				valofmonthnum = String.valueOf(getmonthnum);
			}
			
			String str = valofdate+valofmonthnum+Integer.toString(year);
			System.out.println(str);
			
			 StringBuilder sb=new StringBuilder(str);  
			 sb.reverse();
			 
			 String ans = sb.toString();
			 System.out.println(ans);
			 
			 if(str.equals(ans))
			 {
				 System.out.println("Palindrome");
			 }
			 else {
				 System.out.println("not palindrome");
			 }
		}

	}

}
