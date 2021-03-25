class a 
{
	public void show()
	{
		System.out.println("calling from a ");
	}
}
class b extends a 
{
	public void show()
	{
		System.out.println("calling from b");
	}
	
	public void display()
	{
		System.out.println("calling from b display");
	}
}

public class demo
{
	public static void main(String args[])
	{
		a x = new b();
		x.show();
		
		b y = (b)x;
		y.display();
		y.show();
		
		a ob = new a();
		ob.show();
	}
}