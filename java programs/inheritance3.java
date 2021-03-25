//inheritance2//
class box
{
	double width;
	double height;
	double depth;
	
	box() //setting up the default constructor//
	{
		width = 0.0;
		height = 0.0;
		depth = 0.0;
	}
	box (double w, double h, double d)
	{
		width = w;
		height = h;
		depth = d;
	}
	
	double volume ()
	{
	return width*height*depth;
	}
	
}
//creating child class//

class boxweight extends box   //inheritance syntax//
{
	double weight;
	
	boxweight()
	{
		super(); // calling the default constructor//
		weight = 0.0;
	}
	
	
	boxweight(double w,double h,double d, double m)
	{
		super(w,h,d);
		weight = m;
	}
}
// main class//
class inheritance3
{
	public static void main(String args[])
	{
		box mybox1 = new box( 10.0,20.0,40.0);   //creating object under parent class//
		boxweight mybox2 = new boxweight(2.0,4.0,1.0,1.0);   //creating object under child class//
        double vol;
        vol = mybox1.volume();
        System.out.println("volume of box1 :" +vol);
		System.out.println();
		
		vol = mybox2.volume();
		System.out.println("volume of mybox2 is " +vol);
  		System.out.println("weight of the box :" +mybox2.weight);
	}
}