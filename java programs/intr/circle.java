package intr;
 public class circle 
 implements   geoanalyzer
{
	float radius;
	public circle(float r)
	{
		radius = r;
	}
	public float area()
	{
		return (pi*radius*radius);
	}
	public float perimeter()
	{
		return(2*pi*radius);
	}
}