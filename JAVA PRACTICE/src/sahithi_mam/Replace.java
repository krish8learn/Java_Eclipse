package sahithi_mam;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] abc = new int[10];
		for(int i=0;i<abc.length;i++)
		{
			abc[i] = i+1;
		}
		for(int i=0;i<10;i++)
		{
			if(abc[i]%2==0)
			{
				abc[i] = 0;
			}
			else if(abc[i]%2!=0)
			{
				abc[i] =1;
			}
		}
		
		for(int i=0;i<abc.length;i++)
		{
			System.out.print(abc[i]+",");
		}

	}

}
