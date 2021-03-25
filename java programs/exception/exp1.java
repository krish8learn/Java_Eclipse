public class exp1 
{
	static int anyfunction(int x, int y)
	{
		try
		{
			int a = x/y;
			return a;
		}
		catch(ArithmeticException e)
		{
			System.out.println("division by 0");
		}
		return 0;
	}


public static void main(String arg[])
{
	int a,b,r;
	a= 0;
	b =0;
	//System.out.println("enter the values");
	
	try
	{
	a=Integer.parseInt(arg[0]);
	b=Integer.parseInt(arg[1]);
	System.out.println("the values are   " +a+ "  "+b);
	}
	catch(Exception e){System.out.println("no input given");}
	r=anyfunction(a,b);
	System.out.println("result is :" +r);
}

}	