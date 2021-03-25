//defining two classes called "circle" and "box"//
//creating two object under the class "circle" and "box"//
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

class Box
{
	//variables//
	double w,h,d;
	//methods//
	double area()
	{
		double a;
		a = (w*h+w*d+d*h);
		return a;
	}
	double volume()
	{
		double v;
		v = w*h*d;
		return v;
	}
}


class encapsulation3
{
	public static void main(String args[])
	{
		Circle c = new Circle();
		c.x = 3.0;
		c.y = 4.0;
		c.r = 5.0;
		Box b = new Box();
		b.w = 3.0;
		b.h =4.0;
		b.d =5.0;
		System.out.println("area of box = " + b.area());
		System.out.println("volume of box = " + b.volume());
		System.out.println("circumference" + c.circumference());
		System.out.println("area" + c.area());
	}
}