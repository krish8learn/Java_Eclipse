package sahithi_mam;

public class Flyods_format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("floyd format");
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("reverse floyd format");
		for(int i=3;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
