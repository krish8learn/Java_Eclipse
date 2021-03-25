//use of scanner class//
import java.util.*;
class input5
{
	public static void main(String[] args)
	{
		System.out.println("the value of radius");
		Scanner sc = new Scanner (System.in);
		double radius = sc.nextDouble();
		double area = 3.14*radius*radius;
		System.out.println("the area is " +area);
		System.out.printf("the area is %10.5f \n",area);
	}
}