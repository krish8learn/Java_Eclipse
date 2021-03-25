import java.lang.*;
class A2 extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("thread A2 values : " +i);
		}
		System.out.println("exiting from thread A2");
	}
}

class B2 extends Thread
{
	public void run()
	{
		for(int j=0;j<=5;j++)
		{
			System.out.println("thread B2 values : " +j);
		}
		System.out.println("exiting from thread B2");
	}
}

class C2 extends Thread
{
	public void run()
	{
		for(int k=0;k<=5;k++)
	   {
		    System.out.println("thread C2 values : " +k);
	   }
	   System.out.println("exiting from thread C2 ");
	}
}

class mt3
{
	public static void main (String arg[])
	{
		new A2().run();
		new B2().run();
		new C2().run();
	}
}

	  
	
	
			