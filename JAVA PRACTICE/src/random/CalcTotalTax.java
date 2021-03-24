package random;

public class CalcTotalTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long [] array = {1000,2000,3000,4000,5000};
		System.out.println("Total tax:"+caltotaltaxmethod(array));
	}
	
	public static int caltotaltaxmethod(long [] array)
	{
		long tax_amount = 0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>1000)
			{
				tax_amount = tax_amount + (((array[i]-1000)*10)/100);
			}
		}
		return Math.toIntExact(tax_amount);
	}

}
