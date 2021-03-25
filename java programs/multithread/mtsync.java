import java.lang.*;
class pyramid
{
	 synchronized void draw_pyramid(char ch)
	{
		for(int i=0;i<10;i+=2)
		{
			for(int k=10;k>0;k-=2)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}

class A extends Thread
{
	pyramid p;
	A(pyramid p)
	{
		this.p=p;
	}
	public void run()
	{
		p.draw_pyramid('*');
	}
}

class B extends Thread
{
	pyramid p;
	B(pyramid p)
	{
		this.p=p;
	}
	public void run()
	{
		p.draw_pyramid('#');
	}
}

class mtsync
{
	public static void main(String arg[])
	{
		pyramid pobj=new pyramid();
		A ta=new A(pobj);
		B tb=new B(pobj);
		ta.start();
		tb.start();
	}
}
	
	