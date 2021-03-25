import java.lang.*;
class A1 extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("thread A1 values : " +i);
		}
		System.out.println("exiting from thread A1");
	}
}

class B1 extends Thread
{
	public void run()
	{
		for(int j=0;j<=5;j++)
		{
			System.out.println("thread B1 values : " +j);
		}
		System.out.println("exiting from thread B1");
	}
}

class C1 extends Thread
{
	public void run()
	{
		for(int k=0;k<=5;k++)
	   {
		    System.out.println("thread C1 values : " +k);
	   }
	   System.out.println("exiting from thread C1 ");
	}
}

class mt2
{
	public static void main (String arg[])
	{
		new A1().start();
		new B1().start();
		new C1().start();
	}
}

	  
	
	
			