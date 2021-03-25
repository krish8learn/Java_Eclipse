class triangle
{
	double height,base;
	void setvalue(double x,double y)
	{
	    height = x;
		base = y;
	}
	double area()
	{
		return((0.5)*height*base);
	}
}
class calculate
{
	public static void main(String arg[])
	{
		triangle t1 = new triangle();
		t1.setvalue(2,10);
		System.out.println("area = "+t1.area());
		System.out.println("height = "+t1.height);
	}
}