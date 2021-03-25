//constructor overloading( initialization in various way)//
class Circle
{
	//variables//
	double x,y,r;
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
		y = b;    //passing 3 values form object to class//
		r = c;
	}
	Circle(double c)
	{
		x = 0;
		y = 0;    //passing only 1 value which is radius//
		r= c;
	}
	Circle(Circle c)
	{
		x = c.x;
		y = c.y;  //passing the whole object itself//
		r = c.r;
	}
	Circle()      
	{
		x = 0.0;
		y = 0.0;  //does not passing any object so JVM uses the default values in the constructor//
		r = 1.0;
	}
}

class initialization5
{
	public static void main(String arg[])
	{
		Circle c1 = new Circle(3.0,4.0,5.0);
		Circle c2 = new Circle(7.0);
		Circle c3 = new Circle(c1);
		Circle c4 = new Circle();
		System.out.println("circumference of circle1= " +  c1.circumference());
		System.out.println("area of circle1= " +  c1.area());
		System.out.println("circumference of circle2= " +  c2.circumference());
		System.out.println("area of circle2= " +  c2.area());
		System.out.println("circumference of circle3= " +  c3.circumference());
		System.out.println("area of circle3= " +  c3.area());
		System.out.println("circumference of circle4= " +  c4.circumference());
		System.out.println("area of circle4= " +  c4.area());
	}
}