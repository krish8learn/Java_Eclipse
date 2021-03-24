package sahithi_mam;

import java.util.Scanner;

public class Reverse_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		int num = sc.nextInt();
		int rem=0;
		int n =0;
		while(num!=0)
		{
			rem = num%10;
			n = n*10+rem;
			num = num/10;
		}
		System.out.println(n);
	}

}
