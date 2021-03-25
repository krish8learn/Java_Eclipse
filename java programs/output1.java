//printf syntex in java//
class output1
{
	public static void main(String[] args)
	{
		int x=100;
		System.out.printf("the value of x= %d\n",x);
		
		//printing value upto 2 decimals//
		System.out.printf("the value of PI up to 8 decimal after point = %.8f\n", Math.PI);
		
		float n= 5.2f;
		//automatically appends zero to the rightmost part of decimal//
		System.out.printf("Formatted to specific width n = %.4f\n",n);
		
		n =23.126854f;
		//printing the answer after certain(20) space of character//
		System.out.printf("formatted value of n = %20.7f\n",n);
	}
}