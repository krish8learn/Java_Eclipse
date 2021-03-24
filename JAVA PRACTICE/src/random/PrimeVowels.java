package random;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class PrimeVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1 = 3;
		int input2 = 5;
		System.out.println(primevowel(input1));
		System.out.println(primevowel(input2));

	}
	public static String primevowel(int input) {
		String ret = "";
		HashMap<Integer,String> number = new HashMap<Integer,String>();
		number.put(1, "one");
		number.put(2, "two");
		number.put(3, "three");
		number.put(4, "four");
		number.put(5, "five");
		number.put(6, "six");
		number.put(7, "seven");
		number.put(8, "eight");
		number.put(9, "nine");
		number.put(10, "ten");
		
		char[] vowels = {'a','e','i','o','u'};
		
		Set<Entry<Integer,String>> numset =number.entrySet();
		
		for(Entry<Integer,String> ss :numset)
		{
			if (input == ss.getKey()) {
				String str = ss.getValue();
				char[] ch = str.toCharArray();
				for (int i=0;i<ch.length;i++) {
					for(int j=0;j<vowels.length;j++) {
						if (ch[i]==vowels[j]) {
							ret+=ch[i];
							break;
						}
					}
				}
			}
		}
		
		return ret;
	}

}
