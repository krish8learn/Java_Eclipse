import java.applet.Applet;
import java.awt.Graphics;
public class resize extends Applet
{
	public void init()
	{
		resize(500,500); /* to resize applet window*/
	}
	public void paint(Graphics g)
	{
		g.drawString("resized window",50,50);
	}
}