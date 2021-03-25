//for loop//
class forbreak
{
	public static void main(String args[])
	{
	   int i;
	   System.out.println("the numbers are :");
	   for (i=1; ;i++)
	  {
		if(i%10==0) break;
		System.out.print(" " +i);
	  }
	  System.out.println("the loop complete");
	}
}