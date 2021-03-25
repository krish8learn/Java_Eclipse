//use of scanner class//
import java.util.Scanner;
class input4
{
	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		//"scanner" is class ,scnr is the object belong to "scanner" class, it takes the input from keyboard//
		System.out.println("enter the values of those integer variable");
		int a = scnr.nextInt();
		int b = scnr.nextInt();
		//saving the entered value in variables by scnr object//
		if(a>b)
		{
			System.out.printf("the bigger value between %d and %d is = %d\n" ,a,b,a);
		}
		else
		{
			System.out.printf("the bigger value between %d and %d is = %d\n" ,a,b,b);
		}
	}
}
		