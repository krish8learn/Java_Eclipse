//for loop//
class forloop
{
	public static void main(String args[])
	{
	   int i;
	   System.out.println("the numbers are :");
	   for (i=0;i<10;i++)
	  {
		System.out.print(" " +i);
		if(i%2==0) continue;
		System.out.print(" ");
	  }
	}
}