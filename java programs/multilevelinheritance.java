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

//creating another level inheritance 

class shipment extends boxweight
{
    double cost;
	
	shipment()
	{
		super();
		cost =0.0;
	}
	
	shipment(double w,double h,double d, double m,double c)
	{
		super (w,h,d,m);
	    cost = c;
	}
}   
// main class//
class multilevelinheritance
{
	public static void main(String args[])
	{
		box mybox1 = new box();   //creating object under parent class//
		boxweight mybox2 = new boxweight(2.0,4.0,1.0,76.0);   //creating object under child class//
        double vol;
		
        vol = mybox1.volume();
        System.out.println("volume of box1 :" +vol);
		System.out.println();
		
		vol = mybox2.volume();
		System.out.println("volume of mybox2 is " +vol);
  		System.out.println("weight of the box :" +mybox2.weight);
		System.out.println();
		
		shipment ship1 = new shipment();
		shipment ship2 = new shipment(10,20,50,54,24);
		
		vol= ship1.volume();
		System.out.println("the volume of ship1 : " +vol);
		System.out.println("the weight of ship1 : " +ship1.weight);
		System.out.println("the cost of ship1 : " +ship1.cost);
		System.out.println();
		
		vol=ship2.volume();
		System.out.println("the volume of ship2 : " +vol);
		System.out.println("the weight of ship2 : " +ship2.weight);
		System.out.println("the cost of ship2 : " +ship2.cost);
		System.out.println();
		
	
	
	
	
	}
}