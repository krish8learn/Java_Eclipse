interface i1
{
	double a = 14.9;
	void methodi1();
}

interface i2 extends i1   //inheriting not implementing//
{
	double b = 15.8;
	void methodi2();
}

class c implements i1,i2
{
	public int p = 456;
	
	public void methodi1()
	{
		System.out.println("from i1 :  " +a +b);
	}
	
	public void methodi2()
	{
		System.out.println("from i2 :  " +a +b);
	}
	
	public void method3()
	{
		System.out.println("form class c : " +p);
	}
	
}

class int4
{
	public static void main(String args[])
	{
		c xy = new c();
		xy.methodi1();
		xy.methodi2();
		xy.method3();
	}
}
