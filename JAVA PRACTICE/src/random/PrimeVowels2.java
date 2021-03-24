package random;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class PrimeVowels2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1 = 3;
		int input2 = 5;
		//primevowel(input1);
		System.out.println(primevowel(input1));
		System.out.println(primevowel(input2));
	}
	
	public static String primevowel(int input) {
		String ret = "";
		//creating maps of prime number
		HashMap<Integer,String> primenumber = new HashMap<Integer,String>();
		
		//prime number 
		int primecount=0;
		for (int number=2;number<100;number++) {
			boolean flag = true;
			for(int i=2;i<number;i++) {
				if(number%i==0) {
					flag = false;
				}
			}
			if (flag == true) {
				primecount ++;
				//System.out.println(number);
				primenumber.put(primecount, numtoword(number));
			}
		}
		//System.out.println(primenumber.entrySet());
		TreeMap<Integer,String> tm=new  TreeMap<Integer,String> (primenumber); 
		//System.out.println(tm);
		ret = tovowel(tm, input);
		return ret;
	}
	
	
	public static String numtoword(int number) {
		
		//declaring values of map which would be used
		String unitsArray[] = { "zero", "one", "two", "three", "four", "five", "six", 
                "seven", "eight", "nine"};

		String words = "";
		int rem =0;
		
		if(number<10) {
			words+= unitsArray[number]; 
		}else if(number>9) {
			int copy = number;
			while(copy!= 0) {
				rem = copy%10;
				words += unitsArray[rem];
				copy/= 10;
			}
		}
			return words;
	}

	public static String tovowel(TreeMap example, int input) {
	String ret = "";
	char[] vowels = {'a','e','i','o','u'};
	int count = 0;
	Set<Entry<Integer,String>> em =example.entrySet();
	for(Entry<Integer,String> ss :em)
	{
		if(ss.getKey()==input) {
			//System.out.println(ss.getKey()+ss.getValue());
			char[] ch = ss.getValue().toCharArray();
			for(int i=0;i<ch.length;i++) {
				for(int j=0;j<vowels.length;j++) {
					if(ch[i]==vowels[j]) {
						count++;
						ret += ch[i];
					}
				}
			}
		}
	}
	//System.out.println(ret);
	return ret + String.valueOf(count);
}
	
}