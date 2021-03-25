
interface intr
{
	public static final double pi = 3.14658;
	public static final double lamda = 4.2569;
	int x =100;
	void method2();
}

class a1 implements intr
{
	public int a = 989;
	public void method2()
	{
		System.out.println("the pi value : " +pi);
	}
	public void method1()
	{
		System.out.println("the lamda value : " +lamda);
	}
}
//the main class//
class int2
{
	public static void main(String args[])
	{
		a1 ab = new a1();
		ab.method2();
		ab.method1();
	}
}

//interface cannot implement an interface//
//method in interface must be declared public//
//interface cannot implement an abstract class vice-versa//
//a method under interface cannot be final but the variable can be final as we can see above in line 4 and 5//
//an interface can inherit(extends) another interface not implement//
//a class can inherit from multiple interfaces at the same level//



