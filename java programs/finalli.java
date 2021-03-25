class finalli
{
	public static void main(String [] args)
	{
		int i = 0;
		String greetings[] ={ "hello twinkle!","hello java!","hello world!"};
		while(i<2)
		{
			try
			{
				System.out.println(greetings[i]);
				i++;
			}
			catch(Exception e)
			{
				System.out.println(e.toString()); //message of exception is string format//
			}
			finally
			{
				System.out.println("hi");
				if(i<3);
				else
				{
				System.out.println("should quit and rest index value");break;
				}
			}
		}
	}
}
//the while loop will role for 3 times (0,1,2) but in 3 it will report error as there is no message present//
			
	