//Use of "this" keyword//
class Circle
{
	//variables//
	double x,y;
	double r;
	//constructor//
	Circle( double x,double y,double r)
	{
		this.x=x; this.y=y; this.r=r;
	}
	Circle(double r)
	{
		x=0; y=0; this.r=r;
	}
	Circle(Circle c)
	{
		x=c.x; y=c.y;r=c.r;
	}
	Circle()
	{
		x=0.0; y=0.0; r=1.0;
	}
	//methods//
	double circumference()
	{
		return 2*(22/7)*r;
	}
	double area()
	{
		return (22/7)*r*r;
	}
}

class usethis
{
	public static void main(String args[])
	{
		Circle c1= new Circle(4.0,2.0,7.0);
	    Circle c2= new Circle(14.0);
		Circle c3= new Circle(c1);
		Circle c4= new Circle();
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