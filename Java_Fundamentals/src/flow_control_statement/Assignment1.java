package flow_control_statement;

import java.util.Scanner;

public class Assignment1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x =sc.nextInt();
		int y = sc.nextInt();
		
		if(x%10==y%10)
		{
			System.out.println("true");
		}
		else
			System.out.println("False");
	}

}
