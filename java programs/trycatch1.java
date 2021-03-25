public class trycatch1
{
	public static void main(String args[])
	{
	try
	{
		int i = args.length; //no argument is given in command line//
		String myString[] = new String[i]; //i = 0, null string pointer error//
		if(args[0].equals("Java"))  //1//
		{
			System.out.println("1st word is java");
		}
		
		System.out.println("number of arguments = " +i);
		 int x = 12/i; //2 due to argument has given in the command arithmetic exception occurs(infinity)//
		 int y[] = {222,555}; //its an array of size 2 (0,1)//
		 y[i] = x;   //3 if i>1 , then index is out of range//
		 System.out.println("value of x and y:  " +x+"  " +y);
	}
	catch (NullPointerException e) //1//
	{
		System.out.println("A null pointer exception has occurred due to absence of input data in command line" +e);
	}
	catch (ArithmeticException e)//2//
	{
		System.out.println("division by zero:  " +e);
	}
	catch (ArrayIndexOutOfBoundsException e) //3//
	{
		System.out.println("array index out of range: "+e);
	}
	}
}