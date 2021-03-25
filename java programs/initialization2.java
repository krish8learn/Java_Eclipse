//initialization by setpoint method//
class Point
{
	int x,y;
	void setPoint( int a, int b )
	{
		x = a;
		y = b;
	}
}
class initialization2
{
	float distance;
	public static void main(String args[])
	{
		Point p1 = new Point();
		Point p2 = new Point();
		p1.setPoint(14,20);
		p2.setPoint(54,24);
		System.out.println(" x= "+ p1.x);
		System.out.println(" y= "+ p1.y);
		System.out.println(" x= "+ p2.x);
		System.out.println(" y= "+ p2.y);
	}
}
		