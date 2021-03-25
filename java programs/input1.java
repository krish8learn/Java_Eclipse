//program for command line--passing input while running the program// 

class input1
{
	public static void main(String[] args)
	{
		if(args.length > 0)
		{
			System.out.println("the command lines arguments are:");
			
			for(String val:args)
				System.out.println(val);
		}
		else
		{
		System.out.print("no command lines argument found.");
		}
		
	}
}