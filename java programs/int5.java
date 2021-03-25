class a
{
	protected int r = 66;
	public void print()
	{
		System.out.println(" value of r from x :  " +r);
	}
}

interface x
{
	int p = 89;
	void methodx();
}



interface y
{
	int s = 56;
	public void methody();
}

class b extends a implements x,y
{
	public int t = 70;
	public void methodx()
	{
		System.out.println("i am from x interface :  " +p);
	}
	public void methody()
	{
		System.out.println("i am from x interface :  " +s);
	}
	public void printb()
	{
		super.print();        //calling the method form class a//
		methodx();
		methody();
	}
}


class int5
{
	public static void main(String args[])
	{
		b fc = new b();
		fc.printb();
	}
}



	