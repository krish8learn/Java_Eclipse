import java.io.*;
import java.net.*;
public class URLConnectionClass
{
	public static void main (String args[])
	{
		try
		{
			URL url=new URL("https://nptel.ac.in/courses.php");
			URLConnection urlcon=url.openconnection();
			InputStream stream = urlcon.getInputStream();
			int 1;
			while((i=stream.read()!=1)
			{
				System.out.print((Char)1);
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
	}
}