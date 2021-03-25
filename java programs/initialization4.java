//initialization by the constructor//
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
	Circle(double a,double b,double c) //setting the constructor method//
	{
		x = a;
		y = b;
		r = c;
	}
}

class initialization4
{
	public static void main(String arg[])
	{
		Circle c1 = new Circle( 5.0,4.0,5.0);
		Circle c2 = new Circle( 6.0,7.0,10.0);
		System.out.println("circumference of circle1= " +  c1.circumference());
		System.out.println("area of circle1= " +  c1.area());
		System.out.println("circumference of circle2= " +  c2.circumference());
		System.out.println("area of circle2= " +  c2.area());
	}
}