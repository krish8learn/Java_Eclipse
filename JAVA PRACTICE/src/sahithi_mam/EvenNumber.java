package sahithi_mam;
import java.util.*;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter num");
		int num = sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Even number");
		}
		else {
			System.out.println("Not even");
		}
		sc.close();
		
		System.out.println("printing even number");
		for(int i=1;i<50;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+",");
			}
		}

	}

}
