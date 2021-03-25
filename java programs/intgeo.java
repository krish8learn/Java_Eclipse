import myinterface.*;

class intgeo
{
	static void display(float x, float y)
	{
		System.out.println("area =  " +x+ "perimeter =  " +y);
	}
	public static void main(String args[])
	{
		Circle c = new Circle(7.0f);
		Ellipse e = new Ellipse(7.0f,14.0f);
		Rectangle r = new Rectangle(5.0f,4.0f);
		
		geo item;
		
		item = c;
		display(geoitem.area(),geoitem.perimeter());
		
		item = e;
		display(geoitem.area(),geoitem.perimeter());
		
		item = r;
		display(geoitem.area(),geoitem.perimeter());
	}
}