import myinterface.*;

class minterface implements aninterface
{
	public void display()
	{
		System.out.println("fine ");
	}
	
	public static void main(String args[])
	{
		minterface t = new minterface();
		t.display();
		System.out.println("the final value of a : " +a);
	}
}