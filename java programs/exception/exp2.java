import java.lang.*;

public class exp2 
{
	public static void main(String args[])throws Exception
	{
		int[] array = new int [3];
		int i;
		try
		{
			for (i=0;i<4;++i)
			{
				array[i]=i;
			}
			System.out.println(array);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("fillin " +e.fillInStackTrace());
			System.out.println("cause " +e.getCause());
			System.out.println("local " +e.getLocalizedMessage());
			System.out.println("message " +e.getMessage());
			System.out.println("trace " +e.getStackTrace());
			System.out.println("traces "); e.printStackTrace();
			System.out.println("string "); e.toString() ;
			System.out.println();
			throw(Exception)new Exception().initCause(e);
		}
		finally
		{
			System.out.println(array);
		}
	}
}