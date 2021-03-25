//defining a class called "circle"//
//creating an object under the class "circle"//
class Circle
{
	//variables//
	double x,y;
	double r;
	//methods//
	double circumference()
	{
		return 2*3.14*r;
	}
	double area()
	{
		return 3.14*r*r;
	}
}


class encapsulation1
{
	public static void main(String args[])
	{
		Circle c = new Circle();
		c.x = 0.0;
		c.y = 0.0;
		c.r = 5.0;
		System.out.println("circumference" + c.circumference());
		System.out.println("area" + c.area());
	}
}