//use of super keyword//
class A
{
	int i;
}

class B extends A
{
	int i; //overrides the i of class ACTIVE
	
	B(int a,int b)
	{
		super.i = a; // class A i//
		i = b;  //class B i//
	}
	
	void show()
	{
		System.out.println(" class A i" +super.i);
		System.out.println("class b i" +i);
	}
}

class superuse
{
	public static void main(String args[])
	{
		B ob = new B(1,4);  //calling the object under class B//
		ob.show();  //calling the method class B
	}
}	