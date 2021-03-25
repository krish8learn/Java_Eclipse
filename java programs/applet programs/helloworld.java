import java.applet.*;  //loading packages//
import java.awt.*;

public class helloworld extends Applet //inheriting applet class //
{
	public void paint(Graphics g)  //using paint method by object belong to graphic class//
	{
		g.drawString("hello world",40,100);
	}
}