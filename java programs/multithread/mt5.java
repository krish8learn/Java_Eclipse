import java.lang.*;
class I extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("thread I values : " +i);
		}
		System.out.println("exiting from thread I");
	}
}

class J extends Thread
{
	public void run()
	{
		for(int j=0;j<=5;j++)
		{
			System.out.println("thread J values : " +j);
		}
		System.out.println("exiting from thread J");
	}
}

class K extends Thread
{
	public void run()
	{
		for(int k=0;k<=5;k++)
	   {
		    System.out.println("thread K values : " +k);
	   }
	   System.out.println("exiting from thread K ");
	}
}

class mt5
{
	public static void main (String arg[])
	{
		I ti = new I();
		J tj = new J();
		K tk = new K();
		
		ti.setPriority(Thread.MAX_PRIORITY);
		tj.setPriority(tk.getPriority()+5);
		tk.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("start from thread I");
		ti.start();
		System.out.println("start from thread J");
		tj.start();
		System.out.println("start from thread K");
		tk.start();
		
		System.out.println("end of main thread");
	}
}

	  
	
	
			