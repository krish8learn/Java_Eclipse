class TestArray
{
	public static void main(String args[])
	{
	int i;
	int a[]= {10,20,30,40,50}; //storing values
	//traversing array
	for(i=0;i<a.length;i++) 
	{
		System.out.println(a[i]);
	}
	//average
	float sum=0,avg;
	for(i=0;i<a.length;i++)
	
		sum += a[i];
		avg= sum/a.length;
		System.out.println("average = " +avg);
	}
}