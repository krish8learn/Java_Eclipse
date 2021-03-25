//initialization by forcefully(here we have to mention every variables to pass their values from object to class)//
class Point //defining an class//
{
	int x,y; //no method included//
}

class initialization1 //declaring an object under class "point"//
{
	public static void main (String args[])
	{
		Point mypoint = new Point();//including object into class "point" that defined above//
		mypoint.x = 10;//assign values to mypoint's instance variables//
		mypoint.y =20;
		System.out.println("x " + mypoint.x);
		System.out.println("y " + mypoint.y);
	}
}