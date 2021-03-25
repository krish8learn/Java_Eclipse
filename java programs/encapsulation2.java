//defining a class called "circle"//
//creating two objects under the class "circle"//
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
		return (22/7)*r*r;
	}
}


class encapsulation2
{
	public static void main(String args[])
	{
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		c1.x = 0.0;
		c1.y = 0.0;
		c1.r = 5.0;
		c2.x = -4.0;
		c2.y = -8.0;
		c2.r = 10.0;
		System.out.println("circumference of circle1= " +  c1.circumference());
		System.out.println("area of circle1= " +  c1.area());
		System.out.println("circumference of circle2= " +  c2.circumference());
		System.out.println("area of circle2= " +  c2.area());
	}
}