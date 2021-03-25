import java.io.*;
import java.net.*;
public class URLClass
{
	public static void main(String arg[])
	{
		try
		{
			URL url=new URL("https://nptel.ac.in/courses.php");
			
			System.out.println("protocol: "+url.getProtocol());
			
			System.out.println("Host name: "+url.getHost());
			
			System.out.println("port number: "+url.getPort());
			
		    System.out.println("file name : "+url.getFile());
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
