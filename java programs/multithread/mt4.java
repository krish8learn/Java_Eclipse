import java.lang.*;
class ABC extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			if(i==1)yield();
			System.out.println("thread ABC values : " +i);
		}
		System.out.println("exiting from thread ABC");
	}
}

class DEF extends Thread
{
	public void run()
	{
		for(int j=0;j<=5;j++)
		{
			System.out.println("thread DEF values : " +j);
			if(j==3) {stop( );}
		}
		System.out.println("exiting from thread DEF");
	}
}

class GHI extends Thread
{
	public void run()
	{
		for(int k=0;k<=5;k++)
	   {
		    System.out.println("thread GHI values : " +k);
			if(k==1)
			{
				try
				{
					sleep(1000);
				}
				catch(Exception e){ System.out.println("Thread GHI in sleep state"); }
			}
	   }
	   System.out.println("exiting from thread GHI ");
	}
}

class mt4
{
	public static void main (String arg[])
	{
		ABC ta = new ABC();
		
		DEF tb = new DEF();
		
		GHI tc = new GHI();
		
		System.out.println("start thread ABC");
		ta.start();
		System.out.println("start thread DEF");
		tb.start();
		System.out.println("start thread GHI");
		tc.start();
		System.out.println("end of main thread");
	}
}

	  
	
	
			