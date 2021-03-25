import java.lang.*;
class A extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("thread A values : " +i);
		}
		System.out.println("exiting from thread A");
	}
}

class B extends Thread
{
	public void run()
	{
		for(int j=0;j<=5;j++)
		{
			System.out.println("thread b values : " +j);
		}
		System.out.println("exiting from thread B");
	}
}

class C extends Thread
{
	public void run()
	{
		for(int k=0;k<=5;k++)
	   {
		    System.out.println("thread C values : " +k);
	   }
	   System.out.println("exiting from thread C ");
	}
}

class mt1
{
	public static void main (String arg[])
	{
		A ta = new A();
		ta.start();
		
		B tb = new B();
		tb.start();
		
		C tc = new C();
		tc.start();
	}
}

	  
	
	
			