package random;

public class StringDeletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ababa";
		int [] input1 = {10,5,10,5,10};
		System.out.println(solution(str, input1));
		
	}
	
	public static int solution(String str,int[] input1) {
		int sum = 0;
		char[] ch = str.toCharArray();
		for (int i=0; i<ch.length;i++) {
			if (i == ch.length-1) {
				break;
			}else {
				if (ch[i] == ch[i+1]) {
					sum = sum + input1[i];
				}
			}
		}
		return sum;
	}

}
